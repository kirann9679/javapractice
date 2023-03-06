package com.nestedclass;

/* Example of Inner Class */

public class Outer1 {

	public void display() {
		Inner in = new Inner();
		in.show();
	}

	class Inner {
		public void show() {
			System.out.println("Inside inner");
		}
	}

}
