package HotelManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomsController {
	
	public static void AddNewRoom(ArrayList<Room> rooms,Scanner scanner) {
		System.out.println("Enter room number: ");
		int number = scanner.nextInt();
		System.out.println("Enter floor : ");
		int floor = scanner.nextInt();
		System.out.println("Enter capacity:");
		int capacity = scanner.nextInt();
		System.out.println("Enter room type :");
		String type = scanner.next();
		System.out.println("Enter description :");
		String description = scanner.next();
		System.out.println("Enter price :");
		double price = scanner.nextDouble();
		Room room = new Room(rooms.size(), number, floor, capacity, type, description, price);
		rooms.add(room);
		System.out.println("Room Added Successfully!!");
	}
	
	public static void showAllRooms(ArrayList<Room> rooms) {
		for(Room room : rooms) {
			System.out.println("---------------------");
			room.print();
			System.out.println("---------------------");
			
		}
		
	}

	public static void editRoom(ArrayList<Room> rooms, Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("Enter room id: \n-1 to show all rooms");
		int id = scanner.nextInt();
		if(id == 1) {
			showAllRooms(rooms);
			System.out.println("Enter room id: \n-1 to show all rooms");
			int j = scanner.nextInt();
			id = j;
			}
	
		Room room = getRoomById(id, rooms); 
		System.out.println("Enter floor (int): \n-1 to keep it");
		int floor = scanner.nextInt();
		if(floor == -1) floor = room.getFloor();
		
		System.out.println("Enter capacity (int): \n-1 to keep it");
		int capacity = scanner.nextInt();
		if(capacity == -1) capacity = room.getCapacity();
		
		System.out.println("Enter room type (String): \n-1 to keep it");
		String type = scanner.next();
		if(type.equals("-1")) type = room.getType();
		
		System.out.println("Enter room description (String): \n-1 to keep it");
		String description= scanner.next();
		if(description.equals("-1")) description = room.getDescrption();
		
		System.out.println("Enter room price (double): \n-1 to keep it");
		double price = scanner.nextDouble();
		if(price == -1) price = room.getPrice();
		
		
		room.setFloor(floor);
		room.setCapacity(capacity);
		room.setType(type);
		room.setPrice(price);
		room.setDescription(description);
		//rooms.set(id, room);

        for(Room r : rooms) {
        	if(r.getId()==id) {
        		r = room;
        		break;
        	}
        }
		
		
	}

	
	

	public static Room getRoomById(int id, ArrayList<Room> rooms) {
		// TODO Auto-generated method stub
		Room room = new Room();
		for(Room r : rooms) {
			if(r.getId()==id) {
				r = room;
				break;
			}
		}
		return room;
	}
	
	public static Room getRoomByNumber(int number, ArrayList<Room> rooms) {
		// TODO Auto-generated method stub
		Room room = new Room();
		for(Room r : rooms) {
			if(r.getNumber()==number) {
				room = r;
				break;
			}
		}
		return room;
	}

	

}
