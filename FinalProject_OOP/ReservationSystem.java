package FinalProject_OOP;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ReservationSystem extends Restaurant {
//extends the parent class to its sub class to be come more powerful - ReservationSystem
	
	private ArrayList<Restaurant> reservations; //first initializes Arraylist to get from parent class
	static Scanner string = new Scanner(System.in); // this scanner used for string
    static Scanner integer = new Scanner(System.in);// this scanner used for int/integer
    static DecimalFormat df = new DecimalFormat("#######.00"); //this formats the subtotal and grandtotal of generate report
    
    ReservationSystem() {
		 super("", "", "", 0, 0); // get the initialized value from parent class
		 reservations = new ArrayList<>(); // setting up the arraylist from the constructor
    }

    @Override
    public void displayDetails() {
    	
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
        } else {
            System.out.println("Reservations:");
            for (Restaurant reservation : reservations) {
                reservation.displayDetails();
            }
        }
    }
    
    public void makeReservation() {
    	//this will get user's input to make reservation and 
    	//I used my method to validates user's input
    	String name = validateNotEmpty(string,"Enter name: ");
        String date = validateDate(string, "Enter date (Format: MMM or MMMM DD, YYYY): ");
    	String time = validateTime(string, "Enter time: (Format: HH:MM [am/pm-AM/PM]: ");
    	int numAdults = validatePositiveInt(integer,"Enter number of adults: ");
    	int numChildren = validatePositiveInt(integer,"Enter number of children: ");

    	//this object will add it to arraylist and set values
        Restaurant reservation = new Restaurant(name, date, time, numAdults, numChildren);
        reservations.add(reservation);

        System.out.println("Reservation made successfully. Reservation ID: " + reservation.getIdNumber());
    }

    public void viewReservations() {
    	//this acts like the displayDetails() method but i edited to be more precise
        if (reservations.isEmpty()) {
            System.out.println("Sorry, But No Reservations found.");
        } else {
        	 System.out.println("\t\t\t\t\tRestaurant Reservation System");
             System.out.println("Reservation ID   Name                 Time                    Date               Adults     Children");
             System.out.println("------------------------------------------------------------------------------------------------------");
             for (Restaurant reservation : reservations) {
                 String id = String.valueOf(reservation.getIdNumber());
                 String name = reservation.getName();
                 String time = reservation.getTime().toUpperCase();
                 String date = reservation.getDate();
                 String adults = String.valueOf(reservation.getNumAdults());
                 String children = String.valueOf(reservation.getNumChildren());

                 System.out.format("%-17s%-21s%-24s%-19s%-10s%-10s%n", id, name, time, date, adults, children);
                 
            }
        }
    }

    public void updateReservation() {
    	//another validations included here
    	int id = validatePositiveInt(integer, "Enter reservation ID to update: ");
    	
    	//this one is set to target the id_Number of the reservation to be updated
        Restaurant reservationToUpdate = null;
        for (Restaurant reservation : reservations) {
            if (reservation.getIdNumber() == id) {
                reservationToUpdate = reservation;
                break;
            }
        }
        
        //this one to update the previous details from reservation
        if (reservationToUpdate != null) {
            System.out.println("Enter new details:");

            String name = validateNotEmpty(string,"Enter name: ");
            reservationToUpdate.setName(name);

            String date = validateDate(string,"Enter date: ");
            reservationToUpdate.setDate(date);

            String time = validateTime(string,"Enter time: ");
            reservationToUpdate.setTime(time);

            int numAdults = validatePositiveInt(integer,"Enter number of adults: ");
            reservationToUpdate.setNumAdults(numAdults);

            int numChildren = validatePositiveInt(integer,"Enter number of children: ");
            reservationToUpdate.setNumChildren(numChildren);

            System.out.println("Reservation ID: " + reservationToUpdate.getIdNumber() + " updated successfully.");
        } else {
            System.out.println("Reservation ID not found.");
        }
    }
    
    public void deleteReservation() {
    	//another validation included
    	int id = validatePositiveInt(integer,"Enter reservation ID to delete: ");

    	//to target again the specific reservation
        Restaurant reservationToRemove = null;
        for (Restaurant reservation : reservations) {
    	   if (reservation.getIdNumber() == id) {
    	         reservationToRemove = reservation;
    	         break;
    	      }
    	  }
        	//to delete the reservation and give notify the idnumber and its corresponding name
    	   if (reservationToRemove != null) {
    	       reservations.remove(reservationToRemove);
    	        System.out.println("Reservation ID: " + reservationToRemove.getIdNumber() + " for " + reservationToRemove.getName() + " deleted successfully.");

    	        // Adjust reservation IDs after deletion
    	        for (int i = 0; i < reservations.size(); i++) {
    	        	Restaurant reservation = reservations.get(i);
    	            reservation.setIdNumber(i + 1);
    	        }
    	    } else {
    	        System.out.println("Sorry, But your Reservation ID not found.");
    	    }
    	}

    public void generateReport() {
    //initializes the variables that is need to generateReports
    	int totalAdults = 0;
        int totalChildren = 0;
        int grandTotal = 0;

           
     if (reservations.isEmpty()) {
        System.out.println("No reservations found.");
         return;
     }else {
    	  System.out.println("\t\t\t\t\tRestaurant Reservation System [ GENERATED REPORT ]");
          System.out.println("Reservation ID   Name                 Time                    Date               Adults     Children   Subtotal");
          System.out.println("---------------------------------------------------------------------------------------------------------------");

          for (Restaurant reservation : reservations) {
              int reservationSubtotal = (reservation.getNumAdults() * 500) + (reservation.getNumChildren() * 300);
              totalAdults += reservation.getNumAdults();
              totalChildren += reservation.getNumChildren();
              grandTotal += reservationSubtotal;

              System.out.format("%-17s%-21s%-24s%-19s%-10s%-12s%-8s%n",
                      reservation.getIdNumber(), reservation.getName(), reservation.getTime(),
                      reservation.getDate(), reservation.getNumAdults(), reservation.getNumChildren(), df.format(reservationSubtotal));
          }

          System.out.println("---------------------------------------------------------------------------------------------------------------");
          System.out.println("\nTotal number of Adults: " + totalAdults);
          System.out.println("Total number of Kids: " + totalChildren);
          System.out.println("Grand Total: PHP " + df.format(grandTotal));
          
          System.out.println("\n---------------------------------------------nothing follows---------------------------------------------------");
     }
  }
    
    public static String validateNotEmpty(Scanner scanner, String prompt) {
    	
        String input;
        
        do {
        	//prompt acts the user's input from the scanner
            System.out.print(prompt);
            //The input is trimmed to remove any leading or trailing whitespace.
            input = scanner.nextLine().trim();
            //it will give error message if the input is blank
            if (input.isEmpty()) {
            	System.out.println("\nPlease Don't Leave it Blank\n");
            }
        } while (input.isEmpty());
        return input;
    }
    //validates the integer user's input
    public static int validatePositiveInt(Scanner scanner, String prompt) {
    	
        int input;
        do {
            System.out.print(prompt);
            String inputString = scanner.nextLine().trim();
            if (inputString.isEmpty()) {
                System.out.println("\nPlease Don't Leave it Blank.\n");
                input = -1;
            } else {
                try {
                    input = Integer.parseInt(inputString);
                    if (input <= 0) {
                        System.out.println("\nInvalid input. This should not contain negative value.\n");
                        input = -1;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\nInvalid input. This should not contain negative value.\n");
                    input = -1;
                }
            }
        } while (input <= 0);
        return input;
    }
    //validates the Date if its empty and the format is satisfied
    public static String validateDate(Scanner scanner, String prompt) {

        String input;
        String regex = "(?i)^(jan|feb|mar|apr|may|jun|june|jul|july|aug|sep|sept|oct|nov|dec) (\\d{1,2}), (\\d{4})$";

        do {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("\nPlease don't leave it blank.\n");
            } else if (!input.matches(regex)) {
                System.out.println("\nSorry Invalid input. "
                		+ "\nDate should be in the format of 3-letter abbreviation month (ex: Jan)"
                		+ "\nor 4-letter abbreviation month (ex: Sept)"
                		+ "\nor full month name (ex: February),"
                		+ "\nfollowed by a space, day (1-31), comma, space, and a 4-digit year.\n");
            }
        } while (input.isEmpty() || !input.matches(regex));
        return input;
    }
    //validates the Time if its empty and the format is satisfied
    public static String validateTime(Scanner scanner, String prompt) {

        String input;
        String regex = "^(0[1-9]|1[0-2]):[0-5][0-9] [APap][mM]$";

        do {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("\nPlease don't leave it blank.\n");
            } else if (!input.matches(regex)) {
                System.out.println("\nSorry Invalid input. "
                		+ "\nTime should be in the format of "
                		+ "\nHH:MM AM/PM (ex:, 09:30 AM).\n");
            }
        } while (input.isEmpty() || !input.matches(regex));
        return input;
    }
    //validates the char Option in RestauratnReservationApplication if its empty
	public static char validateOption(String prompt) {
	    char option = 0;
	    do {
	        System.out.print(prompt);
	        String input = string.nextLine().trim().toLowerCase();
	        if (input.isEmpty()) {
	            System.out.print("\nOption cannot be empty. Please try again.\n"
	            		+ "\nEnter your choice from [a-f || A-F]: "
	            		);
	            continue;
	        }
	        option = input.charAt(0);
	        if (option < 'a' || option > 'f') {
	            System.out.println("\nInvalid option. Please enter a valid option (a-f).");
	        }
	    } while (option < 'a' || option > 'f');
	    return option;
	}
}



