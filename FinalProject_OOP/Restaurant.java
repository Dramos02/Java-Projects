package FinalProject_OOP;

class Restaurant {
	//initializes the variables for parent class  - Restaurant
	private static int reservationCounter = -1;
	private int idNumber;
	private String name;
	private String date;
	private String time;
	private int numAdults;
	private int numChildren;

	//Constructor of the parent class - Restaurant 
	Restaurant(String name, String date, String time, int numAdults, int numChildren) {
	  this.idNumber = ++reservationCounter;
	  this.name = name;
	  this.date = date;
	  this.time = time;
	  this.numAdults = numAdults;
	  this.numChildren = numChildren;
	}

	//getter and setters of the constructor
	public int getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public int getNumAdults() {
		return numAdults;
	}


	public void setNumAdults(int numAdults) {
		this.numAdults = numAdults;
	}


	public int getNumChildren() {
		return numChildren;
	}


	public void setNumChildren(int numChildren) {
		this.numChildren = numChildren;
	}

	//this one to be override for polymorphism
	public void displayDetails() {
	}
}

