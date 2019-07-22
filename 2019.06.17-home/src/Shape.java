public class Shape {

    private double value;

    public Shape(double value) {
        this.value=value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    double getPerimeter() {
        return 0;
    }
    double getArea(){
        return 0;
    }

    public String toString(){
       return "Perimeter: "+getPerimeter()+" Area: "+ getArea();

    }
}
