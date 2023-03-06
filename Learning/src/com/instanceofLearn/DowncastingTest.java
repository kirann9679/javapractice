package com.instanceofLearn;

public class DowncastingTest extends Parent {

	public void check() {
		System.out.println("Sucessfull Casting");
	}

	public static void show(Parent p) {
		if (p instanceof DowncastingTest) {
			DowncastingTest b1 = (DowncastingTest) p;
			b1.check();
		}
	}

	public static void main(String[] args) {
		Parent p = new DowncastingTest();
		DowncastingTest.show(p);
	}
}
