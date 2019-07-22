public class Circle implements IShape{

    private  double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double getPer() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
