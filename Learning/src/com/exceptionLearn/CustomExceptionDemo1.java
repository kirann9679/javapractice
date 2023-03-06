package com.exceptionLearn;

public class CustomExceptionDemo1 {
	
	static void sum(int a,int b) throws MyException
	  {
	    if(a<0)
	    {
	      throw new MyException(a); //calling constructor of user-defined exception class
	    }
	    else if(b<0)
	    {
	      throw new MyException(b); //calling constructor of user-defined exception class
	    }
	    else
	    {
	      System.out.println(a+b);
	    }
	    
	  }

	  public static void main(String[] args)
	  {
	    try
	    {
	      sum(10, -20);
	    }
	    catch(MyException me)
	    {
	      System.out.println(me); //it calls the toString() method of user-defined Exception
	    }
	  }

}
