package com.example.misc;

public class Pojo {

	private int roll;
	private String name;
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	void show(){
		System.out.println(getName() +" " +getRoll());
	}
	
	

}
