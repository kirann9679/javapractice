package com.mainoverload;

public class MainOverload3 
{ 
    public void test(Integer i) 
    { 
    	System.out.println("Method ==> test(Integer)"); 
    } 
    public void test(String name) 
    { 
    	System.out.println("Method ==> test(String) "); 
    } 
    public static void main(String [] args) 
    { 
    	MainOverload3 obj = new MainOverload3 ();  
    	Integer a = null;
    	obj.test(a); // Integer Object 
    	String b = null;
    	obj.test(b); // String Object
    } 
}
   
