package Repeat;

/* В данном уроке рассматривается основа наследования на примере класса-родителя Person
и его наследников - WageEmployee и SalaryEmployee
 */
public class TestEmployee {
    public static void main (String[] args){

        Person p1=new Person(123,25,"Petya");

        WageEmployee we1=new WageEmployee();
        we1.setName("Sasha");
        we1.setAge(213);
        we1.setId(623);
        we1.setHours(10);
        we1.setPrice(29.3);

        WageEmployee we2=new WageEmployee(13523,12,"David",50,123.5);

        SalaryEmployee se1= new SalaryEmployee(153746,22,"Lena", 142400.9);

        System.out.println(p1.toString());
        System.out.println(we1.toString());
        System.out.println(we2.toString());
        System.out.println(se1.toString());
    }
}
