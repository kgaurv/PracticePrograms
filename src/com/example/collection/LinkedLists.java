package com.example.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		ArrayList list = new ArrayList();

			list.add("ashna");
			list.add("dew");
		
	       /*add(String Element) is used for adding 
	        * the elements to the linked list*/
	       linkedlist.add("Item1");
	       linkedlist.add("Item5");
	       linkedlist.add("Item3");
	       linkedlist.add("Item6");
	       linkedlist.add("Item2");
	       
	       linkedlist.addAll(list);

	       /*Display Linked List Content*/
	       System.out.println("Linked List Content: " +linkedlist);

	       /*Add First and Last Element*/
	       linkedlist.addFirst("First Item");
	       linkedlist.addLast("Last Item");
	       System.out.println("LinkedList Content after addition: " +linkedlist);

	       /*This is how to get and set Values*/
	       Object firstvar = linkedlist.get(0);
	       System.out.println("First element: " +firstvar);
	       linkedlist.set(0, "Changed first item");
	       Object firstvar2 = linkedlist.get(0);
	       System.out.println("First element after update by set method: " +firstvar2);

	       /*Remove first and last element*/
	       linkedlist.removeFirst();// remove() and remove first() will do the same thing
	       linkedlist.removeLast();
	       System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

	       /* Add to a Position and remove from a position*/
	       linkedlist.add(0, "Newly added item");
	       linkedlist.remove(2);
	       System.out.println("Final Content: " +linkedlist); 
	       
	       //clone of list
	       Object str = linkedlist.clone();
	       System.out.println("cloned List: " +str);
	       
	       //check if list contains element
	       boolean var = linkedlist.contains("Item1");
	       if(var){
	    	   System.out.println("true");
	       }else
	    	   System.out.println("false");
	       
	       //get first element
	       Object str1 = linkedlist.getFirst();
	       Object str2 = linkedlist.getLast();
	       
	       System.out.println("first in List: " +str1);
	       System.out.println("last in List: " +str2);
	       
	       //get index of
	       int i = linkedlist.indexOf("Item6");
	       System.out.println("index ov item6t: " +i);
	       
	       int pos = linkedlist.lastIndexOf("ashna");
	       System.out.println("last index : " +pos);
	       
	       //return and remove the first item of the list
	       Object o = linkedlist.poll(); // poll and pollfirst do the same thing
	       System.out.println(" List: " +o);
	       Object o1 = linkedlist.pollLast(); 
	       System.out.println(" List: " +o1);

	       //remove particular element
	       linkedlist.remove("Item6");
	       System.out.println("LinkedList Content after removing: " +linkedlist);
	       
	     /*  //remove first and last occurence of string
	       linkedlist.removeFirstOccurrence("ashna");
	       System.out.println(" removeFirstOccurrence : " +linkedlist);
	       linkedlist.removeLastOccurrence("ashna");
	       System.out.println("removeLastOccurrence : " +linkedlist);*/
	       
	       //set the element
	       linkedlist.set(3, "delloite");
	       System.out.println("LinkedList Content after set: " +linkedlist);
	       
	       //size of list
	       int m = linkedlist.size();
	       System.out.println("Size: " +m);
	       
	       //clear all elements of list
	       linkedlist.clear();
	       System.out.println("Final list: " +linkedlist); 
	       
	     }
	}


