public class TestEmployee {

    public static void main(String[] args) {

        Person p1=new Person(12345,23,"Vasya");
//        p1.setName("Vasya");
//        p1.setAge(15);
//        p1.setId(12345);

        WageEmployee wempl1=new WageEmployee();
        wempl1.setName("Petya");
        wempl1.setAge(32);
        wempl1.setId(54321);
        wempl1.setHours(10);
        wempl1.setPrice(28.0);

        WageEmployee wempl2=new WageEmployee(87654,32,"David",100,34.5);

        SalaryEmployee sempl1=new SalaryEmployee(678954,27,"Sofa",4000.0);
//        sempl1.setName("Sofa");
//        sempl1.setAge(27);
//        sempl1.setId(678954);
//        sempl1.setSalary(4000.0);

        System.out.println(p1.toString());
        System.out.println(wempl1.toString());
        System.out.println(wempl2.toString());
        System.out.println(sempl1.toString());
    }
}
