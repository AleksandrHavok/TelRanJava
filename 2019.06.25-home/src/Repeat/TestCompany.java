package Repeat;

public class TestCompany {
    public static void main(String[] args){

        Company comp = new Company();

        for (int i=0;i<5;i++){
            comp.add(new SalaryEmployee("Salary name"+i,100+i,10+i,100*(1+i)));
        }
        for (int i=0;i<5;i++){
            comp.add(new WageEmployee("Wage name"+i,200+i,20+i,100+i,1*(1+i)));
        }
        comp.remove(103);
        System.out.println(comp.size());
        comp.printReport();
        System.out.println("-----------------");
        comp.add(new SalaryEmployee("Sasha",1,25,5000));
        comp.add(new SalaryEmployee("Sergey",1,25,5000));
        comp.add(new SalaryEmployee("Misha",2,28,6000));
        comp.add(new WageEmployee("Petya",3,23,230,10));
        comp.add(new WageEmployee("Antony",4,22,250,8));
        System.out.println(comp.size());
        comp.printReport();
        System.out.println("-----------------");
        comp.remove(102);
        comp.remove(203);
        comp.remove(3);
        comp.remove(204);
        System.out.println(comp.size());
        comp.printReport();
    }
}
