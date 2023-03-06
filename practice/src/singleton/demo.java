package singleton;


class demo{
	public static void main(String[]args) {
		si s1= si.getobj();
		s1.i=10;
		s1.show();
		System.out.println(s1.hashCode());
		si s2=si.getobj();
		s2.i=122;
		s1.show();
		System.out.println(s2.hashCode());
	}
}
