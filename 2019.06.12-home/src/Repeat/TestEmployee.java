package Repeat;

public class TestEmployee {
    public static void main(String[] args) {
        SalaryEmployee s1 = new SalaryEmployee();
        SalaryEmployee s2 = new SalaryEmployee(-15, "Sasha", 3121);
        s1.display();
        System.out.println(s1.getName() + " has salary =" + s1.calcSalary());
        s1.setId(2345);
        System.out.println("Set id = " + s1.getId() + " for " + s1.getName());
        s1.setSalary(125);
        System.out.println("Set salary = " + s1.calcSalary() + " for " + s1.getName());
        s1.display();
        System.out.println("Employee " + s1.getId() + " has salary " + s1.calcSalary());
        s2.display();
        System.out.println("Employee " + s2.getId() + " has salary " + s2.calcSalary());

        System.out.println("---------------------");
        WageEmployee w1 = new WageEmployee();
        WageEmployee w2 = new WageEmployee(-12, "Petya", 125.25, 8);
        w1.display();
        w1.setHours(2);
        System.out.println("Set hours = " + w1.getHours() + " for " + w1.getName());
        w1.setHourPrice(10);
        System.out.println("Set hour price = " + w1.getHourPrice() + " for " + w1.getName());
        w1.display();
        System.out.println("Employee " + w1.getId() + " has salary " + w1.calcSalary());
        w2.display();
        System.out.println("Employee " + w2.getId() + " has salary " + w2.calcSalary());
    }
}
