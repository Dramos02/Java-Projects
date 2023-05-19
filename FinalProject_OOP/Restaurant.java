package FinalProject_OOP;

class Restaurant {
	private static int reservationCounter = -1;
	private int idNumber;
	private String name;
	private String date;
	private String time;
	private int numAdults;
	private int numChildren;

	Restaurant(String name, String date, String time, int numAdults, int numChildren) {
	  this.idNumber = ++reservationCounter;
	  this.name = name;
	  this.date = date;
	  this.time = time;
	  this.numAdults = numAdults;
	  this.numChildren = numChildren;
	}

	
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


	public void displayDetails() {
	}
}

