package com.staticword;

public class Employee {
	
	int eid;
    String name;
    static String company = "XYZ";

    public void show()
    {
        System.out.println(eid + "-" + name + "-" + company);
    }

    public static void main( String[] args )
    {
        Employee se1 = new Employee();
        se1.eid = 104;
        se1.name = "Abhijit";
        se1.show();

        Employee se2 = new Employee();
        se2.eid = 108;
        se2.name = "ankit";
        se2.show();
    }

}
