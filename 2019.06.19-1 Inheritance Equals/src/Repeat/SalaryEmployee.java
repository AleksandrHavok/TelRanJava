package Repeat;

//В данном классе по большому счету ничего нового, небольшое наследование от Person
public class SalaryEmployee extends Person {
    private double salary;
    public SalaryEmployee(String name, int age, double salary){
        super(name,age);
        this.salary=salary;
    }

    @Override
    public String toString(){
        return "SalaryEmployee: "+ super.toString()+ " salary = " + salary;
    }

    public double getSalary(){
        return salary;
    }
}
