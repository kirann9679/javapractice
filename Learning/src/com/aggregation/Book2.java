package com.aggregation;

public class Book2 {

	String name;
	int price;
	// author details
	Author auther;
	// publisher details
	Publisher publisher;

	Book2(String n, int p, Author auther, Publisher publisher) {
		this.name = n;
		this.price = p;
		this.auther = auther;
		this.publisher = publisher;
	}

	public static void main(String[] args) {
		
		Author auther = new Author("John", 42, "USA");
		Publisher publisher = new Publisher("Sun Publication", "JDSR-III4", "LA");
		
		Book2 b = new Book2("Java for Beginner", 800, auther, publisher);
		
		System.out.println("Book Name: " + b.name);
		System.out.println("Book Price: " + b.price);
		System.out.println("------------Author Details----------");
		System.out.println("Author Name: " + b.auther.authorName);
		System.out.println("Author Age: " + b.auther.age);
		System.out.println("Author place: " + b.auther.place);
		System.out.println("------------Publisher Details-------");
		System.out.println("Publisher Name: " + b.publisher.name);
		System.out.println("Publisher ID: " + b.publisher.publisherID);
		System.out.println("Publisher City: " + b.publisher.city);
	}

}
