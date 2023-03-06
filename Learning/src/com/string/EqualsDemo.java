package com.string;

public class EqualsDemo {
	
	public static void main(String[] args) {  
    	String s = "Hell";
    	String s1 = "Hello";
    	String s2 = "Hello";
    	boolean b = s1.equals(s2);    //true
    	System.out.println(b);
    	b =	s.equals(s1) ;   //false
    	System.out.println(b);
    }  

}
