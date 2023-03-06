package com.learn;

public class NestedIfTest {
	public static void main(String[] args) {
		int age = 25;
		int weight = 70;
		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You are eligible");
			}
		}
	}
}
