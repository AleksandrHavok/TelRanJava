package Repeat;

public class Square extends Shape {

    public Square(double value) {
        super(value);
    }

    @Override
    public double getPerimeter() {
        return 4 * getValue();
    }

    @Override
    public double getArea() {
        return Math.pow(getValue(), 2);
    }

    public String toString() {
        return "Square perimeter = " + getPerimeter() + " Area = " + getArea();
    }
}
