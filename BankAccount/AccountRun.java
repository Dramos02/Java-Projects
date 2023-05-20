package BankAccount;

import java.text.DecimalFormat;

import Bank.Account; 
public class AccountRun {
			public static float account1;
			public static float account2;
			public static float newaccBalance1;
			public static float newaccBalance2;


			public static void display_AccountBalance()	{
				DecimalFormat df = new DecimalFormat("#,###,###.00");
				
				System.out.println("\n\n" + "User's Account Balance");
				System.out.println("Account1 Balance " + "$" + df.format(account1));
				System.out.println("Account2 Balance " + "$" + df.format(account2));
			}
			
				public static void display_NewAccountBalance1()	{
					DecimalFormat df = new DecimalFormat("#,###,###.00");
					
					System.out.println("\n\n" + "User's New Account Balance");
					System.out.println("Account1 Balance " + "$" + df.format(newaccBalance1));
					System.out.println("Account2 Balance " + "$" + df.format(account2));
			}
				public static void display_NewAccountBalance2()	{
					DecimalFormat df = new DecimalFormat("#,###,###.00");
					
					System.out.println("\n\n" + "User's New Account Balance");
					System.out.println("Account1 Balance " + "$" + df.format(newaccBalance1));
					System.out.println("Account2 Balance " + "$" + df.format(newaccBalance2));
			}
}

//Copyrights © https://github.com/Dramos02
