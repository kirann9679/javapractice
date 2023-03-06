package com.stringBuffer;

/*  Empty constructor reserves space for 16 characters. Therefore the output is 16. */

public class CapacityDemo {
	
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		System.out.println( str.capacity() );
	}

}
