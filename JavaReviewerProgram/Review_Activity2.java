package SecondYear_2ndSem;
import java.util.Scanner;
import java.util.ArrayList;
public class Review_Activity2 {
	public static void main(String[] args) {
		
		ArrayList<String> receipt = new ArrayList<String>();
		
		ArrayList<String> beverages = new ArrayList<String>();
			beverages.add("Coke");
			beverages.add("Royale");
			beverages.add("Sprite");
			beverages.add("Sarsi");
	
		ArrayList<Integer> price = new ArrayList<Integer>();
			price.add(20);
			price.add(23);
			price.add(19);
			price.add(25);
	
		
	
			String customer_Order, customer_Option;
			Integer total_Bill = 0;
			boolean cashier_run=true;
			
			Scanner cashier = new Scanner(System.in);
	
				while(cashier_run) {
					System.out.println("Beverages available: Coke => P20, Royale => P23, Sprite => P19, Sarsi => P25");
					System.out.print("Purchase Beverages: ");
					customer_Order = cashier.nextLine();
	
						switch (customer_Order) {
							case "Coke":
							case "coke":
								receipt.add(beverages.get(0) + " Php " + price.get(0));
								total_Bill += price.get(0);
								break;
							case "Royale":
							case "royale":
								receipt.add(beverages.get(1) + " Php " + price.get(1));
								total_Bill += price.get(1);
								break;
							case "Sprite":
							case "sprite":
								receipt.add(beverages.get(2) + " Php " + price.get(2));
								total_Bill += price.get(2);
								break;
							case "Sarsi":
							case "sarsi":
								receipt.add(beverages.get(3) + " Php " + price.get(3));
								total_Bill += price.get(3);
								break;
									
								default:
									System.out.println("\n" + customer_Order + " is Invalid and Not Available Beverage!");
							}
						System.out.println("\nDo you want to add more? Yes / No?");
						customer_Option = cashier.nextLine();
	
							switch(customer_Option) {
								case "Yes":
								case "yes":
									cashier_run = true;
										break;
								case "No":
								case "no":
									cashier_run = false;
									System.out.println("\nPlease Pay your Beverage: ");
									break;
				
								default:
									System.out.println("Invalid Option please Try Again");
							}	
					}
					
				for (int i = 0; i < receipt.size(); i++) {
						System.out.println(receipt.get(i));
					}
				System.out.println("Total Amount: " + total_Bill);
	}
}
//Copyrights © https://github.com/Dramos02
