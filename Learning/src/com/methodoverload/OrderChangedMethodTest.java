package com.methodoverload;

public class OrderChangedMethodTest {
	
	public static void main(String[] args) {
		OrderChanged obj = new OrderChanged();
		obj.get("Cherry", 1);
		obj.get( 2, "Jhon");
	}

}
