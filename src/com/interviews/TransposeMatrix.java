package com.interviews;

public class TransposeMatrix {
	
	public static void main(String[] args) throws java.lang.Exception {
		int[] ar = new int[10];
		ar[1] = 1;
		ar[2] = 2;
		ar[3] = 3;
		ar[4] = 4;
		ar[5] = 5;
		ar[6] = 6;
		ar[7] = 7;
		ar[8] = 8;
		ar[9] = 9;
		int n = 1;
		int m = 0;
		System.out.println("The Original Matrix is");
		for (int i = 1; i <= 3; i++) {

		for (int j = n; j <= (i * 3); j++) {
		System.out.print(" " + ar[j]);
		System.out.print(" ");
		m = n++;
		}

		n = m + 1;
		System.out.println();

		}
		System.out.println();
		System.out.println("After Rotating it to 90 degree");

		for (int i = 3; i > 0; i--) {
		for (int j = i; j <= 9;) {
		System.out.print(" " + ar[j]);
		System.out.print(" ");
		j = j + 3;
		}
		System.out.println("");
		}

		}
		}
