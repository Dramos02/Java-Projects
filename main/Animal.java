package main;

public class Animal {
	String breed;
	String size;
	String colour;
	String age;
	
	public void eat(String food) {
		System.out.println("The Dog eats: " + food);
	}
	public void run(int runTime) {
		System.out.println("Dog running time is: " + runTime + " hour/s");
	}
	public void sleep(int sleepTime) {
		System.out.println("Dog always sleep within: " + sleepTime + " hours");
	}
	public void name(String animalName) {
		System.out.println("The Dog's name is: " + animalName);
	}
}
//Copyrights © https://github.com/Dramos02
