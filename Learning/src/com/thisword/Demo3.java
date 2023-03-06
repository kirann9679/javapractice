package com.thisword;

/*  use of this keyword that allows to access method */

public class Demo3 {
	
	public void getName()
	{
	 System.out.println("Java Learning");
	}

	public void display()
	{
	 this.getName();
	}
	
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		d.display();
	}
}
