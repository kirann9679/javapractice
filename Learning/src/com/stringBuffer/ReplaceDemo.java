package com.stringBuffer;

public class ReplaceDemo {
	
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello World");
		str.replace( 6, 11, "java");
		System.out.println(str);
	}

}
