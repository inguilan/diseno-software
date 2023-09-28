package poo;


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0, "red");
        System.out.println("Circle: " + circle);
        System.out.println("Circle Area: " + circle.calculateArea());

        Cylinder cylinder = new Cylinder(1.0, "red", 1.0);
        System.out.println("Cylinder: " + cylinder);
        System.out.println("Cylinder Volume: " + cylinder.calculateVolume());
    }
}