package Repeat;

public class Triangle extends Shape {
    public Triangle(double value) {
        super(value);
    }

    @Override
    public double getPerimeter() {
        return 3 * getValue();
    }

    @Override
    public double getArea() {
        return (Math.pow(getValue(), 2) * Math.sqrt(3)) / 4;
    }

    public String toString() {
        return "Triangle perimeter = " + getPerimeter() + " Area = " + getArea();
    }
}
