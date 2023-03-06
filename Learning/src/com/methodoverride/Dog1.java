package com.methodoverride;

public class Dog1 extends Animal1 {

	public void eat() // eat() method overridden by Dog class.
	{
		System.out.println("Dog like to eat meat");
	}

	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.eat();
		System.out.println(" Dog Obbject " +d.toString());
	}

}
