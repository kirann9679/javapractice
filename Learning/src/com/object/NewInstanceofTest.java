package com.object;

import java.lang.reflect.*;

public class NewInstanceofTest {
	private String s;

	NewInstanceofTest() {
	}

	public void setName(String s) {
		this.s = s;
	}

	public static void main(String[] args) {
		try {
			Constructor constructor = NewInstanceofTest.class.getDeclaredConstructor();
			NewInstanceofTest r = (NewInstanceofTest) constructor.newInstance();
			r.setName("JavaLearning");
			System.out.println(r.s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
