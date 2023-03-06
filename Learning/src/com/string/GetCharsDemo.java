package com.string;

public class GetCharsDemo {
	
	public static void main(String[] args) {
        String a= new String("Hello Welcome to Java Learning");  
        char[] ch = new char[15];  
        try
        {  
            a.getChars(6, 12, ch,3 );  
            System.out.println(ch);  
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        } 
    }

}
