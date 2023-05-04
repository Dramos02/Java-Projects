package Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	//this arraylist consists of the employee's information
        ArrayList<Company> companyList = new ArrayList<>();
        Scanner string = new Scanner(System.in); // this scanner used for string
        Scanner integer = new Scanner(System.in);// this scanner used for int/integer/float
        
        System.out.println("---------------------------------------------------------------------------\n" + 
				"EMPLOYEE'S DATA ENTRY \n" + "---------------------------------------------------------------------------\n");
        int numEmployees = validatePositiveInt(integer,"Enter the number of employees to add: ");
        
        for (int i = 1; i <= numEmployees; i++) {
            System.out.println("\nEnter information for employee " + i + ":\n");
            String Lname = validateNotEmpty(string, "Enter Employee's LastName: ");
            String Fname = validateNotEmpty(string,"Enter Employee's Firstname: ");
            String Mname = validateNotEmpty(string,"Enter Employee's MiddleInitial: ");
    		String id = validateNotEmpty(string,"Enter Employee's ID: ");
    		int age = validatePositiveInt(integer,"Enter Employee's Age: ");

            
            String streetBrgy = validateNotEmpty(string,"Enter Employee's Street/Barangay: ");
    		String cityMunicipality = validateNotEmpty(string,"Enter Employee's City/Municipality: ");
    		String province = validateNotEmpty(string,"Enter Employee's Province: ");
    		String email = validateNotEmpty(string,"Enter Employee's Email address: ");
    		String contactNum = validateNotEmpty(string,"Enter Employee's Contact No: ");
    		
    		String sssNo = validateNotEmpty(string,"Enter Employee's SSS#: ");
    		String tinNo = validateNotEmpty(string,"Enter Employee's TIN#: ");
    		String pagibigNo = validateNotEmpty(string,"Enter Employee's PAGIBIG#: ");
    		String philhealthNo = validateNotEmpty(string,"Enter Employee's PHILHEALTH#: ");
    				
    		System.out.println("---------------------------------------------------------\n");
    	    float basic = validatePositiveFloat(integer, "Enter Employee's Basic: ");
    	    float incentivesPay = validatePositiveFloat(integer, "Enter Employee's Incentive pay: ");
    	    float houseRentAllowance = validatePositiveFloat(integer,"Enter Employee's House Rent Allowance: ");
    	    float mealAllowance = validatePositiveFloat(integer,"Enter Employee's Meal Allowance: ");
    	    System.out.println("---------------------------------------------------------\n");
    	    float providentFund = validatePositiveFloat(integer,"Enter Employee's Provident Fund: ");
    	    float professionalTax = validatePositiveFloat(integer,"Enter Employee's Professional Tax: ");
    	    float loan = validatePositiveFloat(integer,"Enter Employee's Loan: ");
    	    
    	    float totalEarnings = basic + incentivesPay + houseRentAllowance + mealAllowance;
    		float totalDeductions = providentFund + professionalTax + loan;
    		float netPay = totalEarnings - totalDeductions;
            
    		int employeeType = validatePositiveInt(integer,"\nEnter employee type [1 for Employee, 2 for Manager]: ");
            
            //this is a condition for employee type
            if (employeeType == 1) {
            	String department  = validateNotEmpty(string,"\nEnter Employee's Department: ");
                //object for employee's information
                Employee employee = new Employee(Fname, Lname, Mname, id, streetBrgy, cityMunicipality, province, email, contactNum, age, sssNo, tinNo, pagibigNo, philhealthNo, basic, incentivesPay, houseRentAllowance, 
                		mealAllowance, providentFund, professionalTax, loan, totalEarnings,totalDeductions, netPay, department);
                employee.employeeCode(employeeType);
                companyList.add(employee);
            } else if (employeeType == 2) {
            	String team = validateNotEmpty(string,"Enter Manager's Team name: ");
                String deptCode = validateNotEmpty(string,"Enter Manager's department code: ");
              //object for manager's information
                Manager manager = new Manager(Fname, Lname, Mname, id, streetBrgy, cityMunicipality, province, email, contactNum, age, sssNo, tinNo, pagibigNo, philhealthNo, basic, incentivesPay, houseRentAllowance, 
                		mealAllowance, providentFund, professionalTax, loan, totalEarnings,totalDeductions, netPay,  team, deptCode);
                manager.employeeCode(employeeType);
                companyList.add(manager);
            } else {
                System.out.println("Invalid employee type. Skipping employee " + i);
            }
        }
        
        // display information for all employees in the list
        for (Company c : companyList) {
            c.displayInfo();
        }
    }
    
    public static String validateNotEmpty(Scanner scanner, String prompt) {
        String input;
        do {
        	//prompt acts the user's input from the scanner
            System.out.print(prompt);
            //The input is trimmed to remove any leading or trailing whitespace.
            input = scanner.nextLine().trim();
            //it will give error message if the input is blank
            if (input.isEmpty()) {
            	System.out.println("\nPlease Don't Leave it Blank\n");
            }
        } while (input.isEmpty());
        return input;
    }
    
    public static float validatePositiveFloat(Scanner scanner, String prompt) {
        float input;
        do {
           //prompt acts the user's input from the scanner
            System.out.print(prompt);
          //The input is got .trim() to remove any leading or trailing whitespace.
            String inputString = scanner.nextLine().trim();
            if (inputString.isEmpty()) {
            	//it will give error message if the input is blank
                System.out.println("\nPlease Don't Leave it Blank.\n");
                input = -1;
            } else {
            	//this try catch will parse the inputString to float the float input will lead the way to validate the user's input
                try {
                    input = Float.parseFloat(inputString);
                    if (input <= 0) {
                    	//it will give error message if the input is negative
                        System.out.println("\nInvalid input. Employee's Slip should not contain negative value.\n");
                        input = -1;
                    }
                } catch (NumberFormatException e) {
                	//it will give error message if the input is negative
                    System.out.println("\nInvalid input. Employee's Slip should not contain negative value.\n");
                    input = -1;
                }
            }
        } while (input <= 0);
        return input;
    }
    //this method is most likely like my method validatepostiveFloat the difference between them is that this method
    //validates the integer user's input
    public static int validatePositiveInt(Scanner scanner, String prompt) {
        int input;
        do {
            System.out.print(prompt);
            String inputString = scanner.nextLine().trim();
            if (inputString.isEmpty()) {
                System.out.println("\nPlease Don't Leave it Blank.\n");
                input = -1;
            } else {
                try {
                    input = Integer.parseInt(inputString);
                    if (input <= 0) {
                        System.out.println("\nInvalid input. This should not contain negative value.\n");
                        input = -1;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\nInvalid input. This should not contain negative value.\n");
                    input = -1;
                }
            }
        } while (input <= 0);
        return input;
    }
    
}

//Coded by Dominic O. Ramos 2BSIT-2 OOP

