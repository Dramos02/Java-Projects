package Encapsulation1;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
	
	static Scanner input = new Scanner(System.in);
	
	static String Lname;
	public static void main(String[] args) {
		
		ArrayList<EmployeeSlip> employeeSlip = new ArrayList<EmployeeSlip>();

		System.out.print("How many employee's data entry to be entered?: ");
	    int noOfEmployees = input.nextInt();
		
	    System.out.println("---------------------------------------------------------------------------\n" + 
				"EMPLOYEE'S DATA ENTRY \n" + "---------------------------------------------------------------------------\n");
	    input.nextLine(); //i used this because it keeps on skipping the nextline Scanner
	    for (int i = 0; i < noOfEmployees; i++) {
	    System.out.print("Employee ID: ");
	    String employeeID = input.nextLine();
	    //System.out.print("LastName: ");
	    //String Lname = input.nextLine();
	    String Lastname = "Last Name";
		Lname = inputString(Lastname);
	    System.out.print("FirstName: ");
	    String Fname = input.nextLine();
	    System.out.print("Mi: ");
	    String Mname = input.nextLine();
	    System.out.println("---------------------------------------------------------\n");
	    System.out.print("Basic: ");
	    float basic = input.nextFloat();
	    System.out.print("Incentive pay: ");
	    float incentivesPay = input.nextFloat();
	    System.out.print("House Rent Allowance: ");
	    float houseRentAllowance = input.nextFloat();
	    System.out.print("Meal Allowance: ");
	    float mealAllowance = input.nextFloat();
	    System.out.println("---------------------------------------------------------\n");
	    System.out.print("Provident Fund: ");
	    float providentFund = input.nextFloat();
	    System.out.print("Professional Tax: ");
	    float professionalTax = input.nextFloat();
	    System.out.print("Loan: ");
	    float loan = input.nextFloat();
	    
	    input.nextLine();//i used this because it keeps on skipping the nextline Scanner
	    float totalEarnings = basic + incentivesPay + houseRentAllowance + mealAllowance;
		float totalDeductions = providentFund + professionalTax + loan;
		float netPay = totalEarnings - totalDeductions;
		
		//initialize the object consist of the needed information
		EmployeeSlip paySlip = new EmployeeSlip (employeeID, Lname, Fname, Mname, basic, incentivesPay, houseRentAllowance, mealAllowance, providentFund, professionalTax, loan,
				 totalEarnings, totalDeductions, netPay);
		employeeSlip.add(paySlip);
	   }
	    //This loop  will help to display all the employee's payslip  based on how many employee's entry data to entered
	    for (EmployeeSlip paySlip : employeeSlip) {
            paySlip.displayEmployeesInfo();
        }
	}
	
static String inputString(String checker) {
		
		String inputString = "";
		
		while(true) {
			try {
				System.out.print(checker + ": ");
				inputString = input.nextLine();
				break;
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid Input. Don't leave it empty");
			}
		}
		
		return inputString;
	}

}
