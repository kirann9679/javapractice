package com.exceptionLearn;

/* Method overriding with No Exception */

public class SubDemo4 extends Super2 {

	void show() // Correct
	{
		System.out.println("child class");
	}

	public static void main(String[] args) {
		try {
			Super2 s = new SubDemo4();
			s.show();
		} catch (Exception e) {
			System.out.println("Exception caught " + e);
		}
	}
}
