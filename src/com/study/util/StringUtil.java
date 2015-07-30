package com.study.util;

import org.apache.commons.lang.RandomStringUtils;

public class StringUtil {
	/**
	 * 将数字转换成26进制字符
	 * @param num
	 * @return
	 */
	private static String numberToLetter(Long num) {
		String str[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
				"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W",
				"X", "Y", "Z" };
		StringBuffer str1 = new StringBuffer();
		while (num != 0) {
			str1 = str1.append(str[(int)(num % 26)]);
			num = num / 26;
		}
		return reverse(str1.toString());
	}
	/**
	 * 字符串翻转
	 * @param s
	 * @return
	 */
	private static  String reverse(String s) {
		char[] str = s.toCharArray();
		int begin = 0;
		int end = s.length() - 1;
		while (begin < end) {
			str[begin] = (char) (str[begin] ^ str[end]);
			str[end] = (char) (str[begin] ^ str[end]);
			str[begin] = (char) (str[end] ^ str[begin]);
			begin++;
			end--;
		}
		return new String(str);
	}
	/**
	 * 随机生成字符串
	 * @param length 随机字符串长度
	 * @return
	 */
	private static String getRandomString(int length){
		return RandomStringUtils.randomAlphanumeric(8);
	}
	public static void main(String[] args) {
	}
}
