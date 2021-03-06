/*******************************************************************************
 * Copyright (C) 2016 Sam Silverberg sam.silverberg@gmail.com	
 *
 * This file is part of OpenDedupe SDFS.
 *
 * OpenDedupe SDFS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * OpenDedupe SDFS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package org.opendedup.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.InetAddress;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Date;

import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.x509.X509V1CertificateGenerator;
import org.opendedup.logging.SDFSLogger;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.openssl.jcajce.JcaPEMWriter;

@SuppressWarnings("deprecation")
public class KeyGenerator {

	public static void generateKey(File key) throws KeyStoreException, NoSuchAlgorithmException, CertificateException,
			IOException, NoSuchProviderException, InvalidKeyException, SignatureException {
		key.getParentFile().mkdirs();
		key.delete();
		String keyFile = new File(key.getParentFile(), "tls_key").getPath();
		KeyStore keyStore = KeyStore.getInstance("JKS");
		keyStore.load(null, null);
		String hostName = InetAddress.getLocalHost().getHostName();

		// yesterday

		// GENERATE THE PUBLIC/PRIVATE RSA KEY PAIR
		KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "BC");
		keyPairGenerator.initialize(4096, new SecureRandom());

		KeyPair keyPair = keyPairGenerator.generateKeyPair();

		// GENERATE THE X509 CERTIFICATE
		X509V1CertificateGenerator certGen = new X509V1CertificateGenerator();

		certGen.setSerialNumber(BigInteger.valueOf(System.currentTimeMillis()));
		certGen.setIssuerDN(new X509Principal("CN=" + hostName + ", OU=None, O=None L=None, C=None"));
		certGen.setSubjectDN(new X509Principal("CN=" + hostName + ", OU=None, O=None L=None, C=None"));
		certGen.setNotBefore(new Date(System.currentTimeMillis() - 1000L * 60 * 60 * 24 * 30));
		certGen.setNotAfter(new Date(System.currentTimeMillis() + (1000L * 60 * 60 * 24 * 365 * 10)));
		certGen.setPublicKey(keyPair.getPublic());
		certGen.setSignatureAlgorithm("SHA256WithRSAEncryption");

		X509Certificate cert = certGen.generate(keyPair.getPrivate(), "BC");

		keyStore.setKeyEntry("sdfs", keyPair.getPrivate(), "sdfs".toCharArray(),
				new java.security.cert.Certificate[] { cert });
		Key pvt = keyPair.getPrivate();
		Key pub = keyPair.getPublic();
	    PemObject pemObject = new PemObject("PRIVATE KEY", pvt.getEncoded());
		JcaPEMWriter pemWriter = new JcaPEMWriter(new OutputStreamWriter(new FileOutputStream(keyFile + ".key")));
		try {
			pemWriter.writeObject(pemObject);
		} finally {
			pemWriter.close();
		}
		keyStore.store(new FileOutputStream(key), "sdfs".toCharArray());
		pemObject = new PemObject("CERTIFICATE", cert.getEncoded());
		pemWriter = new JcaPEMWriter(new OutputStreamWriter(new FileOutputStream(keyFile + ".pem")));
		try {
			pemWriter.writeObject(pemObject);
		} finally {
			pemWriter.close();
		}
	    pemObject = new PemObject("PUBLIC KEY", pub.getEncoded());
		pemWriter = new JcaPEMWriter(new OutputStreamWriter(new FileOutputStream(keyFile + ".pub")));
		try {
			pemWriter.writeObject(pemObject);
		} finally {
			pemWriter.close();
		}
		SDFSLogger.getLog().info("generated certificate for ssl communication at " + key);
	}

	

	static {
		// adds the Bouncy castle provider to java security
		Security.addProvider(new BouncyCastleProvider());
	}

	

	

}
