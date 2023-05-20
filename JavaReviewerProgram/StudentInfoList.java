package SecondYear_2ndSem;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.NoSuchElementException;
public class StudentInfoList {
	public static void main (String[] args) {

		ArrayList<String> idNumber = new ArrayList<String>();
		ArrayList<String> studentName = new ArrayList<String>();
		ArrayList<String> deparment = new ArrayList<String>();
		ArrayList<String> program = new ArrayList<String>();
		
		String userInput, user_Option;
		boolean portal_Run = true;
		boolean canTry = true;
		boolean iscanTry = true;
		String idNum = null, studName, studDept, studProg;
		
		Scanner data = new Scanner(System.in);
		while (portal_Run) {
			
			 canTry = true;
			 iscanTry = true;
			
			while (canTry) {
				System.out.println("Enter ID Number: ");
				idNum = data.nextLine();
				
			if(idNum.isEmpty()) {
				
				System.out.println("\nPLEASE ENTER A ID NUMBER");
				
			}else{
				idNumber.add(idNum);
				canTry = false;
				}
			}canTry = true;
			
			while (canTry) {
			System.out.println("Enter StudentName: ");
			studName = data.nextLine();
			if(studName.isEmpty()) {
				System.out.println("\nPLEASE ENTER A STUDENTNAME");
			}else {
			studentName.add(studName);
			canTry = false;
				}
			}canTry = true;
			
			while(canTry) {
			System.out.println("Enter Student Deparment: ");
			studDept = data.nextLine();
			if(studDept.isEmpty()) {
				System.out.println("\nPLEASE ENTER A STUDENT DEPARTMENT");
			}else {
				deparment.add(studDept);
				canTry = false;
				}
			}canTry = true;
			
			while(canTry){
			System.out.println("Enter Student Program: ");
			studProg = data.nextLine();
			if(studProg.isEmpty()) {
				System.out.println("\nPLEASE ENTER A STUDENT PROGRAM");
			}else {
				System.out.println("\nRECORD SUCCESSFULLY SAVED");
				program.add(studProg);
				canTry = false;
				}
			}
			
			while(iscanTry) {
			System.out.println("Do you want to add more participants YES/NO");
			user_Option = data.nextLine();
			
			switch(user_Option) {
			case "yes":
			case "Yes":
			case "YES":
				portal_Run = true;
				iscanTry = false;
				break;
			
			case "no":
			case "No":
			case "NO":
				portal_Run = false;
				iscanTry = false;
				break;
				
			default:
				System.out.println("Invalid Option, Please use YES or NO only");
				iscanTry = true;
				//portal_Run = true;

			}
			}
		}
		System.out.println("List of Student Participants\n");
		System.out.println("ID NUMBER\tStudentName\t\tCollege\t\tProgram");
		for(int x = 0; x < idNumber.size(); x++) {
			
			System.out.println(idNumber.get(x)+"\t\t" + studentName.get(x).toUpperCase() + "\t\t" + deparment.get(x).toUpperCase()  + "\t\t " + program.get(x).toUpperCase());
							
		}
	}
}
//Copyrights © https://github.com/Dramos02
