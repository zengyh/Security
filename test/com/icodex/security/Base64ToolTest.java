package com.icodex.security;

import java.io.IOException;
import junit.framework.TestCase;
import org.apache.log4j.Logger;


/**
 * @编写人： yh.zeng
 * @编写时间：2016-7-29 上午12:26:12
 * @文件描述: todo
 */
public class Base64ToolTest extends TestCase {

	Logger logger = Logger.getLogger(Base64ToolTest.class);
	private String txt = "Hello World!";

	public void testJDKBase64Encode() {
		logger.debug("testJDKBase64Encode 明文：" + txt);
		logger.debug("testJDKBase64Encode 加密后的密文："
				+ Base64Tools.jdkBase64Encode(txt));
	}

	public void testJDKBase64Decode() throws IOException {
		String ciphertxt = Base64Tools.jdkBase64Encode(txt);
		assertEquals(txt, Base64Tools.jdkBase64Decode(ciphertxt));
	}
	
	public void testCommonsCodecBase64Encode(){
		logger.debug("testCommonsCodecBase64Encode 明文：" + txt);
		logger.debug("testCommonsCodecBase64Encode 加密后的密文："
				+ Base64Tools.commonsCodecBase64Encode(txt));
	}

	public void testCommonsCodecBase64Decode() {
		String ciphertxt = Base64Tools.commonsCodecBase64Encode(txt);
		assertEquals(txt, Base64Tools.commonsCodecBase64Decode(ciphertxt));
	}
}
