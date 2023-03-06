package com.exceptionLearn;

import java.io.*;

public class ExceptionPropagationDemo2 {

	void m1() throws IOException {
		throw new IOException("File Not Found ");
	}

	void n1() throws IOException {
		m1();
	}

	void p1() {
		try {
			n1();
		} catch (Exception e) {
			System.out.println("Exception handled ===> " +e);
		}
	}

	public static void main(String args[]) {
		ExceptionPropagationDemo2 obj = new ExceptionPropagationDemo2();
		obj.p1();
	}
}
