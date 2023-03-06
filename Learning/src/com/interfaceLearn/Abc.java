package com.interfaceLearn;

interface Abc {  
    // Default method   
    default void msg(){  
        System.out.println("This is default method");  
    }
    // Static method
    static void msg2(){  
        System.out.println("This is static method");  
    }
    //default method
    default void msg3() {
    	greet3();
    }
    // Abstract method  
    void greet(String msg); 
    // Private method  
    private void greet3() {
    	System.out.println("This is private method"); 
    }
}  