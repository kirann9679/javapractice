package com.exceptionLearn;

/* Method overriding with same Exception */

public class SubDemo3 extends Super2 {
	
	void show() throws Exception
	  { 
	    System.out.println("child class"); 
	  }

	  public static void main(String[] args)
	  {
		try {
	    Super2 s = new SubDemo3();
	    s.show();
		} catch (Exception e) {
			System.out.println("Exception caught" +e);
		}
	  }

}
