package collection;

public class book implements Comparable<book> {
int id;
String author, bookname;
public book(int id,String author, String name) {
	this.id=id;
	this.author=author;
	this.bookname=name;
}
public int compareTo(book b) {
	if(id>b.id) {
		return 1;
	}
	else {
		return -1;
	}
}
}
