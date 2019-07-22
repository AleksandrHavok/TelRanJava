
public class TestCompany {

	public static void main(String[] args) {
		Company comp = new Company();
//		Person p1 = new WageEmployee("Vasya", 23, 123, 10, 17.5);
//		Person p2 = new SalaryEmployee("Petya",27,321,3000.0);
//		Person p3 = new Person("Sofa",21,432);
//		Person p4 = new SalaryEmployee("David",34,123,6000.0);
//
//		System.out.println(comp.add(p1));
//		System.out.println(comp.add(p2));
//		System.out.println(comp.add(p3));
//		System.out.println(comp.add(p4));
//
//		System.out.println(comp.size());
//
//		comp.printReport();
//
//		System.out.println(comp.remove(555));
//		System.out.println(comp.size());
//
//		System.out.println(comp.remove(123));
//		System.out.println(comp.size());
//		comp.printReport();
		
		comp.add(new SalaryEmployee("Person1",23,1,1000));
		comp.add(new SalaryEmployee("Person2",23,2,1000));
		comp.add(new SalaryEmployee("Person3",23,3,1000));
		comp.add(new SalaryEmployee("Person4",23,4,1000));
		comp.add(new SalaryEmployee("Person5",23,5,1000));
		comp.add(new SalaryEmployee("Person6",23,6,1000));
		comp.add(new SalaryEmployee("Person7",23,7,1000));
		comp.add(new SalaryEmployee("Person8",23,8,1000));
		comp.add(new SalaryEmployee("Person9",23,9,1000));
		comp.add(new SalaryEmployee("Person10",23,10,1000));
		comp.add(new SalaryEmployee("Person11",23,10,1000));

		comp.add(new SalaryEmployee("Person12",23,11,1000));
		comp.add(new SalaryEmployee("Person13",23,11,1000));
		comp.printReport();


		comp.remove(5);
		comp.remove(7);
		comp.printReport();
//		TestStaticCompany.main(null);
//		TestStaticCompany.test();
//		TestStaticCompany test = new TestStaticCompany();
//		test.test();
	}

}
