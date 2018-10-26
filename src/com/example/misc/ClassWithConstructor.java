package com.example.misc;

public class ClassWithConstructor {
	
	
	int id;
	String name;
	ClassWithConstructor(int id, String name){
		
		this.id= id;
		this.name= name;
		
	}

	void show(){
		System.out.println(id +" "+ name);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassWithConstructor cons = new ClassWithConstructor(7 , "ashii");
		cons.show();

	}

}
