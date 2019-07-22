public class Circle extends Shape {
    public Circle(double value) {
        super(value);
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * getValue();
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(getValue(), 2);
    }

    @Override
    public String toString() {
        return "Circle " + super.toString();
    }
}
