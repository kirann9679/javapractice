package com.exceptionLearn;

import java.io.IOException;

/* Method overriding in Subclass with Checked Exception */

public class SubDemo1 extends Super1{
	
	void show() throws IOException {
		System.out.println(" child Class ");
	}
	
	public static void main(String[] args) {
		Super1 s = new SubDemo1();
		s.show();
	}

}
