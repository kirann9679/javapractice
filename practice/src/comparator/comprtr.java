package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comprtr {
public static void main(String[]args) {
	Comparator<String> comp=new Comparator<String>() {
		public int compare(String o1, String o2) {
			if(o1.length()>o2.length()) {
			return 1;
		}
			else {
				return -1;
			}
		}
		
	};
	ArrayList<String> ar=new ArrayList<>();
	ar.add("ab");
	ar.add("bacd");
	ar.add("ba");
	ar.add("iouthy");
	ar.add("x");
	Collections.sort(ar,comp);
	System.out.println(ar);
}
}
