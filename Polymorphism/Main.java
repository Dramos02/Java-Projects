package Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Company> companyList = new ArrayList<>();
        Scanner string = new Scanner(System.in);
        Scanner integer = new Scanner(System.in);
        Scanner intDouble = new Scanner (System.in);
        
        System.out.println("---------------------------------------------------------------------------\n" + 
				"EMPLOYEE'S DATA ENTRY \n" + "---------------------------------------------------------------------------\n");
        System.out.print("Enter the number of employees to add: ");
        int numEmployees = integer.nextInt();
        
        for (int i = 1; i <= numEmployees; i++) {
            System.out.println("\nEnter information for employee " + i + ":\n");
            System.out.print("Enter Employee's LastName: ");
    		String Lname = string.nextLine();
            System.out.print("Enter Employee's Firstname: ");
    		String Fname = string.nextLine();
    		System.out.print("Enter Employee's MiddleInitial: ");
    		String Mname = string.nextLine();
            System.out.print("Enter Employee's ID: ");
            String id = string.nextLine();
            System.out.print("Enter Employee's Age: ");
            int age = integer.nextInt();
            
            System.out.print("Enter Employee's Street/Barangay: ");
    		String streetBrgy = string.nextLine();
    		System.out.print("Enter Employee's City/Municipality: ");
    		String cityMunicipality = string.nextLine();
    		System.out.print("Enter Employee's Province: ");
    		String province = string.nextLine();
    		System.out.print("Enter Employee's Email address: ");
    		String email = string.nextLine();
    		System.out.print("Enter Employee's Contact No: ");
    		String contactNum = string.nextLine();
    		
    		System.out.print("Enter Employee's SSS#: ");
    		String sssNo = string.nextLine();
    		System.out.print("Enter Employee's TIN#: ");
    		String tinNo = string.nextLine();
    		System.out.print("Enter Employee's PAGIBIG#: ");
    		String pagibigNo = string.nextLine();
    		System.out.print("Enter Employee's PHILHEALTH#: ");
    		String philhealthNo = string.nextLine();
    		
    		System.out.println("---------------------------------------------------------\n");
    	    System.out.print("Enter Employee's Basic: ");
    	    float basic = integer.nextFloat();
    	    System.out.print("Enter Employee's Incentive pay: ");
    	    float incentivesPay = integer.nextFloat();
    	    System.out.print("Enter Employee's House Rent Allowance: ");
    	    float houseRentAllowance = integer.nextFloat();
    	    System.out.print("Enter Employee's Meal Allowance: ");
    	    float mealAllowance = integer.nextFloat();
    	    System.out.println("---------------------------------------------------------\n");
    	    System.out.print("Enter Employee's Provident Fund: ");
    	    float providentFund = integer.nextFloat();
    	    System.out.print("Enter Employee's Professional Tax: ");
    	    float professionalTax = integer.nextFloat();
    	    System.out.print("Enter Employee's Loan: ");
    	    float loan = integer.nextFloat();
    	    
    	    float totalEarnings = basic + incentivesPay + houseRentAllowance + mealAllowance;
    		float totalDeductions = providentFund + professionalTax + loan;
    		float netPay = totalEarnings - totalDeductions;
            
            System.out.print("Enter employee type [1 for Employee, 2 for Manager]: ");
            int employeeType = integer.nextInt();
            
            if (employeeType == 1) {
                System.out.print("Enter Employee's Department: ");
                String department = string.nextLine();
                Employee employee = new Employee(Fname, Lname, Mname, id, streetBrgy, cityMunicipality, province, email, contactNum, age, sssNo, tinNo, pagibigNo, philhealthNo, basic, incentivesPay, houseRentAllowance, 
                		mealAllowance, providentFund, professionalTax, loan, totalEarnings,totalDeductions, netPay, department);
                employee.employeeCode(employeeType);
                companyList.add(employee);
            } else if (employeeType == 2) {
                System.out.print("Enter Manager's Team name: ");
                String team = string.nextLine();
                System.out.print("Enter Manager's department code: ");
                String deptCode = string.nextLine();
                Manager manager = new Manager(Fname, Lname, Mname, id, streetBrgy, cityMunicipality, province, email, contactNum, age, sssNo, tinNo, pagibigNo, philhealthNo, basic, incentivesPay, houseRentAllowance, 
                		mealAllowance, providentFund, professionalTax, loan, totalEarnings,totalDeductions, netPay,  team, deptCode);
                manager.employeeCode(employeeType);
                companyList.add(manager);
            } else {
                System.out.println("Invalid employee type. Skipping employee " + i);
            }
        }
        
        // Display information for all employees in the list
        for (Company c : companyList) {
            c.displayInfo();
            //System.out.println("---------------------------------------------------------");
        }
    }
}

