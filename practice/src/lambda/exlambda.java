package lambda;
interface ant{
	public void show();
}
interface oper{
	int add(int a, int b);
}
public class exlambda {
	public static void main(String[]args) {
		ant an=()->{System.out.println("ok");};
		an.show();
		oper op=(a,b)->{int c=a+b;return c;
	};
	System.out.println(op.add(2, 03));
	}
}
