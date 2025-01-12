package com.practice.java.reversestring;

import java.util.Scanner;

public class ReverseStringCharArray {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = scn.nextLine();
		char[] arr = str.toCharArray();
		System.out.print("Reversed String: ");
		for(int i=arr.length -1; i>=0; i--) {
			System.out.print(arr[i]);
		}
		scn.close();
	}
}
