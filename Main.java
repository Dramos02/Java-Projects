package TEST;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        ArrayList<Employee> employees = new ArrayList<Employee>();

	        System.out.print("How many employee's data entry to be entered?: ");
	        int noOfEmployees = Integer.parseInt(input.nextLine()); //i used this because it keeps on skipping the nextline Scanner

	        System.out.println("---------------------------------------------------------------------------\n" + 
					"EMPLOYEE'S DATA ENTRY \n" + "---------------------------------------------------------------------------\n");
	        for (int i = 0; i < noOfEmployees; i++) {
	   		System.out.print("LastName: ");
	   		String Lname = input.nextLine();
	   		System.out.print("Firstname: ");
	   		String Fname = input.nextLine();
	   		System.out.print("MiddleInitial: ");
	   		String Mname = input.nextLine();
	   		System.out.print("Age: ");
	   		int age = Integer.parseInt(input.nextLine()); //i used this because it keeps on skipping the nextline Scanner
	   		System.out.print("Gender: ");
	   		String gender = input.nextLine();
	   		System.out.print("Birth Date: ");
	   		String dateOfB = input.nextLine();
	   		System.out.print("Place of Birth: ");
	   		String placeOfB = input.nextLine();
	   		System.out.print("Religion: ");
	   		String religion = input.nextLine();
	   		System.out.print("Civil Status: ");
	   		String civilStatus = input.nextLine();
	   		
	   		System.out.println("");
	   		
	   		System.out.print("Street/Barangay: ");
	   		String streetBrgy = input.nextLine();
	   		System.out.print("City/Municipality: ");
	   		String cityMunicipality = input.nextLine();
	   		System.out.print("Province: ");
	   		String province = input.nextLine();
	   		System.out.print("Email address: ");
	   		String email = input.nextLine();
	   		System.out.print("Contact No: ");
	   		String contactNum = input.nextLine();
	   		
	   		System.out.println("");
	   		
	   		System.out.print("SSS#: ");
	   		String sssNo = input.nextLine();
	   		System.out.print("TIN#: ");
	   		String tinNo = input.nextLine();
	   		System.out.print("PAGIBIG#: ");
	   		String pagibigNo = input.nextLine();
	   		System.out.print("PHILHEALTH#: ");
	   		String philhealthNo = input.nextLine();
	   		
	   		System.out.println("");

	            Employee data = new Employee (Fname, Lname, Mname, age, gender, dateOfB, placeOfB, religion, civilStatus, streetBrgy, cityMunicipality, province, email,
	            		contactNum, sssNo, tinNo, pagibigNo, philhealthNo);
	            employees.add(data);
	        }
	        //This for loop will help to display all the employee information based on how many employee's entry data to entered
	        for (Employee data : employees) {
	            data.displayEmployeeInfo();
	        }
	      }
	    }
	

