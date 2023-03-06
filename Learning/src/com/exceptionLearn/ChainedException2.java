package com.exceptionLearn;

/* NumberFormatException was thrown but the actual cause of exception was a null pointer exception */

public class ChainedException2 {

	public static void main(String[] args) {
		try {

			NumberFormatException a = new NumberFormatException("====> Exception");

			a.initCause(new NullPointerException("====> Actual cause of the exception"));

			throw a;
		}

		catch (NumberFormatException a) {

			System.out.println(a);
			System.out.println(a.getCause());
		}
	}
}
