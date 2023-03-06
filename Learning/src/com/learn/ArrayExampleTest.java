package com.learn;

class ArrayExampleTest {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		for (int x : arr) {
			System.out.println(x);
		}

		// assigning a value

		arr[1] = 105;
		System.out.println("element at first index: " + arr[1]);
	}
}
