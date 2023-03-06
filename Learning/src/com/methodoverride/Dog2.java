package com.methodoverride;

public class Dog2 extends Animal2 {
	
	protected void eat()   //error
    {
        System.out.println("Dog like to eat meat");
    }
    
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.eat();
    }

}
