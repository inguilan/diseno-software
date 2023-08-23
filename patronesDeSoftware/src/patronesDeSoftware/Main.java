package patronesDeSoftware;

public class Main {

	public static void main(String[] args) {
		//create objects of the class student
		estudiante student1=new estudiante("Juan", 20);
		estudiante student2=new estudiante("Maria", 24);
		//accessing object methods and attributes
		student1.displayInfo();
		student2.displayInfo();
	}

}
