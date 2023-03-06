package com.methodoverload;

public class MethodOverloadWithTypePromotion {

	void sum(int l, long b) {
		System.out.println("Sum is " + (l + b));
	}

	void sum(int l, int b, int h) {
		System.out.println("Sum is " + (l + b + h));
	}

	public static void main(String[] args) {
		MethodOverloadWithTypePromotion ar = new MethodOverloadWithTypePromotion();
		ar.sum(8, 5);
		ar.sum(8, 4, 3);
	}

}
