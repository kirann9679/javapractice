package com.learn;

class two {
	static {
		System.out.println("inside parent Static block");
	}
	{
		System.out.println("inside parent initialisation block");
	}

	two() {
		System.out.println("inside parent constructor");
	}
}
