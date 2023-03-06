package com.exceptionLearn;

public class ThrowDemo {

	static void avg() {
		try {
			throw new ArithmeticException("throw demo");
		} catch (ArithmeticException e) {
			System.out.println("Exception Caught");
		}
	}

	public static void main(String[] args) {
		avg();
	}

}
