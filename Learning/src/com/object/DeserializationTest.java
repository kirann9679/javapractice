package com.object;

import java.io.*;

class DeserializationTest implements Serializable {
	private String a;

	DeserializationTest(String name) {
		this.a = a;
	}

	public static void main(String[] args) {
		try {
			DeserializationTest b = new DeserializationTest("JavaLearning");
			FileOutputStream c = new FileOutputStream("CoreJava1.txt");
			ObjectOutputStream d = new ObjectOutputStream(c);
			d.writeObject(b);
			d.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
