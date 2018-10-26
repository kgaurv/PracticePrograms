package com.example.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountDup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word="Apple";
char ch[]=word.toCharArray();
Map<Character, Integer>map=new TreeMap<Character,Integer>();
for(Character c:ch){
	Integer count=map.get(c);
	map.put(c, (count==null ?1:count+1));
}
System.out.println(map);
	}

}
