
public class SalaryEmployee extends Person {
    private double salary;

    public SalaryEmployee(int id,
                          String name,
                          int age,
                          double salary) {
        super(id, name, age);
        this.salary = salary;
    }

    @Override
    public double calcSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + " " + salary;
    }
}
