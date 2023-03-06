package com.test2;

import com.test1.ProtectedDemo;

public class ProtectedDemoChild extends ProtectedDemo {
	int a = 10;
	protected void show() {
		System.out.println(" Protected Method " +a);
	}

}
