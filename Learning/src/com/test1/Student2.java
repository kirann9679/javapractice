package com.test1;


public class Student2{      
 
	 String name;
	 int rollno;
	 int age;
	 
	void info(){
	  System.out.println("Name: "+name);
	  System.out.println("Roll Number: "+rollno);
	  System.out.println("Age: "+age);
	}  
	
	
	public static void main(String[] args) {
		Student2 student = new Student2();
		
		// Calling method
		student.info();
		
	}
}  
	
