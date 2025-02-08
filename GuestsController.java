package HotelManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class GuestsController {
	
	public  static void addNewGuest(ArrayList<Guest> guests, Scanner scanner) {
		System.out.println("Enter name: ");
		String name = scanner.next();
		System.out.println("Enter email: ");
		String email = scanner.next();
		System.out.println("Enter discount (int): ");
		int discount = scanner.nextInt();
		Guest guest = new Guest(guests.size(), name, email, discount);
		guests.add(guest);
	}
	
	public static void showAllGuests(ArrayList<Guest> guests) {
		for(Guest  guest : guests) {
			System.out.println("---------------------");
			guest.print();
			System.out.println("---------------------");
			System.out.println();
		}
	}

	public static void searchGuestByName(ArrayList<Guest> guests, Scanner scanner) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter name: ");
		String name = scanner.next();
		System.out.println();
		for(Guest guest : guests) {
			if(guest.getName().equals(name)) guest.print();
		}
		
	}
	
	public static void editGuest(ArrayList<Guest> guests, Scanner scanner) {
		System.out.println("Enter Guest Id :");
		int id = scanner.nextInt();
		if(id == -1) {
			searchGuestByName(guests, scanner);
			System.out.println("Enter Guest Id :");
			 id = scanner.nextInt();
		}
		 Guest guest = guests.get(id);
		System.out.println("Enter name: \n-1 to keep it");
		String name = scanner.next();
		if(name.equals("-1")) name = guest.getName();
          
		System.out.println("Enter email: \n-1 to keep it");
		String email = scanner.next();
		if(email.equals("-1")) email = guest.getEmail();
		
		System.out.println("Enter discount: \n-1 to keep it");
		int discount = scanner.nextInt();
		if(discount == -1)discount = guest.getDiscount();
		
		guest.setName(name);
		guest.setEmail(email);
		guest.setDiscount(discount);
		guests.set(id, guest);
		
	}

}
