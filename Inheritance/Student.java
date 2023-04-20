package Inheritance;

public class Student extends Person {
	//initialize the variable privately
	private String studID;
	private String major;
	private int nos;
	
	public Student(String name, int YOB, String studID, String major, int nos) {
		super(name, YOB);
		this.studID = studID;
		this.major = major;
		this.nos = nos;
	}

	public String getStudID() {
		return studID;
	}

	public void setStudID(String studID) {
		this.studID = studID;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getNos() {
		return nos;
	}

	public void setNos(int nos) {
		this.nos = nos;
	}
	//this will prints out the Student class
	public void printinfo() {
		super.printinfo();// prints out from the Person class 
		System.out.println("Your ID Number is: \t\t" + getStudID());
		System.out.println("Your Program is: \t\t" + getMajor().toUpperCase());
		System.out.println("No of Students \t\t\t" + getNos());
		nos++;// this one will increment the getNos/setNos/no
		System.out.println("Incremented number is: \t\t" + nos);
	}
	
}
