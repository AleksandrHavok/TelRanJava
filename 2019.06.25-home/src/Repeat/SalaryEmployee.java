package Repeat;

public class SalaryEmployee extends Person{
    private double salary;

    public SalaryEmployee(String name,int id,int age,double salary){
        super(name,id,age);
        this.salary=salary;
    }

    @Override
    public String toString(){
        return "Salary Employee: " + super.toString() + " salary: " + salary;
    }

    public double calcSalary(){
        return salary;
    }
}
