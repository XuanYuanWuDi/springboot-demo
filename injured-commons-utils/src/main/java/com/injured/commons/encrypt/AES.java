package com.injured.commons.encrypt;

import org.apache.commons.lang3.StringUtils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Base64;

public class AES {
	private static final String defaultCharset = "UTF-8";
	private static final String KEY_AES = "AES";
	private static final String KEY_MD5 = "MD5";
	private static MessageDigest md5Digest;

	static {
		try {
			md5Digest = MessageDigest.getInstance(KEY_MD5);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	public static String encrypt(String data, String key) {

		return doAES(data, key, Cipher.ENCRYPT_MODE);
	}

	public static String decrypt(String data, String key) {
		return doAES(data, key, Cipher.DECRYPT_MODE);
	}

	private static String doAES(String data, String key, int mode) {

		try {
			if (StringUtils.isBlank(data) || StringUtils.isBlank(key)) {
				return null;
			}

			boolean encrypt = mode == Cipher.ENCRYPT_MODE;
			byte[] content;
			if (encrypt) {
				content = data.getBytes(defaultCharset);

			} else {
				content = Base64.decodeBase64(data.getBytes(defaultCharset));

			}
			// 创建密钥
			SecretKeySpec keySpec = new SecretKeySpec(md5Digest.digest(key.getBytes(defaultCharset)), KEY_AES);
			// 创建密码器
			Cipher cipher = Cipher.getInstance(KEY_AES);
			// 初始化
			cipher.init(mode, keySpec);

			byte[] result = cipher.doFinal(content);

			if (encrypt) {
				return new String(Base64.encodeBase64(result));

			} else {
				return new String(result, defaultCharset);

			}
		} catch (Exception e) {
			System.err.println("AES密文处理异常" + e);
			e.printStackTrace();

		}
		return null;
	}
}
