package HotelManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Room> rooms;
    private static  ArrayList<Guest> guests;
    private static ArrayList<Employee> employees;
    private static ArrayList<Reservation> reservations;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rooms = new ArrayList<>();
		guests = new ArrayList<>();
		employees = new ArrayList<>();
		reservations = new ArrayList<>();
		int i = 0;
		while(i != 17) {
			System.out.println("WELCOME TO HOTEL MANAGEMENT SYSTEM");
			System.out.println("1. Add new rooms");
			System.out.println("2. Show all rooms");
			System.out.println("3. Edit rooms data");
			System.out.println("4. Add new guests");
			System.out.println("5. Show all guests");
			System.out.println("6. Search guests by name");
			System.out.println("7. Edit guests data");
			System.out.println("8. Create new reservations");
			System.out.println("9. Show all reservations");
			System.out.println("10. Get reservation by guest name");
			System.out.println("11. Get reservation by id");
			System.out.println("12. Edit reservations");
			System.out.println("13. Pay reservation");
			System.out.println("14. Add new Employee");
			System.out.println("15. Show all Employee");
			System.out.println("16. Edit Employee's data");
			System.out.println("17. Quit");
			
			
			Scanner scanner = new Scanner(System.in);
			i = scanner.nextInt();
			switch(i) {
			case 1: 
				RoomsController.AddNewRoom(rooms, scanner);
				break;
			case 2: 
				RoomsController.showAllRooms(rooms);
				break;
			case 3:
				RoomsController.editRoom(rooms,scanner);
				break;
			case 4:
				GuestsController.addNewGuest(guests, scanner);
				break;
			case 5:
				GuestsController.showAllGuests(guests);
				break;
			case 6:
				GuestsController.searchGuestByName(guests, scanner);
				break;
			case 7:
				GuestsController.editGuest(guests,scanner);
				break;
			case 8:
				ReservationsController.createNewReservation(guests, rooms, reservations, scanner);
				break;
			case 9:
				ReservationsController.showAllReservations(reservations, scanner);
				break;
			case 10:
				ReservationsController.getReservationbyGuestName(reservations, scanner);
				break;
			case 11:
				ReservationsController.getReservationbyGuestId(reservations, scanner);
				break;
			case 12:
				ReservationsController.editReservation(guests, rooms, reservations, scanner);
				break;
			case 13:
				ReservationsController.payReservation(reservations, scanner);
				break;
			case 14:
				EmployeesController.addNewEmployee(employees, scanner);
				break;
			case 15:
				EmployeesController.showAllEmployees(employees);
				break;
			case 16:
				EmployeesController.editEmployeeData(employees, scanner);
				break;
			case 17:
				scanner.close();
				break;
			}
		  }
		}
}

