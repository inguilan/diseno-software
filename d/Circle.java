package poo;

class Circle {
    protected double radius;
    protected String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return calculateArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder [radius=" + radius + ", color=" + color + ", height=" + height + "]";
    }
}