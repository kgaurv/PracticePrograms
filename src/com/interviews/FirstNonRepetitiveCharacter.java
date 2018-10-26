package com.interviews;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepetitiveCharacter {

	public static void main(String[] args) {

		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c = firstNonRepeatedChar(s);
		System.out.println("first Nonrepeated char :     " + c);
	}

	private static char firstNonRepeatedChar(String str) {

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		Character c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);
			} else {
				hmap.put(c, 1);
			}
		}

		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (hmap.get(c) == 1) {
				return c;
			}
			
		}

		return 0;
	}

}
