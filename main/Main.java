package main;

public class Main {

	public static void main(String[] args) {
		Animal Dog1Object = new Animal();
		Animal Dog2Object = new Animal();
		Animal Dog3Object = new Animal();
		
		// This initialization is for Dog1Oject
		Dog1Object.breed = "Bulldog";
		Dog1Object.size = "large";
		Dog1Object.colour = "light gray";
		Dog1Object.age = "5 years";
				
		// This initialization is for Dog2Oject
		Dog2Object.breed = "Beagle";
		Dog2Object.size = "large";
		Dog2Object.colour = "orange";
		Dog2Object.age = "6 years";
		
		// This initialization is for Dog3Oject
		Dog3Object.breed = "German Shepherd";
		Dog3Object.size = "large";
		Dog3Object.colour = "white & orange";
		Dog3Object.age = "6 years";
		
		System.out.println("DOG INFORMATION");
		System.out.println("Breed: " + Dog1Object.breed 
						 + "\nSize: " + Dog1Object.size 
						 + "\nColour: " + Dog1Object.colour 
						 + "\nAge: " + Dog1Object.age );
						Dog1Object.eat("Pedegree");
						Dog1Object.run(1);
						Dog1Object.sleep(8);
						Dog1Object.name("Skies");
						System.out.println("------------------------------");
		System.out.println("Breed: " + Dog2Object.breed 
						 + "\nSize:" + Dog2Object.size 
						 + "\nColour: " + Dog2Object.colour 
						 + "\nAge: " + Dog2Object.age );
						Dog2Object.eat("Top Breed");
						Dog2Object.run(3);
						Dog2Object.sleep(11);
						Dog2Object.name("Akiro");
						System.out.println("------------------------------");
		System.out.println("Breed: " + Dog3Object.breed 
						 + "\nSize: " + Dog3Object.size 
						 + "\nColour: " + Dog3Object.colour 
						 + "\nAge: " + Dog3Object.age );
						Dog3Object.eat("Aozi");
						Dog3Object.run(2);
						Dog3Object.sleep(14);
						Dog3Object.name("Heaven");
		
		
		
		
	}

}
//Copyrights © https://github.com/Dramos02
