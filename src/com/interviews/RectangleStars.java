package com.interviews;


import java.util.Scanner;
public class RectangleStars {
 
	public static void main(String[] args) {
		
	int num=3;
	int n=1;
		 for(int i=1;i<=num+1;i++)
		   {
		      for(int j=1;j<=num;j++)
		      {
		         if(i>=2 && i<=num && j==(num+1)/2)
		         {
		             System.out.print(n);
		             n++;
		         }
		         else{
		        	 System.out.print(num);}

		      }
		      System.out.println("");
		   }
}}