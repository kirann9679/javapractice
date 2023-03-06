package com.exceptionLearn;

/* ArithmeticException was thrown by the program but the real cause of exception was IOException */

import java.io.*;

public class ChainedException1 {
	
	public static void divide(int a, int b)
    {
      if(b == 0)
      {
        ArithmeticException ae = new ArithmeticException("top layer");
        ae.initCause(new IOException("cause"));
        throw ae;
      }
      else
      {
        System.out.println(a/b);
      }
    }

    public static void main(String[] args)
    {
      try 
      {
        divide(5, 0);
      }
      catch(ArithmeticException ae) {
        System.out.println( "caught : " +ae);
        System.out.println("actual cause: "+ae.getCause());
      }
    }

}
