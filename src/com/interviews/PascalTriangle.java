package com.interviews;

import java.util.Scanner;

public class PascalTriangle
{
	
	static void binomialCoeff(int n, int k,int v)
	{
	int C[][] = new int[n+1][k+1];
	int i, j = 0;
	boolean flag=false;
	for (i = 0; i <= n; i++)
	{
		for (j = 0; j <= min(i, k); j++)
		{
			if (j == 0 || j == i){
				C[i][j] = 1;
			}
			else{
				C[i][j] = C[i-1][j-1] + C[i-1][j];
				if(C[i][j]==v){
					System.out.println((i+1)+":"+(j+1));
				System.out.println(C[i-1][j-1]+"+"+C[i-1][j]+"="+v);
				System.out.println(C[i][j]+":"+C[i-1][j]+":"+C[i-2][j-1]+":"+C[i-3][j-2]+":"+C[i-4][j-3]);
				flag=true;
				break;
				}
			}
		}
		if(flag)
			break;
	}
	}

	static int min(int a, int b)
	{
	return (a<b)? a: b; 
	}

	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the row");
	int n=scan.nextInt();
	System.out.println("enter the coulmn");
	int k=scan.nextInt();
	System.out.println("enter the value to find");
	int v=scan.nextInt();
	print(n);
    
	binomialCoeff( n,  k, v);
	scan.close();
	}
	
	public static void print(int n) {
        for (int i = 0; i < n; i++) {
             for (int k = 0; k < n - i; k++) {
                  System.out.print(" "); // print space for triangle like structure
             }
             for (int j = 0; j <= i; j++) {
                  System.out.print(pascal(i, j) + " ");
             }
             System.out.println();
        }
    }

    public static int pascal(int i, int j) {
        if (j == 0 || j == i) {
           return 1;
        } else {
           return pascal(i - 1, j - 1) + pascal(i - 1, j);
        }
    }
}

