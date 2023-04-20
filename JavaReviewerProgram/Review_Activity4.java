package SecondYear_2ndSem;
import java.util.Scanner;
public class Review_Activity4 {
	static double sumGrade;
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
				
		System.out.println("Enter Student Name: ");
		String studName = input.nextLine();
		System.out.println("Grade in ENGLISH: ");
		double gradeInEnglish = input.nextDouble();
		System.out.println("Grade in MATH: ");
		double gradeInMath = input.nextDouble();
		System.out.println("Grade in SCIENCE: ");
		double gradeInScience = input.nextDouble();
		System.out.println("Grade in HISTORY: ");
		double gradeInHistory = input.nextDouble();
		System.out.println("Grade in PE: ");
		double gradeInPE = input.nextDouble();
		
		double grades[] = {
				gradeInEnglish,
				gradeInMath,
				gradeInScience,
				gradeInHistory,
				gradeInPE
		};
		
		studentName(studName.toUpperCase());
		computedAverage(grades);
		averageRemarks(sumGrade);
		gradePassChecker(grades);
		
	}
	public static void studentName(String name) {
		System.out.println("\nName of Student: " + name);
	}
	public static double computedAverage(double grades[]) {
		
		
		for (int i = 0; i < grades.length; i++) {
			sumGrade += (grades[i]) / grades.length;
			
		}
		
		System.out.println("Computed Average: " + sumGrade);
		return sumGrade;
	}
	public static boolean averageRemarks(double averageGrade) {
		
		averageGrade = sumGrade;
		
		if (averageGrade >= 95 && averageGrade <= 100) {
			System.out.println("Average Remarks: Excellent");
			return true;
		}else if (averageGrade >= 90 && averageGrade <= 94) {
			System.out.println("Average Remarks: Very Good");
			return true;
		}else if (averageGrade >= 85 && averageGrade <= 89) {
			System.out.println("Average Remarks: Good");
			return true;
		}else if (averageGrade >= 75 && averageGrade <= 84) {
			System.out.println("Average Remarks: Passed");
			return true;
		}else if (averageGrade <= 75) {
			System.out.println("Average Remarks: Failed");
			return true;	
		}
		return false;
		
	}
	public static void gradePassChecker(double[] grades) {
		int x = 0;
		int y = 0;
		for (double i: grades) {
				if (i >= 75) {
					x++;
				} else {
					y++;
				}
			
	}
		System.out.println("Number of passed " + x + " " + "Number of failed " + y);
	}
}
