public class Demo{
	public static void main(String args[]){
	Book b1=new Book("101" , "English" , "BC5001" , "CS-A1" , "Shakespeare");
	Book b2= new Book("102", "Urdu" , "BC5002" ,"CS-A2" , "Allama Iqbal");
	Magazine m1=new Magazine("M201", "Tech Today", "BC2001", "CS-M1", 45);

LibrarySection section=new LibrarySection("Computing Section");
	section.addItem(b1);
	section.addItem(b2);
	section.addItem(m1);
	
	section.displayItems();

	Book b3=new Book("103" ,"Science" , "BC5003" , "CS-A3", "Ibn-e-sina");
	Magazine m2=new Magazine("M301", "Fashion week ", "BC2002", "CS-M2", 50);
	section.addItem(b3);
	section.addItem(m2);

	section.displayItems();

	Book b4=new Book("107" ,"Discrete" , "BC5005" , "CS-A6", "Kenneth");
	section.addItem(b4);
	

}
}
	