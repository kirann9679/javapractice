package singleton;

public class single {
static single s=new single();
private single() {
}
public static single getobj() {
	return s;
}
}
class demo{
	public static void main(String[]args) {
		single s1= single.getobj();
		System.out.println(s1.hashCode());
		single s2=single.getobj();
		System.out.println(s2.hashCode());
	}
}