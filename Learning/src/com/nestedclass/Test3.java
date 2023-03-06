package com.nestedclass;

public class Test3 {

	public static void main(String[] args) {
		Outer3 ot = new Outer3();
		Outer3.Inner in = ot.new Inner();
		in.show();
	}

}
