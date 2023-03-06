package com.learn;

public class one extends two {
	static {
		System.out.println("inside static block");
	}

	one() {
		System.out.println("inside constructor of child");
	}

	{
		System.out.println("inside initialization block");
	}

	public static void main(String[] args) {
		new one();
		// new one();
		System.out.println("inside main");
	}
}
