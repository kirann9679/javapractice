package com.nestedclass;

/* Anonymous class Example */

public class AnimalTest {
	public static void main(String args[]) {
		Animal an = new Animal() {
			public void type() {
				System.out.println("Anonymous animal");
			}
		};
		an.type();
	}
}
