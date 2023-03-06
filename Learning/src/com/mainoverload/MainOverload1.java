package com.mainoverload;

public class MainOverload1 {
	
	public static void main(int args) 
    { 
         System.out.println("Main Method with int argument Executing"); 
         System.out.println(args);
    }

	public static void main(char args) {
		System.out.println("Main Method with char argument Executing");
		System.out.println(args);
	}

	public static void main(Double[] args) {
		System.out.println("Main Method with Double Executing");
		System.out.println(args);
	}

	public static void main(String[] args) {
		System.out.println("Original main Executing");
		MainOverload1.main(12);
		MainOverload1.main('c');
		MainOverload1.main(1236);
	}
}
