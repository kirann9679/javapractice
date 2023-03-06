package streamsss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class func {
public static void main(String[]args) {
	List<String>str=Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
	List filter=new ArrayList();
	
	long count=str.stream().filter(str1->str1.isEmpty()).count();
	System.out.println(count);
	filter=str.stream().filter(str1->!str1.isEmpty()).collect(Collectors.toList());
	System.out.println(filter);
String merge=str.stream().filter(i->i.length()==3).collect(Collectors.joining(","));
System.out.println(merge);
	List<Integer> squ=Arrays.asList(1,2,3,4,5);
	List squrr=squ.stream().map(i->i*i).collect(Collectors.toList());
	System.out.println(squrr);
	IntSummaryStatistics i=squ.stream().mapToInt(a->a).summaryStatistics();
	System.out.println(i.getMax());
System.out.println(i.getMin());
Random r=new Random();
r.ints().limit(5).sorted().forEach(System.out::println);

}
}