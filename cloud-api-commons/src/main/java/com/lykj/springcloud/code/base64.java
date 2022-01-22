package com.lykj.springcloud.code;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.util.Base64;

public class base64 {

//    public static void main(String[] args) throws Exception {
//        String str = "青锋剑，偃月刀";
//        base64(str);
//        enAndDeCode(str);
//    }
//    /**
//     * Base64
//     */
//    public static void base64(String str) {
//        byte[] bytes = str.getBytes();
//        //Base64 加密
//        String encoded = Base64.getEncoder().encodeToString(bytes);
//        System.out.println("Base 64 加密后：" + encoded);
//        //Base64 解密
//        byte[] decoded = Base64.getDecoder().decode(encoded);
//        String decodeStr = new String(decoded);
//        System.out.println("Base 64 解密后：" + decodeStr);
//        System.out.println();
//    }
//
//    /**
//     * BASE64加密解密 case
//     */
//    public static void enAndDeCode(String str) throws Exception {
//        String data = encryptBASE64(str.getBytes());
//        System.out.println("sun.misc.BASE64 加密后：" + data);
//        String byteArray = decryptBASE64(str);
//        System.out.println("sun.misc.BASE64 解密后：" + new String(byteArray));
//    }

    /**
     * BASE64解密
     *
     * @throws Exception
     */
    public static String decryptBASE64(String key) throws Exception {
        return new String((new BASE64Decoder()).decodeBuffer(key));
    }

    /**
     * BASE64加密
     */
    public static String encryptBASE64(byte[] key) throws Exception {
        return (new BASE64Encoder()).encodeBuffer(key);
    }

}