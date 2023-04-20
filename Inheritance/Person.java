package Inheritance;

class Person {
	//initialize the variable privately
	private String name;
	private int YOB;
	private int age;
	
	public Person(String name, int YOB) {
		this.name = name;
		this.YOB = YOB;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYOB() {
		return YOB;
	}

	public void setYOB(int yOB) {
		YOB = yOB;
	}

	public int getAge() {	
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//this one will prints out the Person class
	 public void printinfo() {
			age = 2023 - YOB;//this one will calculate the age
			System.out.println("");
			System.out.println("-----------------------------------------------------------------------");
	        System.out.println("Name: \t\t\t\t" + getName().toUpperCase());
	        System.out.println("Year of Birth: \t\t\t" + getYOB());
	        System.out.println("Age: \t\t\t\t" + getAge());
	    }
}
