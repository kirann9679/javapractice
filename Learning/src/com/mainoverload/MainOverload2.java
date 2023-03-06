package com.mainoverload;

/* 
 * Null value is a default value for all the reference types. 
 * It created ambiguity to JVM that reports error.
*/

public class MainOverload2 {
	
	public void test(Integer i) 
    { 
		System.out.println("test(Integer ) "); 
    } 
    public void test(String name) 
    { 
    	System.out.println("test(String ) "); 
    } 
    public static void main(String [] args) 
    { 
    	MainOverload2 obj = new MainOverload2();  
        obj.test(null); 
    } 

}
