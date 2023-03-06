package collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
	public static void main(String[]args) {
		Deque<String> h=new LinkedList<String>();
		h.add("okkk");
		h.add(null);
		h.add("no");
		h.add("no");
		h.add("yes");
		h.add("maybe");
		System.out.println(h);
}
}