
public class SalaryEmployee extends Person{
	private double salary;
	
	public SalaryEmployee(String name, 
			int age, 
			int id,
			double salary) {
		super(name, age, id);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + salary;
	}
}
