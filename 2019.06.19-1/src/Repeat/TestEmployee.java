package Repeat;

public class TestEmployee {

    public static void main(String[] args){

        WageEmployee we1 = new WageEmployee("Petya", 16,20,5);
        SalaryEmployee se1 = new SalaryEmployee("Kolya", 15, 2000);

        System.out.println(we1.toString());
        System.out.println(se1.toString());

        // upcasting - приведение наследника к родителю
        Person p1 = new WageEmployee("Sasha", 26,200,8);
        Person p2 = new SalaryEmployee("David",36,1900);
        Person[] arr = {p1,p2,we1,se1};
        System.out.println("---------------");
        
        //Упадем в ClassCastExceeption по причине разницы полей между Person и SalaryEmployee.
        //Без upcasting и инстанцирования объекта p3 от класса SalaryEmployee здесь не обойтись
        Person p3 = new Person("Test",999);
        //SalaryEmployee s1 = (SalaryEmployee) p3;
        //System.out.println(p3.toString());
        System.out.println("---------------");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i].toString());
        }

        arr= new Person[10];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = we1;
        arr[3] = se1;
        arr[4] = new Person("Elena", 25);

        //instanceof- проверка, является ли переменная объектом введенного типа данных
        if (p2 instanceof WageEmployee){
            //downcasting - родитель приводится к наследнику, требуется явное приведение
            //явное приведение - необходимость указать класс в скобках
            WageEmployee tmp = (WageEmployee) p2;
            // в ответе ничего не получим, т.к. p2 не является объектом типа WageEmployee
            System.out.println(tmp.calcSalary());
        }
        System.out.println("---------------");
        //проверка того как работает downcasting
        System.out.println(p1 instanceof WageEmployee);
        WageEmployee w1 = (WageEmployee) p1;
        System.out.println(w1.toString());
        System.out.println("---------------");

        System.out.println("Total salary " + totalSalary(arr));
        System.out.println("Total salary " + totalSalary(null));
    }

    static double totalSalary(Person[] arr){
        if (arr==null){
            return 0;
        }
        double salary=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] instanceof WageEmployee){
                WageEmployee tmp = (WageEmployee) arr[i];
                salary+=tmp.calcSalary();
            }
            else if(arr[i] instanceof SalaryEmployee){
                SalaryEmployee tmp = (SalaryEmployee) arr[i];
                salary+=tmp.getSalary();
            }
        }
        return salary;
    }
}
