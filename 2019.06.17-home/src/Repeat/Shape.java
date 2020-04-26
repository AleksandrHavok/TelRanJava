package Repeat;

public class Shape {
    private double value;

    public Shape(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getPerimeter() {
        return 0;
    }

    public double getArea() {
        return 0;
    }

    /* В нашем случае не используем метод toString и не делаем
    его @Override в наследниках
    Цель - реализовать ДЗ не используя полиморфизм вида super.toString()

    public String toString(){
        return "Perimeter = "+getPerimeter()+ " Area = " + getArea();
    }

     */
}
