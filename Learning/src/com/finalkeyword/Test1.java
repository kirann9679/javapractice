package com.finalkeyword;

/* Final Variable */

public class Test1 {

	final int a = 10;

	public static void main(String[] args) {
		Test1 test = new Test1();
		test.a = 15; // compile error
		System.out.println("a = " + test.a);
	}
}
