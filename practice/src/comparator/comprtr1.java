package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comprtr1 {
int rollno;
String name;
public comprtr1(int rollno, String name) {
	this.rollno=rollno;
	this.name=name;
}
}
class demo{
	public static void main(String[]args) {
		Comparator<comprtr1> com=new Comparator<comprtr1>() {
			public int compare(comprtr1 o1, comprtr1 o2) {
				if(o1.rollno>o2.rollno) {
					return 1;
				}
				else {
					return -1;
				}
			}
	};
	
	comprtr1 c1= new comprtr1(57,"kiran");
	comprtr1 c2= new comprtr1(47,"kir");
	comprtr1 c3= new comprtr1(12,"ki");
	ArrayList<comprtr1> l=new ArrayList<comprtr1>();
	l.add(c1);
	l.add(c2);
	l.add(c3);
	for(comprtr1 c:l) {
		System.out.println("rollno: "+c.rollno+" name: "+c.name);
	}
	Collections.sort(l,com);
	
	
}

}