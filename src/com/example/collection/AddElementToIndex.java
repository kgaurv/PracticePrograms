
package com.example.collection;

import java.io.IOException;
import java.util.ArrayList;

public class AddElementToIndex {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		ArrayList list = new ArrayList();
		
		list.add("Ashna");
		list.add(7);
		list.add("sweet");
		
		/*
	      Please note that add method DOES NOT overwrites the element previously
	      at the specified index in the list. It shifts the elements to right side
	      and increasing the list size by 1.
	    */
		
		list.add(1, "INSERTED ELEMENT");
		
		System.out.println("Array list Contains");
		for(int i =0; i<=list.size(); i ++){
			System.out.println(list.get(i));
		}
		
		
	}
}
