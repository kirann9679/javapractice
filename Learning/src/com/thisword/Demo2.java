package com.thisword;

/* call a constructor from inside the another constructor by using this keyword */

public class Demo2 {
	
	Demo2() {
		this("Java Learning");
	}
	
	Demo2(String str) {
		System.out.println(str);
	}
	
	public static void main (String[] args) {
		Demo2 d = new Demo2();
	}
	

}
