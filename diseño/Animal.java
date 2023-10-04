package poo;

public class Animal {
	
	private String name; 
	
	public Animal(String name) {
		this.name=name; 
		
		
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
				 
		
	}
		
	
	

}
package poo;

public class Cat extends Mammal {
	
	public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat [" + super.toString() + "]";
    }
	
	

}
package poo;

public class Dog extends Mammal {
	
	
	public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog [" + super.toString() + "]";
    }

}
package poo;

public class Mammal extends Animal{

	public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
    	

        return "Mammal [Animal [name=" + super.toString() +"]";
    }
}
package poo;


public class Maina{
	public static void main(String[]args) {
		Animal animal = new Animal("perro");
        Mammal mammal = new Mammal("perro");
        Cat cat = new Cat("Meow");
        Dog dog = new Dog("Woof");

        
        
        System.out.println(animal);
        System.out.println(mammal);
        System.out.println(cat);
        System.out.println(dog);
	}
}