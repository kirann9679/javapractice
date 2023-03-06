package com.exceptionLearn;

/* Only one exception will be processed */

public class MultipleExceptionDemo {

	public static void main(String[] args) {
		try {
			int a[] = new int[10];
			System.out.println(a[20]);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception --> " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception --> " + e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
