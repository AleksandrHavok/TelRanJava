public class Square extends Shape {
    public Square(double value) {
        super(value);
    }

    @Override
    double getPerimeter() {
        return 4 * getValue();
    }

    @Override
    double getArea() {
        return Math.pow(getValue(), 2);
    }

    @Override
    public String toString() {
        return "Square " + super.toString();
    }
}
