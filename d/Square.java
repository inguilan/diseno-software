package poo;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth(); // El lado del cuadrado es igual al ancho o la longitud del rectángulo
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "Square [side=" + getSide() + ", color=" + getColor() + ", filled=" + isFilled() + "]";
    }
}