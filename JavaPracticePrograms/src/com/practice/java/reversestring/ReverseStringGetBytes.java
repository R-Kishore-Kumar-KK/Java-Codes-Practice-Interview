package com.practice.java.reversestring;

import java.util.Scanner;

public class ReverseStringGetBytes {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the String:");
		String str = scn.nextLine();
		byte[] arr = str.getBytes();
		byte[] res = new byte[arr.length];
		for(int i=0; i<arr.length; i++) {
			res[i] = arr[arr.length - i - 1];
		}
		scn.close();
		System.out.println("Reversed String: " + new String(res));
	}
}
