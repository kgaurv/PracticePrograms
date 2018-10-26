package com.example.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		/*ArrayList list = new ArrayList();
		list.add(3, "rohan");
		list.add(4, "rohii");*/
		
		hash.put(1, "hashi");
		hash.put(2, "pashi");
		hash.put(3, "rashi");
		hash.put(4, "nashi");
		
		//display content using iterator
		Set set = hash.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()){
			Map.Entry mentry = (Map.Entry)itr.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: "+mentry.getValue());
	         System.out.println();
		}
		
		//get value based on key
		String var = hash.get(3);
		System.out.println("value at place 3" +var);
		
		//remove value based on key
		hash.remove(3);
		System.out.println("Map key and values after removal:");
		Set set1 = hash.entrySet();
		Iterator itr2 = set.iterator();
		
		while(itr2.hasNext()){
			Map.Entry mentry = (Map.Entry)itr2.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: "+mentry.getValue());
	         System.out.println();
		}  		
	}
}
