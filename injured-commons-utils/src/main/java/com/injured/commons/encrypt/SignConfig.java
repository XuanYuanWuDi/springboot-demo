package com.injured.commons.encrypt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;


public class SignConfig {
	
	private static Logger logger = LogManager.getLogger(SignConfig.class);
	
	//MD5签名
	public static String MD5="MD5";
	
	//RSA签名
	public static String RSA="0001";
	
	// 签名方式，选择项：0001(RSA)、MD5
	public static String SIGNTYPE = "0001";
	
	/**
	 * MD5 key
	 */
	public static String KEY = "";

	public static String PRIVATE_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAIz53gmEABykt6DkxqSpZ62P45Qmxb69ernBIW9aDAk+5oQOLvCrN8YDpQ1UU6WfFkhqqGbORS+Yinw/zdR8fRfs/QzHAHKIpIIJWjL9CiYsl4wlbTsf7Z4jat632ahsvPgqNpZgclmov5NyFfEQT6F7CtMS3p9CKFZZ2vWLy9K3AgMBAAECgYEAhBKbF+MYj70pY4yxJRaoUQwas3NXkwjE7z2ma0G7QPYy08jN5R8jE1nayZAVBXbzU0jJF/drDdok85564PT344OjKLjBFdeBBZFznQYCa8hO+/lUMHivFe9gAOE3NksXby2okRTQQy3F2P3K1x1tBUfCzOb1e5uVWjEKnwesO4ECQQDtFG0LDINgR1npeHjD6ug1mtb4hwyGJnXq0O/MD9FW+/OiQQ0CnHbtbtXWNfjPo5ahb32T6h6Sf6sDIVaS7z+XAkEAmDoHMmsBOdSgJ5UDwiBX+sLzTMUvcHW7cd/BRKHSvTPx9JwFtmPzEVYqiw5FybCtCn1nBGlQQcedy2bFuxBp4QJBAIhW+9Kj0pW20s1CW+kHmZziPAhW2ev4CE4O9CidXB0y7cx8rne29WncGJuFFF6MzF5wmH5M4GINi5JURM5hSmcCQHFHVU22hR4E1P0/jaFrMi0/34+0eN3mLovJ52dsSIdVXWsao8GbVSkEhvodr98r40kYEo4c1IVux0SygNf4meECQAe3bDHX5svWlS3z7bTg7cXKcYiMAE5iar13T4K8TTYi8EUeWOIHHC7/liH/rys2hxm81WeqGc2yvpVfEnVE9kY=";

	public static String LKL_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCxFGntnQjj6rnGIIh7iveeEmMAI7VrI8fo8IRFQC6WV7xczLpK2So3KT5m/b47utvnKsJ7mKuRzRz9pqEOBeH0p1G8o2MZlDXSIhBEehg/kEyIliBzkqmc2eW9krZrUU4qL/Bvbzy+2Hfl/NLMwFbCrzWNvF+LEK/NRSXgjYAccQIDAQAB";


	
	public static String ALGORITHM="RSA";
	
	public static PrivateKey pkey ;
	
	public static PublicKey pubkey ;
	
    /**
	* 得到私钥对象
	* @param key 密钥字符串（经过base64编码的秘钥字节）
	* @throws Exception
	*/
	public static PrivateKey getPrivateKey(String privateKey)  {
		try {
		byte[] keyBytes;
		
		keyBytes = Base64.decode(privateKey);
		
		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
		
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		
		PrivateKey privatekey = keyFactory.generatePrivate(keySpec);
		
		return privatekey;
		}catch(Exception e){
			logger.error("",e);
		}
		return null;
	}
	
	 
    /**
	* 获取公钥对象
	* @param key 密钥字符串（经过base64编码秘钥字节）
	* @throws Exception
	*/
	public static PublicKey getPublicKey(String publicKey) {

		try {
			
			byte[] keyBytes;
			
			keyBytes = Base64.decode(publicKey);
			
			X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
			
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			
			PublicKey publickey = keyFactory.generatePublic(keySpec);
			
			return publickey;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("",e);
		}
		return null;
		
	}
}
