package com.aggregation;

class Book {
	String name;
	int price;
	// author details
	Author author;

	Book(String n, int p, Author author) {
		this.name = n;
		this.price = p;
		this.author = author;
	}

	public static void main(String[] args) {
		Author author = new Author("John", 42, "USA");
		Book b = new Book("Java for Begginer", 800, author);
		
		System.out.println("Book Name: " + b.name);
		System.out.println("Book Price: " + b.price);
		System.out.println("------------Auther Details----------");
		System.out.println("Author Name: " + b.author.authorName);
		System.out.println("Author Age: " + b.author.age);
		System.out.println("Author place: " + b.author.place);
	}

}
