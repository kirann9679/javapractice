package com.methodoverload;

class OrderChanged {

	public void get(String name, int id) {
		System.out.println("Company Name :" + name);
		System.out.println("Company Id :" + id);
	}

	public void get(int id, String name) {
		System.out.println("Company Id :" + id);
		System.out.println("Company Name :" + name);
	}
}
