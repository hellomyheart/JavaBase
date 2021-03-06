package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		System.out.println(tax(2000, 0.1));
		try {
			System.out.println(tax(-200, 0.1));
			System.out.println(tax(2000, -0.1));
		} catch (IllegalArgumentException e) {
			System.out.println("有问题");
		}

	}

	static double tax(int salary, double rate) {
		// TODO: 如果传入的参数为负，则抛出IllegalArgumentException
		if (salary < 0 || rate < 0)
			throw new IllegalArgumentException();
		System.out.println("如果正常运行，能够打印，抛出异常，不能执行");
		return salary * rate;
	}
}
