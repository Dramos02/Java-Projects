package FinalProject_OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class ReservationSystem extends Restaurant {

	private ArrayList<Restaurant> reservations;
	static Scanner string = new Scanner(System.in); // this scanner used for string
    static Scanner integer = new Scanner(System.in);// this scanner used for int/integer

    public ReservationSystem() {
    	
		 super("", "", "", 0, 0);
		 reservations = new ArrayList<>();
    }

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
    	
    	String name = validateNotEmpty(string,"Enter name: ");
        String date = validateDate(string, "Enter date (Format: MMM or MMMM DD, YYYY): ");
    	String time = validateTime(string, "Enter time: (Format: 00:00 [am/pm-AM/PM] ");
    	int numAdults = validatePositiveInt(integer,"Enter number of adults: ");
    	int numChildren = validatePositiveInt(integer,"Enter number of children: ");

        Restaurant reservation = new Restaurant(name, date, time, numAdults, numChildren);
        reservations.add(reservation);

        System.out.println("Reservation made successfully. Reservation ID: " + reservation.getIdNumber());
    }

    public void viewReservations() {
    	
        if (reservations.isEmpty()) {
            System.out.println("Sorry, But No Reservations found.");
        } else {
            System.out.println("Reservations:");
            for (Restaurant reservation : reservations) {
                System.out.println("Reservation ID: " + reservation.getIdNumber());
                System.out.println("Name: " + reservation.getName());
                System.out.println("Date: " + reservation.getDate());
                System.out.println("Time: " + reservation.getTime().toUpperCase());
                System.out.println("Number of Adults: " + reservation.getNumAdults());
                System.out.println("Number of Children: " + reservation.getNumChildren());
                System.out.println();
            }
        }
    }

    public void updateReservation() {

    	int id = validatePositiveInt(integer, "Enter reservation ID to update: ");
    	
        Restaurant reservationToUpdate = null;
        for (Restaurant reservation : reservations) {
            if (reservation.getIdNumber() == id) {
                reservationToUpdate = reservation;
                break;
            }
        }

        if (reservationToUpdate != null) {
            System.out.println("Current details:");
            reservationToUpdate.displayDetails();

            System.out.println("Enter new details:");

            String name = validateNotEmpty(string,"Enter name: ");
            reservationToUpdate.setName(name);

            String date = validateNotEmpty(string,"Enter date: ");
            reservationToUpdate.setDate(date);

            String time = validateNotEmpty(string,"Enter time: ");
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

    	int id = validatePositiveInt(integer,"Enter reservation ID to delete: ");

        Restaurant reservationToRemove = null;
        for (Restaurant reservation : reservations) {
    	   if (reservation.getIdNumber() == id) {
    	         reservationToRemove = reservation;
    	         break;
    	      }
    	  }

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
    	
    	int totalAdults = 0;
        int totalChildren = 0;
        int grandTotal = 0;

           
     if (reservations.isEmpty()) {
        System.out.println("No reservations found.");
         return;
     }
    	 
     
    for (Restaurant reservation : reservations) {
         int reservationSubtotal = (reservation.getNumAdults() * 500) + (reservation.getNumChildren() * 300);
       	 reservation.displayDetails();
        	 
             totalAdults += reservation.getNumAdults();
             totalChildren += reservation.getNumChildren();
             grandTotal += reservationSubtotal;
             System.out.println();
         }

         System.out.println("Total Adults: " + totalAdults);
         System.out.println("Total Children: " + totalChildren);
         System.out.println("Grand Total: " + grandTotal + " (including taxes, etc.)");
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
    //this method is most likely like my method validatepostiveFloat the difference between them is that this method
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
  
    public static String validateDate(Scanner scanner, String prompt) {
        String input;
        String regex = "(?i)^(jan|feb|mar|apr|may|jun|jul|aug|sep|sept|oct|nov|dec) (\\d{1,2}), (\\d{4})$";

        do {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Please don't leave it blank.\n");
            } else if (!input.matches(regex)) {
                System.out.println("Invalid input. "
                		+ "\nDate should be in the format of 3-letter abbreviation month (ex: Jan)"
                		+ "\nor 4-letter abbreviation month (ex: Sept)"
                		+ "\nor full month name (ex: February),"
                		+ "\nfollowed by a space, day (1-31), comma, space, and a 4-digit year.\n");
            }
        } while (input.isEmpty() || !input.matches(regex));
        return input;
    }
    public static String validateTime(Scanner scanner, String prompt) {
        String input;
        String regex = "^(0[1-9]|1[0-2]):[0-5][0-9] [APap][mM]$";

        do {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Please don't leave it blank.\n");
            } else if (!input.matches(regex)) {
                System.out.println("Invalid input. Time should be in the format of HH:MM AM/PM (e.g., 09:30 AM).\n");
            }
        } while (input.isEmpty() || !input.matches(regex));
        return input;
    }
}



