package com.example.misc;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many rows you want:");
		
		int rows = sc.nextInt();
        
        System.out.println("Here is your pattern....!!!");
        
        //Printing upper half
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }
             
            System.out.println();
        }
        
        //Printing lower half
        for (int i = rows-1; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        
        sc.close();
		
	}

}
