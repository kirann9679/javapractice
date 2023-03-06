package copywritearrylist;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public class copywritearry {
	
	public static void mian(String[]args) {
		CopyOnWriteArrayList<String> c=new CopyOnWriteArrayList<>();
		c.add("1");
		c.add("2");
		c.add("3");
		
		System.out.println("before any mod : "+c);
		Iterator i=c.iterator();
		while(i.hasNext()) {
			String s=(String) i.next();
			System.out.println(s);
		}
		
	}
	}

