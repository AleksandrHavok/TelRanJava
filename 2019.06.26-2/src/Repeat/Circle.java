package Repeat;

//класс реализует интерфейс IShape
public class Circle implements IShape {

    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    //при реализации интерфейса обязательно должна быть указана реализация всех методов интерфейса
    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPer() {
        return 2*Math.PI*radius;
    }
}
