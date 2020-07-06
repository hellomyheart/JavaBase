package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String a = "12";
		String b = "x9";
		// TODO: 捕获异常并处理
		int c = stringToInt(a);
		int d;
		try {
			d = stringToInt(b);
		} catch (NumberFormatException e) {
			System.out.println("数据类型转换错误，详情如下：");
			e.printStackTrace();
			d = 1;
		}

		System.out.println(c * d);
	}

	static int stringToInt(String s) {
		return Integer.parseInt(s);
	}
}
