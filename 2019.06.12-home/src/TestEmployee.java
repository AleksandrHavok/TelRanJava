public class TestEmployee {
    public static void main(String[] args) {
        SalaryEmployee salary1 = new SalaryEmployee();
        SalaryEmployee salary2 = new SalaryEmployee(1203, "Vasya", 30000);
        WageEmployee wage1 = new WageEmployee();
        WageEmployee wage2 = new WageEmployee(1234, "Petya", 100, 15);

        salary1.display();
        System.out.println(salary1.getName()+" salary is "+salary1.calcSalary());
        salary1.setId(4000);
        System.out.println("set id is "+salary1.getId());
        salary1.display();

        salary2.display();
        System.out.println(salary2.getName()+" salary is "+salary2.calcSalary());
        System.out.println("===============");
        wage1.display();
        System.out.println("Calc salary of "+wage1.getName()+" is "+wage1.calcSalary(wage1.getHourPrice(), wage1.getHours()));
        wage2.display();
        System.out.println("Calc salary of "+wage2.getName()+" is "+wage2.calcSalary(wage2.getHourPrice(), wage2.getHours()));
    }
}
