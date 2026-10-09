public class Product{
	private String id;
	private String name;
	private double price;
	private int quantity;
	private static int count=0;
	private static double maxPrice;
	private static double minPrice;
	
public Product (String name, int quantity,double price){
	this.id=String.format("p%03d" , count++);
	this.name=name;
	this.price=price;
	this.quantity=quantity;

	if (count ==1){
	maxPrice=price;
	minPrice=price;
}
	if(count>1 && minPrice>price)
	minPrice=price;
	if(count>1 && minPrice<price)
	maxPrice=price;
}
        public void display(){
	System.out.println("ID: \n " +id);
	System.out.println("NAME: \n"+ name);
	System.out.println("QUANTITY: \n" + quantity);
	System.out.println("PRICE: \n" +price);
	System.out.printf("MAX PRICE: %f\n" ,maxPrice);
	System.out.printf("MIN PRICE: %f\n" ,minPrice);
}



}