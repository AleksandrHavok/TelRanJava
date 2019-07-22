public class Triangle extends Shape {

    public Triangle(double value) {
        super(value);
    }
//    @Override
    double getPerimeter() {
        return 3*getValue();
    }

//    @Override
    double getArea() {
        return (Math.pow(getValue(),2)*Math.sqrt(3))/4;
    }

//    @Override
    public String toString() {
        return "Trangle "+super.toString();
    }
}
