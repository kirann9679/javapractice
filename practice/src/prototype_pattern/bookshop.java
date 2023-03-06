package prototype_pattern;

import java.util.ArrayList;
import java.util.List;

public class bookshop implements Cloneable{
private String shopname;
List<book> b=new ArrayList<>();
public String getShopname() {
	return shopname;
}
public void setShopname(String shopname) {
	this.shopname = shopname;
}
public List<book> getB() {
	return b;
}
public void setB(List<book> b) {
	this.b = b;
}
	public void loaddata() {
		for(int i=1;i<10;i++) {
			book bk=new book();
			bk.setBname("book="+i);
			bk.setBid(i);
			getB().add(bk);
		}
	}
	
@Override
	protected bookshop clone() throws CloneNotSupportedException {
		bookshop bs2=new bookshop();
		for(book br: this.getB()) {
			bs2.getB().add(br);
		}
		return bs2;
	
	}
@Override
public String toString() {
	return "bookshop [shopname=" + shopname + ", b=" + b + "]";
}

}
