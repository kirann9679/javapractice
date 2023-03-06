package singleton;

class si {
	static si s=new si();
	private si() {
	}
	public static si getobj() {
		return s;
	}
	int i;
	public void show() {
		System.out.println(i);
	}
	}
	  
