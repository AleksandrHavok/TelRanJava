package Repeat;

public class WageEmployee extends Person {
    private int hours;
    private double price;

    public WageEmployee(int id,String name,int age,double price,int hours){
        super(id,name,age);
        this.price=price;
        this.hours=hours;
    }

    @Override
    public double calcSalary(){
        return price*hours;
    }
    @Override
    public String toString(){
        return super.toString()+" "+calcSalary();
    }
}
