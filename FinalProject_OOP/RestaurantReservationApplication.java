package FinalProject_OOP;
import java.util.Scanner;
public class RestaurantReservationApplication {

	public static void main(String[] args) {
		 ReservationSystem reservationSystem = new ReservationSystem();
	        Scanner userInput = new Scanner(System.in);

	        char option;
	        do {
	            System.out.println("\n----- Restaurant Reservation System Menu -----");
	            System.out.println("a. View all Reservations");
	            System.out.println("b. Make Reservation");
	            System.out.println("c. Update Reservation");
	            System.out.println("d. Delete Reservation");
	            System.out.println("e. Generate Report");
	            System.out.println("f. Exit");
	            System.out.print("Enter your choice from [a-f || A-F]: ");
	            option = reservationSystem.validateOption("");
	            switch (option) {
	                case 'a':
	                    reservationSystem.viewReservations();
	                    break;
	                case 'b':
	                    reservationSystem.makeReservation();
	                    break;
	                case 'c':
	                	reservationSystem.updateReservation();
	                    break;
	                case 'd':
	                    reservationSystem.deleteReservation();
	                    break;
	                case 'e':
	                    reservationSystem.generateReport();
	                    break;
	                case 'f':
	                    System.out.println("Exiting...\nThank your for Using Dominc Ramos's RESTAURANT DINING RESERVATION SYSTEM");
	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        } while (option != 'f');
	    }
	}

//Copyrights © https://github.com/Dramos02
