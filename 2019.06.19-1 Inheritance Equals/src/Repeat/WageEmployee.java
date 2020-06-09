package Repeat;

//В данном классе по большому счету ничего нового, небольшое наследование от Person
public class WageEmployee extends Person{
    private double hourPrice;
    private int hours;

    public WageEmployee(String name, int age, double hourPrice, int hours){
        super(name,age);
        this.hourPrice=hourPrice;
        this.hours=hours;
    }

    @Override
    public String toString(){
        return "WageEmployee: " + super.toString() + " salary = " + calcSalary();
    }

    public double calcSalary(){
        return hourPrice* hours;
    }
}
