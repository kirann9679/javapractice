package com.thisword;

public class Demo1 {

	Double width, height, depth;

	Demo1(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public static void main(String[] args) {
		Demo1 d = new Demo1(10, 20, 30);
		System.out.println("width = " + d.width);
		System.out.println("height = " + d.height);
		System.out.println("depth = " + d.depth);
	}

}
