package com.exceptionLearn;

public class ExceptionPropagationDemo1 {
	
	void a1() 
	  { 
	    int data = 30 / 0; 
	  } 
	
	  void a2() 
	  { 
	    a1();  
	  } 
	  
	  void a3() 
	  { 
	    try { 
	      a2();
	    } 
	    catch (Exception e) 
	    { 
	      System.out.println(e); 
	    } 
	  } 

	  public static void main(String args[]) 
	  { 
		ExceptionPropagationDemo1 obj1 = new ExceptionPropagationDemo1(); 
	    obj1.a3(); 
	  } 

}
