package cn.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *��װ������ܼ����㷨
 * @author asus1
 *
 */
public class Salt {
	private static final String SALT="���Ƕ�����";
	public static String md5Salt(String password){
		return DigestUtils.md5Hex(password+SALT);
	}
}
