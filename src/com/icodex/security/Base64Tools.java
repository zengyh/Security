package com.icodex.security;

import java.io.IOException;

import org.apache.commons.codec.binary.Base64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * @编写人： yh.zeng
 * @编写时间：2016-7-28 下午10:45:53
 * @文件描述: todo
 */
public class Base64Tools {

	/**
	 * JDK的Base64加密
	 * @param txt  明文
	 * @return
	 */
	public static String jdkBase64Encode(String txt) {
		BASE64Encoder encoder = new BASE64Encoder();
		return encoder.encode(txt.getBytes());
	}
	
	/**
	 * JDK的Base64解密
	 * @param ciphertxt 密文
	 * @return
	 * @throws IOException
	 */
	public static String jdkBase64Decode(String ciphertxt) throws IOException {
		BASE64Decoder decoder = new BASE64Decoder();
		return new String(decoder.decodeBuffer(ciphertxt));
	}
	
	
	/**
	 * commonsCodec的Base64加密
	 * @param txt  明文
	 * @return
	 */
	public static String commonsCodecBase64Encode(String txt){
		return  new String(Base64.encodeBase64(txt.getBytes()));
	}
	
	
	/**
	 * commonsCodec的Base64解密
	 * @param chiphertxt  密文
	 * @return
	 */
	public static String commonsCodecBase64Decode(String chiphertxt){
		byte[] decodeBytes = Base64.decodeBase64(chiphertxt.getBytes());
		return new String(decodeBytes);
	}
}
