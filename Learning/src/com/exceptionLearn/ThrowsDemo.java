package com.exceptionLearn;

public class ThrowsDemo {
	
	static void check() throws ArithmeticException {
		System.out.println("Inside check method ");
		throw new ArithmeticException("throws custom message for Arithmetic");
	}
	
	public static void main(String[] args) {
		try {
			check();
		} catch (ArithmeticException e) {
			System.out.println("caught Exception " +e);
		}
	}
}

