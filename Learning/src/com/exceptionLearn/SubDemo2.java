package com.exceptionLearn;

/* Method overriding in Subclass with UnChecked Exception */

public class SubDemo2 extends Super1 {
	
	void show() throws ArrayIndexOutOfBoundsException
	  { 
	    System.out.println("child class"); 
	  }

	  public static void main(String[] args)
	  {
	    Super1 s = new SubDemo2();
	    s.show();
	  }

}
