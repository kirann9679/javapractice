package com.object;

public class NewInstanceTest {
	String a = "JavaLearning";

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		try {
			Class b = Class.forName("NewInstance");
			NewInstanceTest c = (NewInstanceTest) b.newInstance();
			System.out.println(c.a);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
