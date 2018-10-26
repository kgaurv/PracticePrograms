package com.interviews;

import java.util.Scanner;

public class a {

	/**
	 * @param args
	 */
	
	static public int power(int value, int pow){
		int i, j = 0;
		boolean flag=false;
		for (i = 0; i <= value; i++)
		{
			for (j = 0; j <= i; j++)
			{
	    if(pow == 0) 
	    	return 1;
	    else
	    	
	    return (value * power(value, pow -1));
	}}}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value");
		int n=scan.nextInt();
		System.out.println("enter the power");
		int k=scan.nextInt();
		System.out.println("perfect power is "+ power(n, k));
	}

}
