package com.example.misc;

public class TestDup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="aaapple";
		char ch=s.charAt(0);
		int count=0;
		for(int i=0;i<=s.length()-1;i++){
			if(ch==s.charAt(i))
			{
				count++;
			}
			//System.out.println(count);
		}
		System.out.println(count);
	}

}
