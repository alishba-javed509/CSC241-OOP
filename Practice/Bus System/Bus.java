public class Bus{
	Seat[] seats=new Seat[8];
	Bus(){
	for(int i=0;i<seats.length;i++){
		seats[i]=new Seat(i+1);
	}
}
	void displaySeats(){
	for(int i=0;i<seats.length;i++){
	seats[i].display();
	}
}
	void reserveSeat(int number){
	if(number<1 || number>seats.length){
	System.out.println("Invalid Seat Number");
}
else if(seats[number-1].reserved ==true){
	System.out.println("Seat already reserved");
}
else{
	seats[number-1].reserve();
	System.out.println("Seat reserved successfully");
}
}
	void countAvailable(){
	int count=0;
	for(int i=0; i<seats.length; i++){
		if(seats[i].reserved==false){
		count++;
}
}
	System.out.println("Available seats:" +count);
}
}