package prototype_pattern;

public class demo {
	public static void main(String[]args) throws CloneNotSupportedException {
bookshop bs=new bookshop();
bs.setShopname("Himalaya book world");
bs.loaddata();





bookshop bs1=bs.clone();
bs.getB().remove(1);
bs1.setShopname("kirannnn");
System.out.println(bs);
System.out.println(bs1);

}
}
