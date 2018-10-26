package com.example.misc;

public class FirstNonRepeatedChar {

	public static Character getFirstNonRepeatedChar( String input){
		byte[] flag=new byte[256];
		
		for(int i=0; i<=input.length()-1;i++){
			flag[(int) input.charAt(i)]++;
		}
		for(int i=0; i<=input.length()-1;i++){
			if(flag[ input.charAt(i)]==1){
				return input.charAt(i);
			}
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.println(getFirstNonRepeatedChar("Apple"));

	}

}
