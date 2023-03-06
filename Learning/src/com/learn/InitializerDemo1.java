package com.learn;


class InitializerDemo1
{
	{
		System.out.println("Welcome to Java Learning");
		System.out.println("This is Initializer block");

	}
	public InitializerDemo1()
	{
		System.out.println("Default Constructor invoked"); 
	}
	public static void main(String as[])
	{
		InitializerDemo1 obj = new InitializerDemo1();
		System.out.println("This is main() method");
	}
}
	
