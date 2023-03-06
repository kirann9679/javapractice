package com.object;

public class CloneMethodTest implements Cloneable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	String s = "JavaLearning";

	public static void main(String[] args) {
		CloneMethodTest a = new CloneMethodTest();
		try {
			CloneMethodTest b = (CloneMethodTest) a.clone();
			System.out.println(b.s);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
