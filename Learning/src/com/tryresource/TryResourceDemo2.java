package com.tryresource;

/* try with resource statement */

import java.io.*;

public class TryResourceDemo2 {
	
	public static void main(String[] args)
	{
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Personal\\myfile.txt")))
		{
			String str;
			while((str = br.readLine()) != null)
			{
				System.out.println(str);
			}
		}
		catch(IOException ie)
		{  
			System.out.println("I/O Exception "+ie);  
		}
	}

}
