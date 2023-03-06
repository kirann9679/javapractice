package com.StringTokenizer;

import java.util.StringTokenizer;

public class TokenizerSpaceDemo {

	public static void main(String args[]) {
		StringTokenizer obj = new StringTokenizer("Welcome to Java Learning", " ");
		while (obj.hasMoreTokens()) {
			System.out.println(obj.nextToken());
		}
	}

}
