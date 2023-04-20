package SecondYear_2ndSem;
import java.util.Scanner;
public class Review_Activity1 {
	public static void main(String[] args) {
	
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
		Scanner myObj = new Scanner(System.in);
		
		for(int x = 0; x < 4 ; x++) {

		System.out.println("Students Name: James Cooper, Princess Smith, Dianna Ross, James Butler");
		System.out.print("Enter Student Index: ");
		index_Number = myObj.nextInt();
	
		
		System.out.println("\nIndex Number 	: "+ index_Number);
		System.out.println("Student ID   	: "+ studentID[index_Number]);
		System.out.println("Name of Student : "+ studentName[index_Number]);
		System.out.println("Course  	: "+ program[index_Number]);
		System.out.println("Sports  	: "+ sports[index_Number]);
		System.out.println("Contact No.  	: "+ contactNo[index_Number]);
		}
	}

}		
		
		
		/*studentIndex[0] = "Index Number 	: 0"
		+ "\nStudent ID 	: 2022-001"
		+ "\nName of Student: James Cooper"
		+ "\nCourse		: BSIT"
		+ "\nSports		: Basketball"
		+ "\nContact No.	: 0920864756";

		studentIndex[1] = "Index Number 	: 1"
		+ "\nStudent ID 	: 2022-002"
		+ "\nName of Student : Princess Smith"
		+ "\nCourse		: BSCS"
		+ "\nSports		: Badminton"
		+ "\nContact No.	: 09178765454";

		studentIndex[2] = "Index Number 	: 2"
		+ "\nStudent ID 	: 2022-003"
		+ "\nName of Student : "Dianna Ross"
		+ "\nCourse		: BSIS"
		+ "\nSports		: Swimming"
		+ "\nContact No.	: 09167657382";

		studentIndex[3] = "Index Number 	: 3"
		+ "\nStudent ID 	: 2022-004"
		+ "\nName of Student : James Butler"
		+ "\nCourse		: BSEMC"
		+ "\nSports		: Baseball"
		+ "\nContact No.	: 09108877635";*/
		/*switch(index_Number) {
		case 0:
		System.out.println("\n");
		break;
		case 1:
		System.out.println("\n");
		break;
		case 2:
		System.out.println("\n");
		break;
		case 3:
		System.out.println("\n");
		break;
		case 4:
		System.out.println("\n");
		break;
		default:
			System.out.println("\nInvalid student Index, please choose from 0-4 Student Index only.");
		
		}*/
		
		

