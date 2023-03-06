package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmp {
public static void main(String[]args) {
	HashMap<String,Integer> h=new HashMap<>();
	h.put("sunny", 17);
	h.put("kiran", 19);
	h.put("reddy", 21);
	System.out.println("before "+h);
	h.put("kiran", 23);
	System.out.println("after "+h);
	Set<Map.Entry<String,Integer>> st=h.entrySet();
	for(Map.Entry<String,Integer> f:st) {
		System.out.println(f.getKey());
		System.out.println(f.getValue());
	}
}
}
