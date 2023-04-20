package SecondYear_2ndSem;
import java.nio.file.FileSystemNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class Java_Reviewer {
	public static void main(String[] args) {

	/*
	//Java program that uses Scanner
	String family_name = "";
	int noOfMembers, houseExpenses, foodExpenses, childcareExpenses, transpoExpenses, healthcareExpenses, othersExpenses;
	float monthly_total, annual_total;
	
	Scanner myObj = new Scanner(System.in);
	System.out.print("Enter your Family Name: ");
	family_name = myObj.nextLine();
	System.out.print("No of members of Family: ");
	noOfMembers = myObj.nextInt();
	System.out.print("Houseing Expenses: ");
	houseExpenses = myObj.nextInt();
	System.out.print("Food Expenses: ");
	foodExpenses = myObj.nextInt();
	System.out.print("Child Care Expeneses: ");
	childcareExpenses = myObj.nextInt();
	System.out.print("Transportation Expenses: ");
	transpoExpenses = myObj.nextInt();
	System.out.print("Health Care Expenses: ");
	healthcareExpenses = myObj.nextInt();
	System.out.print("Other Necessities Expenses: ");
	othersExpenses = myObj.nextInt();
	
	monthly_total = houseExpenses + foodExpenses + childcareExpenses + transpoExpenses + healthcareExpenses + othersExpenses ;
	annual_total= monthly_total * 12;
	
	System.out.println("\nMonthly Costs of " + family_name + " family With " + noOfMembers + " members in the family" + "\n");
	System.out.println("Monthly Total: " + monthly_total);
	System.out.println("AnnualTotal: " + annual_total);

	
	//Java program that uses array
	
		String studentID [] = {
				"2022-001",
				"2022-002",
				"2022-003",
				"2022-004"
			   };
		String studentName [] = {
				"James Cooper",
				"Princess Smith",
				"Dianna Ross",
				"James Butler",
				};
		String program [] = {
				"BSIT",
				"BSCS",
				"BSIS",
				"BSEMC"
				};
		String sports [] = {
				"Basketball",
				"Badminton", 
				"Swimming", 
				"Baseball"
				};
		String contactNo[]= {
				"0920864756",
				"09178765454",
				"09167657382",
				"09108877635" 
				};
		int index_Number;
		
		//Scanner myObj = new Scanner(System.in);
		
		System.out.println("Students Name: James Cooper, Princess Smith, Dianna Ross, James Butler");
		System.out.print("Enter Student Index:");
		index_Number = myObj.nextInt();
	
		
		System.out.println("\nIndex Number 	: "+ index_Number);
		System.out.println("Student ID   	: "+ studentID[index_Number]);
		System.out.println("Name of Student : "+ studentName[index_Number]);
		System.out.println("Course  	: "+ program[index_Number]);
		System.out.println("Sports  	: "+ sports[index_Number]);
		System.out.println("Contact No.  	: "+ contactNo[index_Number]);
		
		
		//Java Program with relational operator, logical operator and IF/ELSE/Nested
		float english_Grade, math_Grade, science_Grade, computer_Grade, total_Grade, average_Grade;
		
		
		//Scanner myObj = new Scanner(System.in);
		
		System.out.print("English :");
		english_Grade = myObj.nextFloat();
		System.out.print("Math :");
		math_Grade = myObj.nextFloat();
		System.out.print("Science :");
		science_Grade = myObj.nextFloat();
		System.out.print("Computer :");
		computer_Grade = myObj.nextFloat();

		total_Grade = english_Grade + math_Grade + science_Grade + computer_Grade;
		average_Grade = total_Grade / 4;
		
		System.out.print("\nAverage : " + average_Grade);
		
		if (average_Grade > 100) {
			System.out.println("\nInvalid Input on Grade");
		} else if ((average_Grade >= 98)&&(average_Grade <= 100)){
			System.out.println("\nExcellent");
		} else if ((average_Grade >= 95)&&(average_Grade <= 97.99)){
			System.out.println("\nVery Good");
		} else if ((average_Grade >= 90)&&(average_Grade <= 94.99)){
			System.out.println("\nGood");
		} else if ((average_Grade >= 75)&&(average_Grade <= 89.99)){
			System.out.println("\nPassed");
		} else {
			System.out.println("\nFailed");
		}
		
		//Java program with switch cases 
		
		int first_Number, second_Number;
		float sum, difference, product, quotient;
		int choices;
		
		//Scanner myObj = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		first_Number = myObj.nextInt();
		System.out.print("Enter Second Number: ");
		second_Number = myObj.nextInt();
		
		System.out.println("Select Operator to be use: 1 => Multiplication, 2 => Division, 3 => Substraction, 4 => Addition");
		choices = myObj.nextInt();
		
		switch (choices) {
		case 1:
			product = first_Number * second_Number;
			System.out.println("The product of " + first_Number + " and " + second_Number + " is " + product);
			break;
		case 2:
			quotient = first_Number / second_Number;
			System.out.println("The quotient of " + first_Number + " and " + second_Number + " is " + quotient);
			break; 
		case 3:
			difference = first_Number - second_Number;
			System.out.println("The difference of " + first_Number + " and " + second_Number + " is " + difference);
			break;
		case 4:
			sum = first_Number + second_Number;
			System.out.println("The sum of " + first_Number + " and " + second_Number + " is " + sum);
			break;
		default:
			System.out.println("Invalid Selection");
		}
		
		
		//.equalsIgnoreCase = not case/letter sensitive (C == c), .equals sensitive (C != c)
		//Java program Looping while and do while 
		    String userDecision = "";
		   // int first_Number, second_Number, sum;

		   //Scanner myObj = new Scanner(System.in);
		        do {
		        	System.out.print("Enter First Number: ");
					first_Number = myObj.nextInt();
					System.out.print("Enter Second Number: ");
					second_Number = myObj.nextInt();
					sum = first_Number + second_Number;
					System.out.println("The Sum of " + first_Number + " and " + second_Number + " is " + sum);
					myObj.nextLine();
		        	System.out.println("Do you want to try again? Yes or No?");
		            userDecision = myObj.nextLine();
		        } while (userDecision.equalsIgnoreCase("yes") && !userDecision.equalsIgnoreCase("no"));
		        System.out.println("Thank you and Good Bye");
		
		//Java program For loop authentication
		
		String[] username_Index  = {
								"admin",
								"manager",
								"user",
								"guest"
							},
				password_Index = {
								"admin123",
								"manager123",
								"user123",
								"guest"
							};
		
		String username, password;
		int userIndex = 0, passIndex = 0;
		//Scanner authenticator = new Scanner(System.in);
		
		System.out.print("Enter Your Username: ");
		username = myObj.nextLine();
		System.out.print("Enter Your Password: ");
		password = myObj.nextLine();
		
		for (int i = 0; i < username_Index.length; i++) {
			
			if(username.equals(username_Index[i])){
				userIndex = i;
			}
			if(password.equals(password_Index[i])) {
				passIndex = i;
			}
			}
			if(userIndex == passIndex) {
				System.out.println("Access Granted " + username_Index[userIndex]);
			}else {
				System.out.println("You are Not Authorized");
			}	
			
		//Java Program using ArrayList
			
			ArrayList<String> beverages = new ArrayList<String>();
			beverages.add("Coke");
			beverages.add("Royale");
			beverages.add("Sprite");
			beverages.add("Sarsi");
	
			ArrayList<Integer> price = new ArrayList<Integer>();
			price.add(20);
			price.add(23);
			price.add(19);
			price.add(25);
	
			ArrayList<String> receipt = new ArrayList<String>();
	
			String customer_Order, customer_Option;
			Integer sum2 = 0;
			boolean cashier_run=true;
			Scanner cashier = new Scanner(System.in);
	
			while(cashier_run) {
			System.out.println("Beverages available: Coke => P20, Royale => P23, Sprite => P19, Sarsi => P25");
			System.out.print("Purchase Beverages: ");
			customer_Order = cashier.nextLine();
	
			switch (customer_Order) {
			case "coke":
			case "Coke":
				receipt.add(beverages.get(0) + " Php " + price.get(0));
				sum2 += price.get(0);
				break;
			case "Royale":
			case "royale":
				receipt.add(beverages.get(1) + " Php " + price.get(1));
				sum2 += price.get(1);
				break;
			case "sprite":
			case "Sprite":
				receipt.add(beverages.get(2) + " Php " + price.get(2));
				sum2 += price.get(2);
				break;
			case "Sarsi":
			case "sarsi":
				receipt.add(beverages.get(3) + " Php " + price.get(3));
				sum2 += price.get(3);
				break;
			default:
				System.out.println("Invalid/Not Available Beverages");
			}
			System.out.println("Do you want to add more? Yes / No?");
			customer_Option = cashier.nextLine();
	
			switch(customer_Option) {
				case "yes":
				case "Yes":
					cashier_run = true;
					break;
				case "no":
				case "No":
					cashier_run = false;
					System.out.println("\nPlease Pay your Beverage: ");
					break;
				default:
					System.out.println("Invalid Option please Try Again");
				}	
			}
				for (int i = 0; i < receipt.size(); i++) {
						System.out.println(receipt.get(i));
					}
				System.out.println("Total Amount: " + sum2);
	*/	     	
		String cars [][] = {
				{"BrandName ","Price "},
				{"Toyata    ","P780,000"},
				{"Honda     ","P500,405"},
				{"Honda     ","P500,405"}
		};
		
		for (int row = 0; row < cars.length; row++) {
			
			for(int col = 0; col < cars[row].length; col++) {
				System.out.println(cars[row][col]);
			}
		}
}	
}
