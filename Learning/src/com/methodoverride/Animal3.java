package com.methodoverride;

public class Animal3 {
	
	Animal3 getObj()
    {
        System.out.println("Animal object");
        return new Animal3();
    }

}
