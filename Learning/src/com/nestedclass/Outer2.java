package com.nestedclass;

/* Example of Inner class inside a method(local inner class) */

public class Outer2 {

	int count;

	public void display() {
		for (int i = 0; i < 5; i++) {
			// Inner class defined inside for loop
			class Inner {
				public void show() {
					System.out.println("Inside inner " + (count++));
				}
			}

			Inner in = new Inner();
			in.show();
		}
	}

}
