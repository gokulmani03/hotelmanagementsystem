
	package HotelManagementSystem;

	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	import java.util.ArrayList;

	public class Room {
		
		private int id;
		private int number;
		private int floor;
		private int capacity;
		private String type;
		private String description;
		private double price;
		private boolean avaible;
		private ArrayList<String> reservedDates;
		
		public Room(int id, int number, int floor, int capacity, String type, String description, double price) {
			this.id = id;
			this.number = number;
			this.floor = floor;
			this.capacity = capacity;
			this.type = type;
			this.description = description;
			this.price = price;
			reservedDates = new ArrayList<>();
		}
		
			public Room() {
			    reservedDates = new ArrayList<>();
			}
			public int getId(){
				return id;
			}
			public int getNumber() {
				return number;
			}
			public int getFloor() {
				return floor;
			}
			public String getType() {
				return type;
			}
			public int getCapacity() {
				return capacity;
			}
			public String getDescrption() {
				return description;
			}
			public double getPrice() {
				return price;
			}
			public boolean getAvaible() {
				return avaible;
			}
			
			public void setId(int id) {
				this.id = id;
			}
			public void setNumber(int number) {
				this.number = number;
			}
			public void setType(String type) {
				this.type = type;
			}
			public void setFloor(int floor) {
				this.floor = floor;
			}
			public void setCapacity(int capacity) {
				this.capacity = capacity;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			public void setPrice(double price) {
				this.price = price;
			}
			
			public void Reserve(LocalDate startDate, LocalDate finishDate) {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy:MM:dd"); 
				for(LocalDate date = startDate;date.isBefore(finishDate);date = date.plusDays(1)) {
					String d = date.format(formatter);
					reservedDates.add(d);
				}
			}
			
			public boolean isReserved(LocalDate startDate, LocalDate finishDate) {
				boolean b = false;
			    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy:MM:dd"); 
				for(LocalDate date = startDate;date.isBefore(finishDate);date=date.plusDays(1)) {
					String d = date.format(formatter);
		            if(reservedDates.contains(d)) {
		            	b = true;
		            break;
				}
			}
				return b;
		}
		public void print() {
			System.out.println("id: "+ id);
			System.out.println("Number: "+ number);
			System.out.println("Floor: "+ floor);
			System.out.println("Capacity: "+ capacity);
			System.out.println("Type: "+ type);
			System.out.println("Description:" + description);
			System.out.println("Price:"+ price);
			
			
		}
	}



