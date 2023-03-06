package com.StringBuilder;

public class ReplaceDemo {
	
	public static void main(String[] args) {
	    StringBuilder sb = new StringBuilder("Java is a programming language");
	    System.out.println(sb);
	    // replacing object
	    sb.replace( 10, 21, "computer");
	    System.out.println(sb);
	  }

}
