package com.interviews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class countOfNum {
		public static void main(String[] args) {

			System.out.println("Enter the String");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			char c = countOfNumbers(s);
		}

		private static char countOfNumbers(String str) {

			HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
			Character c;
			for (int i = 0; i < str.length(); i++) {
				c = str.charAt(i);
				if (hmap.containsKey(c)) {
					hmap.put(c, hmap.get(c) + 1);
				} else {
					hmap.put(c, 1);
				}
				
			}System.out.println(hmap);
			
			 Character minKey = null;
			    int minValue = Integer.MAX_VALUE;
			    for ( Character c1 : hmap.keySet()) {
			        int value = (Integer) hmap.get(c1);
			        if (value < minValue) {
			            minValue = value;
			            minKey =  c1;
			        }
			    }
			    System.out.println(minKey);
			return 0;
			
			
		}
	}