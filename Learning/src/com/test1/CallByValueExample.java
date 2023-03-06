package com.test1;

 class CallByValueExample {
	
	public void callByValue(int x) {
		x = 100;
	}

	public static void main(String[] args) {
		int x = 50;
		CallByValueExample t = new CallByValueExample();
		t.callByValue(x); // function call
		System.out.println(x);
	}

}
