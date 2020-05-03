package Repeat;


public class TestCompany {
    public static void main(String[] args){
        Person p1 = new Person(1,"1",11);
        Person p2 = new Person (2,"2",12);
        WageEmployee w1 = new WageEmployee (13,"13",13,3,3);
        WageEmployee w2 = new WageEmployee (14,"14",14,4,4);
        WageEmployee w3 = new WageEmployee(15,"15",15,5,5);
        WageEmployee w4 = new WageEmployee(16,"16",15,6,5);
        WageEmployee w5 = new WageEmployee(17,"17",15,7,5);

        SalaryEmployee s1 = new SalaryEmployee(26,"26",26,26);
        SalaryEmployee s2 = new SalaryEmployee (27,"27", 27, 27);
        SalaryEmployee s3 = new SalaryEmployee (28,"28",28,28);
        SalaryEmployee s4 = new SalaryEmployee (29,"29",28,28);
        SalaryEmployee s5 = new SalaryEmployee (30,"30",28,28);

        Company comp = new Company();

        comp.add(p1);
        comp.add(p2);
        comp.printReport();
        System.out.println(comp.size());
        System.out.println("---------------");

        comp.add(w1);
        comp.add(w2);
        comp.add(w3);
        comp.add(w4);
        comp.add(w5);
        comp.add(s1);
        comp.add(s2);
        comp.add(s3);
        comp.add(s4);
        comp.add(s5);
        comp.printReport();
        System.out.println(comp.size());
        System.out.println("---------------");

        comp.remove(14);
        comp.remove(26);
        comp.add(s3);
        comp.printReport();
        System.out.println(comp.size());
        System.out.println("---------------");


        TestStaticCompany.main(null);//main момжно вызывать в других классах из-за того, что он статический
        //TestStaticCompany.test(); --недоступен ибо не статический метод
        TestStaticCompany test = new TestStaticCompany();
        test.test();// можно вызвать потому что вызываем не метод класса, а метод из экземпляра
    }
}
