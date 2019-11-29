package com.injured.commons.encrypt;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;

public class DES {

	public DES(String desKey) {
        this.desKey = desKey.getBytes();
    }


    public byte[] desEncrypt(byte plainText[]) throws Exception {
        SecureRandom sr = new SecureRandom();
        byte rawKeyData[] = desKey;
        DESKeySpec dks = new DESKeySpec(rawKeyData);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        javax.crypto.SecretKey key = keyFactory.generateSecret(dks);
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cipher.init(1, key, sr);
        byte data[] = plainText;
        byte encryptedData[] = cipher.doFinal(data);
        return encryptedData;
    }


    public byte[] desDecrypt(byte encryptText[]) throws Exception {
        SecureRandom sr = new SecureRandom();
        byte rawKeyData[] = desKey;
        DESKeySpec dks = new DESKeySpec(rawKeyData);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        javax.crypto.SecretKey key = keyFactory.generateSecret(dks);
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cipher.init(2, key, sr);
        byte encryptedData[] = encryptText;
        byte decryptedData[] = cipher.doFinal(encryptedData);
        return decryptedData;
    }


    public String encrypt(String input) throws Exception {
        return new String(Base64.encode(desEncrypt(input.getBytes("UTF-8"))));
    }


    public String decrypt(String input) throws Exception {
        byte result[] = Base64.decode(input);
        return new String(desDecrypt(result), "UTF-8");
    }


    public String encrypt2(String input) throws Exception {
        return new String(desEncrypt(input.getBytes("UTF-8")), "UTF-8");
    }


    public String decrypt2(String input) throws Exception {
        return new String(desDecrypt(input.getBytes("UTF-8")), "UTF-8");
    }


    public static void main(String args[]) throws Exception {
        String key = "1111111111111111111111111111111111111111111111111111111111111111111111111";
        String input = "OG673L44Qayn7TdOSFthDAjxjqcsWkeSGcqU+yndQeci2O/o2TV6HW5wWw48oXjG4udZLmzitjEbeYgyXnKjTO/M/F3oqQkUjZReIMz3Ql+Vr3brokkDN6rJc1hUtTJxOoQYDk7wB7eIhjggkG3UxW5ytMf4HSuA";
//        String str = "{\"result\":\"no\",\"pid\":\"20150313114455\"}";
        String str="{\"credit_product_id\":\"121212\",\"order_amount\":\"123\",\"order_date\":\"2016-11-09 12:12:12\",\"order_wares\":[{\"num\":\"3\",\"unit_price\":\"50\",\"ware_code\":\"123312\",\"ware_name\":\"苹11果\"},{\"num\":\"10\",\"unit_price\":\"1000\",\"ware_code\":\"454356\",\"ware_name\":\"苹22果\"}],\"seller_buyer_id\":\"dsafasfafafas\",\"seller_id\":\"5\",\"seller_order_id\":\"33333233\"}";
        DES crypt = new DES(key);
        System.out.println((new StringBuilder("Encode:")).append(crypt.encrypt(str)));
        System.out.println((new StringBuilder("Decode:")).append(crypt.decrypt(crypt.encrypt(str))));
    }

    private byte desKey[];
	
}
