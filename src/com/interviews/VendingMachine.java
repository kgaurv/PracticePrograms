package com.interviews;

import java.util.List;


		/*You need to design a Vending Machine which
		 Accepts coins of 1,5,10,25 Cents i.e. penny, nickel, dime, and quarter.
		 Allow user to select products Coke(25), Pepsi(35), Soda(45)
		 Allow user to take refund by canceling the request.
		 Return selected product and remaining change if any
		 Allow reset operation for vending machine supplier.*/

import java.text.NumberFormat;
import java.util.Scanner;

public class VendingMachine
{
    public static void main(String... args)
    {
        Scanner keyboard = new Scanner(System.in);
        double[] prices = new double[] { 1.25, 0.75, 0.9, 0.75, 1.5, 0.75 };
        int item = 0;

        System.out.print("Enter an item number: ");
        item = Integer.parseInt(keyboard.nextLine());
        if (!(item <= prices.length))
        {
            System.out.println("Sorry, we don't have that item in stock.");
            keyboard.close();
            return;
        }

        System.out.print("Enter the amount paid: ");
        double paid = Double.parseDouble(keyboard.nextLine());

        while (paid < (prices[item - 1]))
        {
            System.out.print("You need " + NumberFormat.getCurrencyInstance().format(Math.abs((paid - prices[item - 1]))) + " more for item " + item);
            paid += Double.parseDouble(keyboard.nextLine());
        }
        System.out.println("Thank you for buying item " + item + ", your change is " + NumberFormat.getCurrencyInstance().format((paid - prices[item - 1])) + ". Please come again!");

        keyboard.close();
    }
}



