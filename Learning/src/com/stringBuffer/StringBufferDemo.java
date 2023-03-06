package com.stringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		// modifying object
		sb.append("Learning");
		System.out.println(sb); // Output: JavaLearning

	}

}
