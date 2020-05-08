package Repeat;

//класс реализует интерфейс IShape
public class Rectangle implements IShape{
    private double a;
    private double b;

    public Rectangle(double a,double b){
        this.a=a;
        this.b=b;
    }
    //при реализации интерфейса обязательно должна быть указана реализация всех методов интерфейса
    @Override
    public double getPer(){
        return 2*(a+b);
    }
    @Override
    public double getArea(){
        return a*b;
    }
}
