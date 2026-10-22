public class Seat{
	int seatNumber;
	boolean reserved;

	Seat(int number){
	seatNumber= number;
	reserved=false;
}
	void reserve(){
	reserved=true;
}
	void display(){
	if(reserved){
	System.out.println("Seat" +seatNumber + "Reserved");
}
else{
	System.out.println("Seat"+ seatNumber + "Available"); 
}
}
}
