package com.practice.java.reversestring;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringStack {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = scn.nextLine();
		Stack<Character> s  = new Stack<Character>();
		for (Character character : str.toCharArray()) {
			s.push(character);
		}
		String res = "";
		while(!s.isEmpty()) {
			res = res + s.pop();
		}
		System.out.println("Reversed String: " + res);
		scn.close();
	}
}
