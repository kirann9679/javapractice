package com.string;

public class ValueOfDemo {
	public static void main(String[] args) {
        int num = 35;
        String s1 = String.valueOf(num);    //converting int to String
        System.out.println(s1);
        System.out.println("type of num is: "+s1.getClass().getName());   
   }
}
