package com.test1;

public class Demo2 {

	static Demo get(int x, int y) {
		return new Demo(x * y, (double) x / y, (x + y));
	}

	public static void main(String[] args) {
		Demo ans = get(25, 5);
		System.out.println("Multiplication = " + ans.a);
		System.out.println("Division = " + ans.b);
		System.out.println("Addition = " + ans.c);

	}
}
