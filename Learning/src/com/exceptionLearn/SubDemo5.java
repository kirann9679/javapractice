package com.exceptionLearn;

/* Method overriding with parent Exception */

public class SubDemo5 extends Super3 {

	void show() throws Exception {
		System.out.println("child class");
	}

	public static void main(String[] args) {
		try {
			Super3 s = new SubDemo5();
			s.show();
		} catch (Exception e) {
			System.out.println("Exception caught " + e);
		}
	}
}
