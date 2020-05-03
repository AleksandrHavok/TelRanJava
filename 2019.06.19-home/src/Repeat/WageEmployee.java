package Repeat;

public class WageEmployee extends Person {
    private double price;
    private int hours;

    public WageEmployee(int id,String name,int age, double price, int hours){
        super(id,name,age);
        this.price=price;
        this.hours=hours;
    }

    public double calcSalary(){
        return price*hours;
    }

    @Override
    public String toString(){
        return "WageEmployee: " + super.toString() + " salary: "+ calcSalary();
    }
}
