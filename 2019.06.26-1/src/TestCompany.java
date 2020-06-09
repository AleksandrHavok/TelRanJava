
public class TestCompany {

	public static void main(String[] args) {
		Company comp = new Company();
		for (int i=0;i<100;i++){
			comp.add(new SalaryEmployee(i,"Person"+i,25,1000));
		}
		comp.printReport();

	}

}
