package com.string;

public class JoinDemo {

	public static void main(String[] args) {
		String s = String.join("*", "Welcome to Java Learning");
		System.out.println(s);
		String date1 = String.join("/", "11", "01", "2023");
		System.out.println("Date: " + date1);
		String time1 = String.join(":", "2", "39", "10");
		System.out.println("Time: " + time1);
		
		System.out.println("Final String " +s);
	}

}
