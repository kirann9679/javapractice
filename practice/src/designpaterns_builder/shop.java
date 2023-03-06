package designpaterns_builder;

public class shop {
	public static void main(String[]args) {
		
//phone p1 =new phoneBuilder().setOs("IOS").setRam(24).setProcessor("M").setScreensize(12).setBattery(3000).getphone();
//System.out.println(p1);
phone p2 =new phoneBuilder().setRam(24).getphone();
System.out.println(p2);
	}
}
