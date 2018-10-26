package com.arrays;

import java.io.IOException;
import java.util.Scanner;

public class KadaneAlgo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the number of test cases/ arrays u want");
		Scanner scan = new Scanner(System.in);
		Integer n = scan.nextInt();
		
		for (int k=1;k<n-1; k++){
		
		System.out.println("Enter the number of elements in array");
		Integer m = scan.nextInt();
		System.out.println("Enter the elements in array");
		int arr[] = new int[m] ;
		int p;
		for(p=1;p<=m-1;p++){
	         arr[p]=scan.nextInt();
		}
		int sum= arr[p]+arr[p+1];
		System.out.println(sum);
		}
	}

}
