package com.string;

public class CompareToDemo {
	
	public static void main(String[] args) {  
    	
		String s1 = "Abhi";
    	String s2 = "Viraaj";
    	String s3 = "Abhi";
    	
    	int a = s1.compareTo(s2);     //return -21 because s1 < s2 
    	System.out.println(a);
    	
    	a = s1.compareTo(s3);     //return 0 because s1 == s3 
    	System.out.println(a);
    	
    	a = s2.compareTo(s1);     //return 21 because s2 > s1
    	System.out.println(a);
    }  

}
