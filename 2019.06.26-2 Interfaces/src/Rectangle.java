public class Rectangle implements IShape {
private double a;
private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPer() {
        return (a+b)*2;
    }

    @Override
    public double getArea() {
        return a*b;
    }
}
