public class Main{
	public static void main(String args[]){
	Bus b1=new Bus();
	System.out.println("Initial Seats:");
	b1.displaySeats();
	System.out.println("\nBooking Seat 3");
	b1.reserveSeat(3);
	System.out.println("\nBooking Seat 5");
	b1.reserveSeat(5);
	System.out.println("\nBooking Seat 10");
	b1.reserveSeat(10);
	System.out.println("\nBooking Seat 3 again");
	b1.reserveSeat(3);

	System.out.println("\nFinal Seats:");
	b1.displaySeats();
	b1.countAvailable();
}
}