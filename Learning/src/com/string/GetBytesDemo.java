package com.string;

public class GetBytesDemo {
	
	 public static void main(String[] args) {
	        String a = "JavaLearning";  
	        byte[]b = a.getBytes();  
	        for(int i = 0;i < b.length;i++)
	        {  
	            System.out.println(b[i]);  
	        }
	    }

}
