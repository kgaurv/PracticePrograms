package com.example.collection;

import java.util.ArrayList;
import java.util.Vector;

public class AddElementsOfOtherCollection {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("Ashan");
		list.add("ashi");
		list.add("dfhd");
		list.add("djsbfks");

		Vector v = new Vector();

		v.add(1);
		v.add(2);

		/*
		 * To append all elements of another Collection to ArrayList use boolean
		 * addAll(Collection c) method. It returns true if the ArrayList was
		 * changed by the method call.
		 */

		list.addAll(v);

		System.out.println("Array list Contains");
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
