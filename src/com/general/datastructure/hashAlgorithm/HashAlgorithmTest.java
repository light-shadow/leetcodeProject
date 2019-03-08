package com.general.datastructure.hashAlgorithm;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * hash碰撞测试
 */
public class HashAlgorithmTest {

    public static void main(String[] args) {

        String str1 = "d131dd02c5e6eec4693d9a0698aff95c2fcab58712467eab4004583eb8fb7f8955ad340609f4b30283e488832571415a" +
                "085125e8f7cdc99fd91dbdf280373c5bd8823e3156348f5bae6dacd436c919c6dd53e2b487da03fd02396306d248cda0e99f33" +
                "420f577ee8ce54b67080a80d1ec69821bcb6a8839396f9652b6ff72a70";

        String str2 = "d131dd02c5e6eec4693d9a0698aff95c2fcab50712467eab4004583eb8fb7f8955ad340609f4b30283e4888325f1415a0" +
                "85125e8f7cdc99fd91dbd7280373c5bd8823e3156348f5bae6dacd436c919c6dd53e23487da03fd02396306d24Beda0e99f3342" +
                "0f577ee8ce54b67080280d1ec69821bcb6a8839396f965ab6ff72a70";

        System.out.println(getHashString(str1).equals(getHashString(str2)));

    }

    public static String getHashString(String str){
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String to encript cannot be null or zero length");
        }
        StringBuffer hexString = new StringBuffer();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] hash = md.digest();
            for (int i = 0; i < hash.length; i++) {
                if ((0xff & hash[i]) < 0x10) {
                    hexString.append("0" + Integer.toHexString((0xFF & hash[i])));
                } else {
                    hexString.append(Integer.toHexString(0xFF & hash[i]));
                }
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hexString.toString();
    }


}
