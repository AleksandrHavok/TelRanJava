package Repeat;

public class WageEmployee extends Person {
    private double price;
    private int hours;

    public WageEmployee (String name,int id, int age, double price, int hours){
        super(name,id,age);
        this.price=price;
        this.hours=hours;
    }

    @Override
    public String toString(){
        return "Wage Employee "+ super.toString() + " salary: " + calcSalary();
    }

    public double calcSalary(){
        return price*hours;
    }
}
