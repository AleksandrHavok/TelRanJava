package Repeat;

public class Circle extends Shape {

    public Circle(double value) {
        super(value);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getValue();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getValue(), 2);
    }

    public String toString() {
        return "Circle perimeter = " + getPerimeter() + " Area = " + getArea();
    }
}
