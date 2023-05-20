package Bank;


import java.text.DecimalFormat;
import java.util.Scanner;
import BankAccount.AccountRun;
public class Account {
	public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			AccountRun AccData = new AccountRun();
			DecimalFormat df = new DecimalFormat("#,###,###.00");
			
			float account1=0;
			float account2=0;
			
			System.out.println("Enter the 1ST Account Balance" );
			account1=input.nextFloat();
			AccData.account1 = account1;
			System.out.println("Enter the 2ND Account Balance" );
			account2=input.nextFloat();
			AccData.account2 = account2;
			
			
			AccData.display_AccountBalance();
			
			int withdrawal1; 
			
			System.out.print("\nEnter withdrawal amount for account 1:" );
			withdrawal1=input.nextInt();
			
			if(withdrawal1 <= account1){
			float newaccBalance1= account1 - withdrawal1;
			AccData.newaccBalance1 = newaccBalance1;
			
			System.out.print("\nSubtracting" + "  " + df.format(withdrawal1) + "  " +  "from account1 balance");
			AccData.display_NewAccountBalance1();
			
			}
			else {
				float newaccBalance1 = account1;
				AccData.newaccBalance1 = newaccBalance1;
				System.out.print("\nsubstracting " + df.format(withdrawal1) +  "from account1 balance \nDebit Amount exceeded account balance." );
				AccData.display_AccountBalance();
			}
			int withdrawal2;
			System.out.print("\nEnter withdrawal amount for account 2:" );
			withdrawal2=input.nextInt();
			
			if(withdrawal2 <= account2){
			float newaccBalance2 = account2 - withdrawal2;
			AccData.newaccBalance2 = newaccBalance2;
			
			System.out.print("\nSubtracting" + "  " + df.format(withdrawal2) + "  " +  "from account2 balance");
			AccData.display_NewAccountBalance2();
			
			}
			else {
			float newaccBalance2 = account2;
			AccData.newaccBalance2 = newaccBalance2;
				System.out.print("\nSubstracting " + "  "+ df.format(withdrawal2) + "  " + "from account1 balance \nDebit Amount exceeded account balance." );
				AccData.display_NewAccountBalance2();
			}
			
	}	
}

//Copyrights © https://github.com/Dramos02
