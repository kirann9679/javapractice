package com.garbagecollection;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		t = null;
		System.gc();
	}

	public void finalize() {
		System.out.println("Garbage Collected");
	}
}
