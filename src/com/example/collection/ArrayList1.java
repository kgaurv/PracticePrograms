package com.example.collection;
import java.util.ArrayList;

public class ArrayList1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("ashi");
		list.add("ashii");
		list.add("ash");
		list.add("ashna");
		
		// add at particular index
		list.add(3, "rohan");
		list.add(4, "rohii");
		for(int i =0; i<list.size(); i ++){
			System.out.println(list.get(i));
		}		
		//remove element
		list.remove("ash");
		list.remove("rohii");
		for(int i =0; i<list.size(); i ++){
			System.out.println(list.get(i));
		}
		
		// remove at index
		list.remove(1);
		for(int i =0; i<list.size(); i ++){
			System.out.println(list.get(i));
		}
		
		//set data at particular index
		list.set(2 , "Tom");
		for(int i =0; i<list.size(); i ++){
			System.out.println(list.get(i));
		}		
		//get index of
		int pos = list.indexOf("ash");
		System.out.println("Current array list has following elements:"+ pos);
		
		// get element at index
		String str = (String) list.get(1);
		System.out.println("Current array list has following elements:"+ str);
		
		//get size of array list
		int num= list.size();
		System.out.println("Current array list has following elements:"+ num);
		
		//check if element is there in list
		list.contains("rohii");
		
		//clear elemnts of list
		list.clear();
		for(int i =0; i<list.size(); i ++){
			System.out.println(list.get(i));
		}
	}

}
