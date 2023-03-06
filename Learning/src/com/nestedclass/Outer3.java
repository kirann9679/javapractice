package com.nestedclass;

/* Example of Inner class instantiated outside Outer class */

public class Outer3 {

	int count;

	public void display() {
		Inner in = new Inner();
		in.show();
	}

	class Inner {
		public void show() {
			System.out.println("Inside inner " + (++count));
		}
	}
}
