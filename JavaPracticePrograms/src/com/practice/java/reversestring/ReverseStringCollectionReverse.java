package com.practice.java.reversestring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ReverseStringCollectionReverse {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = scn.nextLine();
		char[] arr = str.toCharArray();
		List<Character> li = new ArrayList<Character>();
		for (Character character : arr) {
			li.add(character);
		}
		Collections.reverse(li);
		ListIterator<Character> lt = li.listIterator();
		System.out.print("Reversed String: ");
		while(lt.hasNext()) {
			System.out.print(lt.next());
		}
		scn.close();
	} 
}
