package com.methodoverride;

public class Dog3 extends Animal3 {
	
	Dog3 getObj()     //Legal override after Java5 onward
    {   System.out.println("Dog3 object");
        return new Dog3();
    }
    
    public static void main(String[] args) {
        //Dog3 dg = new Dog3();
        new Dog3().getObj();
    }

}
