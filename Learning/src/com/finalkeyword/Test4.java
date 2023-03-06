package com.finalkeyword;

/* Blank Final Variable */

public class Test4 {

	final int a;

	Test4() {
		// initialized blank final
		a = 10;
	}

	public static void main(String[] args) {

		Test4 demo = new Test4();
		System.out.println("a = " + demo.a);

	}

}
