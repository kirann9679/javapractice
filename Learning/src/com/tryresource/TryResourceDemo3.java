package com.tryresource;

/* create object outside the try-with-resource and then refer inside it  */

import java.io.*;

public class TryResourceDemo3 {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		BufferedReader br = new BufferedReader(new FileReader("d:\\myfile.txt"));
		try(br)  // resource is declared outside the try
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
