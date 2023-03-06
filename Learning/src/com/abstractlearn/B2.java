package com.abstractlearn;

public class B2 extends A2 {
	
	public void callme() {
		System.out.println(" Calling .... ");
	}
	
	public static void main(String[] args)
	  {
	    B2 b2 = new B2();
	    b2.callme();
	    b2.show();
	  }

}
