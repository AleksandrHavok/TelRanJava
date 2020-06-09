public class SalaryEmployee extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public SalaryEmployee(int id, int age, String name, double salary) {
        super(id, age, name);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+" "+salary;
    }
}
