public class WageEmployee extends Person {
    private double price;
    private int hours;

    public WageEmployee(String name, int age, double price, int hours) {
        super(name, age);
        this.price = price;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "WageEmployee: "+super.toString() + " salary: " + price * hours;
    }

    public double calcSalary(){
        return price*hours;
    }
}
