package com.practice.java.reversestring;

import java.util.Scanner;

public class ReverseStringBuilder {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the String:");
		String str = scn.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		scn.close();
		System.out.println("Reversed String: " + sb);
	}
}
