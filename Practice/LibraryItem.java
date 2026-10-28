public class LibraryItem{
	private String itemId;
	private String title;
	private BarcodeLabel label;

public String getItemId(){
	return itemId;
}
public String getTitle(){
	return title;
}
public LibraryItem(String itemId, String title, String barcodeNumber, String shelfCode){
	this.itemId=itemId;
	this.title=title;
	this.label=new BarcodeLabel(barcodeNumber,shelfCode);

}
public void displayInfo(){
	System.out.println("Item ID:" +itemId);
	System.out.println("Title :" +title);
	label.displayLabel();
}
}

