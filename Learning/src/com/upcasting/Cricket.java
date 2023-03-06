package com.upcasting;

public class Cricket extends Game {

	public void type() {
		System.out.println("outdoor game");
	}

	public static void main(String[] args) {
		Game gm = new Game();  // parent object
		Cricket ck = new Cricket();  // child object
		
		gm.type();
		ck.type();
		
		gm = ck; // gm refers to Cricket object
		gm.type(); // calls Cricket's version of type
	}

}
