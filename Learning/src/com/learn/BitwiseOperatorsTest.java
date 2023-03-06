package com.learn;

class BitwiseOperatorsTest {
	public static void main(String as[]) {
		int a = 5; // 0101
		int b = 7; // 0111
		int c = 0;

		c = a & b;
		System.out.println("a & b = " + c);

		c = a | b;
		System.out.println("a | b = " + c);

		c = a ^ b;
		System.out.println("a ^ b = " + c);

		c = ~a;
		System.out.println("~a = " + c);

		c = a << 2;
		System.out.println("a << 2 = " + c);

		c = a >> 2;
		System.out.println("a >>2  = " + c);

		c = a >>> 2;
		System.out.println("a >>> 2 = " + c);
	}
}
