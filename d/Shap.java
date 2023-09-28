package poo;


public class Shap {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println("Shape ");
        System.out.println(shape1);
        System.out.println("____");

        Circle1 circle1 = new Circle1();
        System.out.println("Circle ");
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println("____");

        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle ");
        System.out.println(rectangle1);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println("____");

        Square square1 = new Square();
        System.out.println("Square ");
        System.out.println(square1);
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());
        System.out.println("____");
    }
}