package com.alok.encryption;

import java.security.SecureRandom;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.MACSigner;

public class JweSample {
	public static void main(String[] args) throws KeyLengthException, JOSEException {
		JWSObject jwsObject = new JWSObject(new JWSHeader(JWSAlgorithm.HS256), new Payload("Hello, world!"));

//We need a 256-bit key for HS256 which must be pre-shared
		byte[] sharedKey = new byte[32];
		new SecureRandom().nextBytes(sharedKey);

//Apply the HMAC to the JWS object
		jwsObject.sign(new MACSigner(sharedKey));

//Output in URL-safe format
		System.out.println(jwsObject.serialize());
	}
}
