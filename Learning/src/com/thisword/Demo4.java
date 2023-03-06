package com.thisword;

/* want to return current object from a method then we can use this to solve this problem */

public class Demo4 {
	
	public void getName()
	{
	 System.out.println("Java Learning");
	}

	public Demo4 display()
	{
	 // return current object
	 return this;
	}
	
	
	public static void main(String[] args) {
		Demo4 d = new Demo4();
		Demo4 d1 = d.display();
		d1.getName();
	}

}
