package com.test1;

class chain {
	public chain() {
		this(5);
		System.out.println("Default Constructor");
	}

	public chain(int x) {
		this(5, 6);
		System.out.println("Constructor with one Parameter");
		System.out.println("Value of x ==> " + x);
	}

	public chain(int x, int y) {
		System.out.println("Constructor with two Parameter");
		System.out.println("Value of x and y ==> " + x + " " + y);
	}
}