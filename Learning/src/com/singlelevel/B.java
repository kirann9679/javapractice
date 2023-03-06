package com.singlelevel;

/* Here, we can notice that show() method is declared in class A, 
 * but using child class Demo object, we can call it. 
 * That shows the inheritance between these two classes.
 */

public class B extends A{
    
public static void main(String[] args) {
    B b = new B();
    b.show();
        
    }
}

