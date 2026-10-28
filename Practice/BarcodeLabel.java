public class BarcodeLabel{
	private String barcodeNumber;
	private String shelfCode;
public BarcodeLabel(String barcodeNumber, String shelfCode){
	this.barcodeNumber=barcodeNumber;
	this.shelfCode=shelfCode;

}
public void displayLabel(){
	System.out.println("Barcode Number:" + barcodeNumber);
	System.out.println("Shelf code:" + shelfCode);
}
}