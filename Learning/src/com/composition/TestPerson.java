package com.composition;

public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person();
        long salary = person.getSalary();
    	System.out.println(salary);
    }

}
