package prototype_pattern;

public class book {
private int bid;
private String bname;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
@Override
public String toString() {
	return "book [bid=" + bid + ", bname=" + bname + "]";
}

}
