package com.interfaceLearn;

public class Demo implements Abc {
	
	public void greet(String msg) { // implementing abstract method
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		
		Abc.msg2(); //calling static method
		d.msg(); // calling default method
		
		d.greet("Say Hi"); // calling abstract method
		
		d.msg3(); // calling private method

	}
}
