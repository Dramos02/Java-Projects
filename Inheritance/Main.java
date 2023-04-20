package Inheritance;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//this arraylist gets students
		ArrayList<Student> dataSet = new ArrayList<Student>();
		Scanner input = new Scanner(System.in); //this scanner is for the number of dataSet
	    Scanner string = new Scanner(System.in);//this scanner is for String user's input
        Scanner integer = new Scanner (System.in);//this scanner is for int user's input
        
		System.out.print("How many dataSet entry to be entered?: ");
	    int noOfData = input.nextInt();
	    
	    for (int i = 0; i < noOfData; i++) {
        System.out.print("Enter person's name: ");
        String name = string.nextLine();
        System.out.print("Enter person's year of birth: ");
        int YOB = integer.nextInt();
        System.out.print("Enter student ID: ");
        String studID = string.nextLine();
        System.out.print("Enter student's major: ");
        String major = string.nextLine();
        System.out.print("Enter No of Students: ");
        int nos = integer.nextInt();
        System.out.println("");
     
        //initialize the object consist of the dataSet
        Student newData = new Student(name, YOB, studID, major, nos);
        dataSet.add(newData);
	}
		//this loop will help to display all the dataSet override by student printinfo
	    for (Student newData : dataSet) {
			newData.printinfo();
		}
	}
}

			/*Coded by DOMINIC O. RAMOS 2BSIT-2 */
