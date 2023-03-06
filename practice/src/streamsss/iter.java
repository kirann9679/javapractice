package streamsss;

import java.util.stream.Stream;

public class iter {
public static void main(String[]args) {
	Stream.iterate(1, a->a+1).filter(a->a%2==0).limit(20).forEach(System.out::println);
}
}
