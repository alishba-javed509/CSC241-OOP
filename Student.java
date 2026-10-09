public class Student{
	private String name;
	private double cgpa;
	private int id;
	private static int count=1;
public Student(String name, double cgpa){
	id=count++;
	this.name=name;
	setCgpa(cgpa);
}
public Student(String name){
	this(name,0.0);
}
public Student(){
	this("Tehreem",0.0);

}
public void setCgpa(double value){
	if(value>=0.0 && value<=4.0)
	cgpa=value;
}	
public double getCgpa(){
	return cgpa;
}
public void display(){
	System.out.println("ID: "+id);
	System.out.println("Name: "+name);
	System.out.println("CGPA: "+cgpa);
	
}
}
