package com.learn;

class TernaryOperatorTest {
	
	public static void main(String as[]) {
		int a, b;
		a = 20;
		b = (a == 1) ? 30 : 40;
		System.out.println("Value of b is : " + b);

		b = (a == 20) ? 30 : 40;
		System.out.println("Value of b is : " + b);
	}
}
