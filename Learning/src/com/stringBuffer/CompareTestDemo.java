package com.stringBuffer;

/*  String objects are immutable objects. Hence, if we concatenate on the same String object, 
 * it won't be altered But StringBuffer creates mutable objects. Hence, it can be altered.
 */

public class CompareTestDemo {
	public static void main(String args[])
	 {
	  String str = "Java";
	  str.concat("Learning");
	  System.out.println(str);      // Output: Java

	  StringBuffer strB = new StringBuffer("Java");
	  strB.append("Learning");
	  System.out.println(strB);    // Output: JavaLearning
	 }
}
