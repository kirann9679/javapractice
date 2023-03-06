package collection;

import java.util.PriorityQueue;

public class priorqueue {
public static void main(String[]args) {
	PriorityQueue<book> p=new PriorityQueue<>();
	book b1=new book(45,"kiran","maths");
	book b2=new book(55,"suuny","meth");
	book b3=new book(75,"sai","mat");
	p.add(b1);
	p.add(b2);
	p.add(b3);
	for(book b:p) {
	System.out.println(b.id+b.author+b.bookname);
	}
	p.remove(b1);
	for(book b:p) {
		System.out.println(b.id+b.author+b.bookname);
		}
}
}
