package com.string;

public class IndexofDemo {
	
	 public static void main(String[] args) {
	        String str="JavaLearningearn";
	        
	        System.out.println(str.indexOf('v'));    
	        System.out.println(str.indexOf('a',1));     
	        String subString="earn";
	        
	        System.out.println(str.indexOf(subString)); 
	        System.out.println(str.indexOf("earn",5));    
	        System.out.println(str.indexOf(subString,11));   // -1 indicates that substring is not found
	    }

}
