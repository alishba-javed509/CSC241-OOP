public class LibrarySection{
	private String sectionName;
	private LibraryItem[] items;
	private int count;
public LibrarySection(String sectionName){
	this.sectionName=sectionName;
	this.items=new LibraryItem[4];
	this.count=0;
}

public void addItem(LibraryItem item){
	if(count>=items.length){
	System.out.println("Section Full. Cannot add: "+ item.getTitle());
	return;
}
	items[count]=item;
	count++;
	System.out.println("Added: " +item.getTitle());
}

public void displayItems(){
	System.out.println("========" +sectionName +"========");
	for(int i=0; i<count; i++){
	items[i].displayInfo();
 	System.out.println("------------------------------------");

}
}
}