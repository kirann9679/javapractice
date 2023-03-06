package com.methodoverride;

public class Demo {

	private double a, b;

	public Demo(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return String.format(a + " + i" + b);
	}

}
