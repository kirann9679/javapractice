package com.stringBuffer;

public class EnsureCapacityDemo {
	
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		System.out.println( str.capacity()); //output: 16 (since empty constructor reserves space for 16 characters)
		str.ensureCapacity(30); //greater than the existing capacity
		System.out.println( str.capacity()); //output: 34 (by following the rule - (oldcapacity*2) + 2.) i.e (16*2)+2 = 34.
	}

}
