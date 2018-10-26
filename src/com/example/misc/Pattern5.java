package com.example.misc;

import java.util.Scanner;

public class Pattern5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many rows you want:");
		
		int rows = sc.nextInt();
        
        System.out.println("Here is your pattern....!!!");
        
        for (int i = 1; i  <= rows; i++) 
        {
            for (int j = rows; j >= i; j--)
            {
                System.out.print( j+" ");
            }
             
            System.out.println();
        }
        
        sc.close();
	}

}
