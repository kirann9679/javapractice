package com.finalkeyword;

/* Static Blank Final Variable */

public class Test5 {

	static final int a;

	static {
		// initialized static blank final
		 a = 15;
	}

	public static void main(String[] args) {

		System.out.println("a = " + Test5.a);

	}

}
