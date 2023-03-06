package com.instanceofLearn;

public class Test1 {

	public static void main(String[] args) {
		Parent p = new Parent();     // parent object
		Child1 c1 = new Child1();    // child1 object
		Child2 c2 = new Child2();    // child2 object

		System.out.println(c1 instanceof Parent); // true
		System.out.println(c2 instanceof Parent); // true
		System.out.println(p instanceof Child1); // false
		System.out.println(p instanceof Child2); // false

		p = c1;
		System.out.println(p instanceof Child1); // true
		System.out.println(p instanceof Child2); // false

		p = c2;
		System.out.println(p instanceof Child1); // false
		System.out.println(p instanceof Child2); // true

	}

}
