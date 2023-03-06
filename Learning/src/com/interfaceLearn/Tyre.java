package com.interfaceLearn;

/* Example for implementing Multiple Interfaces */

public class Tyre implements Moveable1, Rollable {

	int width;

	public boolean isMoveable() {
		return true;
	}

	public boolean isRollable() {
		return true;
	}

	public static void main(String args[]) {
		Tyre tr = new Tyre();
		System.out.println(tr.isMoveable());
		System.out.println(tr.isRollable());
	}

}
