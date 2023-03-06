package com.test2;

public class Child extends Parent {

	public void c1() {
		System.out.println("Child method");
	}

	public static void main(String[] args) {
		Child cobj = new Child();
		cobj.c1(); // method of Child class
		cobj.p1(); // method of Parent class
	}
}