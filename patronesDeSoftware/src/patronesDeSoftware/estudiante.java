package patronesDeSoftware;

public class estudiante {

	//attributes
	private String name;
	private int age;
	//constructor
	public estudiante(String name, int age) {
		this.name=name;
		this.age=age;
	}
	//methods
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public void displayInfo() {
		System.out.println("nombre: "+name);
		System.out.println("edad: "+age);
	}
	
	
	
	
	
	
	
}
