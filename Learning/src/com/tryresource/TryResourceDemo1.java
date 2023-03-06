package com.tryresource;

import java.io.*;

/* try and catch block */

class TryResourceDemo1 {
	public static void main(String[] args) {
		try {
			String str;
			// opening file in read mode using BufferedReader stream
			BufferedReader br = new BufferedReader(new FileReader("C:\\Personal\\myfile.txt"));
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close(); // closing BufferedReader stream
		} catch (IOException ie) {
			System.out.println("I/O Exception " + ie);
		}
	}
}
