package Assignment2;

public class Car {
	public int noOfDoor=4,noOfSeats=5, stepnee=1;
	public String Name="ford";
	public void exterior()
	{	
		System.out.println("Car_Name:---"+Name);
		System.out.println("no_of_doors:---"+noOfDoor);
		System.out.println("no_of_seats:---"+noOfSeats);
		System.out.println("no_of_stepne:---"+stepnee);		
		
	}
		public static void main(String[] args) {
			CarInterior ford=new CarInterior();
			ford.intro();
		

	}

}
