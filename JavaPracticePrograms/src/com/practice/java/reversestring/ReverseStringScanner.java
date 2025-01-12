package com.practice.java.reversestring;

import java.util.Scanner;

public class ReverseStringScanner {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter The String: ");
		if(scn.hasNextLine()) {
			String str = scn.nextLine();
			StringBuilder sb  = new StringBuilder();
			for(int i=str.length()-1; i>=0; i--) {
				sb.append(str.charAt(i));
			}
			System.out.println("Reversed String: " + sb.toString());
		} else {
			System.out.println("No input Provided");
		}
		scn.close();
	}
}

