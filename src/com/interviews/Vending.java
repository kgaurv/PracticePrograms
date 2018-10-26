package com.interviews;

	import java.util.*; 
	 
	public class Vending {
	    public static void main (String[] args) {
	         
	        boolean exit = false; 
	        String choice; 
	        String coin;
	        String first ="You have choosen ";
	        String second =", please pay ";
	        String third = " pence and type select when done; ";
	        String coinsacc = "Coins accepted: 1,2,5,10 and 20: ";
	        String in = "Insert coin: ";
	        String water1 = "water";
	        String coca = "cola";
	        String juicy ="juice";
	        String thanks = "Thank you. No change.";
	        String thank = "Thank you. Your change is: ";
	        String back = " pence remaining.";
	        String not = "Not enough paid ";
	        String pence = " pence.";
	        String select = "select";
	        final int juice = 15;
	        final int water = 10;
	        final int cola = 12;
	         
	        Scanner console = new Scanner(System.in); 
	        while (!exit) { 
	        System.out.println("Choose your drink ");
	        System.out.println("Water press w ");
	        System.out.println("Cola  press c ");
	        System.out.println("Juice press j ");
	        System.out.print("Your choice: ");
	        choice = console.next(); 
	         
	        if (choice.equalsIgnoreCase("w")) {
	            System.out.println(first + water1 + second + water + third);
	            System.out.println(coinsacc);
	            int amount = 0; 
	             while (amount < 100000000) { 
	                 System.out.println(in);
	                 coin = console.next(); 
	                if (coin.equals("1")) {
	                    amount += 1;
	                } else if (coin.equals("2")) {
	                    amount += 2;
	                } else if (coin.equals("5")) {
	                    amount += 5; 
	                } else if (coin.equals("10")) {
	                    amount += 10; 
	                } else if (coin.equals("20")) {
	                    amount += 20; 
	                    
	                }  else if (!coin.equals("1") && !coin.equals("2") && !coin.equals("5")
	                          && !coin.equals("10") && !coin.equals("20") &&
	                          !coin.equalsIgnoreCase(select)) {
	                   System.exit(0); 
	                   
	                } else if (coin.equalsIgnoreCase(select) && amount == 10 ) { 
	                    System.out.println(thanks);
	                } else if (coin.equalsIgnoreCase(select) && amount > 10) { 
	                    System.out.println(thank + (amount - water) + pence); 
	                }  else if (coin.equalsIgnoreCase(select) && amount < 10) { 
	                       System.out.println(not + (water - amount) + back);
	                break ;
	                } 
	                 
	            } 
	              
	        } 
	        if (choice.equalsIgnoreCase("c")) {
	            System.out.println(first + coca + second + cola + third);
	            System.out.print(coinsacc);
	            int amount = 0;
	            while (amount < 100000000) {
	                System.out.println(in);
	                coin = console.next();
	                 
	                if (coin.equals("1")) {
	                    amount += 1;
	                } else if (coin.equals("2")) {
	                    amount += 2;
	                } else if (coin.equals("5")) {
	                    amount += 5; 
	                } else if (coin.equals("10")) {
	                    amount += 10; 
	                } else if (coin.equals("20")) {
	                    amount += 20; 
	                }  else if (!coin.equals("1") && !coin.equals("2")
	                            && !coin.equals("5") && !coin.equals("10")
	                            && !coin.equals("20") && !coin.equalsIgnoreCase(select)) {
	                   System.exit(0);
	                }  else if (coin.equalsIgnoreCase(select) && amount < 12) {
	                       System.out.println(not + (cola - amount) + back); 
	                    } else if (coin.equalsIgnoreCase(select) && amount == 12 ) {
	                        System.out.println(thanks);
	                    } else if (coin.equalsIgnoreCase(select) && amount > 12) {
	                        System.out.println(thank + (amount - cola) + pence); 
	                    break ;
	                } 
	            }
	        }
	        if (choice.equalsIgnoreCase("j")) {
	            System.out.println(first + juicy + second + juice + third);
	            System.out.print(coinsacc);
	            int amount = 0;
	             while (amount < 100000000) {
	                 System.out.println(in);
	                 coin = console.next();
	                 if (coin.equals("1")) {
	                    amount += 1;
	                } else if (coin.equals("2")) {
	                    amount += 2;
	                } else if (coin.equals("5")) {
	                    amount += 5; 
	                } else if (coin.equals("10")) {
	                    amount += 10; 
	                } else if (coin.equals("20")) {
	                    amount += 20; 
	                } else if (!coin.equals("1") && !coin.equals("2")
	                          && !coin.equals("5") && !coin.equals("10")
	                          && !coin.equals("20") && !coin.equalsIgnoreCase(select)) {
	                   System.exit(0);
	                }  else if (coin.equalsIgnoreCase(select) && amount < 15) {
	                       System.out.println(not + (juice - amount) + back); 
	                    } else if (coin.equalsIgnoreCase(select) && amount == 15 ) {
	                        System.out.println(thanks);
	                    } else if (coin.equalsIgnoreCase(select) && amount > 15) {
	                        System.out.println(thank + (amount - juice) + pence); 
	                    break ;
	               
	                } 
	            }
	        }
	        else if (choice.equalsIgnoreCase("terminate")) {
	        System.out.print("Done");
	            exit = true;
	        }
	        }       
	    } 
	

}
