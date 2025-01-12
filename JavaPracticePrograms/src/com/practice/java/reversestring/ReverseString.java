package com.practice.java.reversestring;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the String:");
		String str = scn.nextLine();
		String str2 = "";
		char ch;
		for(int i=0; i<str.length();i++) {
			ch = str.charAt(i);
			str2 = ch + str2;
		}
		scn.close();
		System.out.println("The reversed String: " + str2);
	}
}
