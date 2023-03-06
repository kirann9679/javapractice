package com.learn;


class StaticDemo2
{
	static
	{
		System.out.println("Welcome to Java Learning");
		System.out.println("This is static block I");

	}
	public static void main(String as[])
	{
		System.out.println("**********************");
		System.out.println("This is main() method");
	}
	static
	{
		System.out.println("**********************");
		System.out.println("This is static block II");

	}
	static
	{
		System.out.println("**********************");
		System.out.println("This is static block III");

	}
}
	
