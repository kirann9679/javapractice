package streamsss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class strem2 {
public static void main(String[]args) {
	List<product> prlist=new ArrayList<>();
	prlist.add(new product(1,"hp",30200f));
	prlist.add(new product(2,"pr",90000f));
	prlist.add(new product(3,"p",12000f));
	prlist.add(new product(4,"h",36000f));
	List<Float> pr=prlist.stream().filter(a->a.price<40000f).map(a->a.price).collect(Collectors.toList());
	System.out.println(pr);
}
}
 class product{
	int id;
	String name;
	float price;
	public product(int id, String name, float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}