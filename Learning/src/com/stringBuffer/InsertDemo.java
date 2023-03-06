package com.stringBuffer;

public class InsertDemo {
	
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("test");
		str.insert(2, 123);
		System.out.println(str);
	}

}
