package com.practice.java.reversestring;

import java.util.Scanner;

public class ReverseStringStringBuffer {

	public static void main(String[] args) {
		
		Scanner scn  = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = scn.nextLine();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println("Reversed String: " + sb);
		scn.close();
	}
}
