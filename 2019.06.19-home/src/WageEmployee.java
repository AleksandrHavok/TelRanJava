public class WageEmployee extends Person {
    private double price;
    private int hours;

    public WageEmployee(int id, String name, int age, double price, int hours) {
        super(id, name, age);
        this.price = price;
        this.hours = hours;
    }

    public double calcSalary() {
        return hours * price;
    }

    @Override
    public String toString() {
        return super.toString() + " " + price + " " + hours;
    }
}
