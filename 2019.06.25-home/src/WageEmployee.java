
public class WageEmployee extends Person{
	private int hours;
	private double price;
	public WageEmployee(String name, 
			int age, 
			int id,
			int hours,
			double price) {
		super(name, age, id);
		this.hours = hours;
		this.price = price;
	}
	
	public double calcSalary() {
		return hours * price;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + calcSalary();
	}

}
