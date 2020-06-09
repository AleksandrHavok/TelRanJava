
public class WageEmployee extends Person {
    private int hours;
    private double price;

    public WageEmployee(int id,
                        String name,
                        int age,
                        int hours,
                        double price) {
        super(id, name, age);
        this.hours = hours;
        this.price = price;
    }

    @Override
    public double calcSalary() {
        return hours * price;
    }

    @Override
    public String toString() {
        return super.toString() + " " + calcSalary();
    }

}
