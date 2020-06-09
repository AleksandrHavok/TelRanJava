public class TestEmployee {
    public static void main(String[] args) {

        WageEmployee wempl1 = new WageEmployee("Vasya", 19, 30, 5);
        SalaryEmployee sempl1 = new SalaryEmployee("Sanya", 24, 1950);

        System.out.println(wempl1.toString());
        System.out.println(sempl1.toString());

        Person p1 = new WageEmployee("Petya", 25, 100, 5);//upcasting- приведение наследника к родителю.
        Person p2 = new SalaryEmployee("David", 35, 3000);
        Person[] arr = {p1, p2, wempl1, sempl1};
        System.out.println("===============================");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
        arr = new Person[10];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = wempl1;
        arr[3] = sempl1;
        arr[4] = new Person("Anna", 27);


        if (p2 instanceof WageEmployee) {//instanceof-проверка на то является ли переменная объектом введенного типа данных
            WageEmployee tmp = (WageEmployee) p2;//downcasting-родитель приводится к наследнику. Требуется явное приведение.
            System.out.println(tmp.calcSalary());
        }

        System.out.println("TotalSalary " + totalSalary(arr));
        System.out.println("TotalSalary " + totalSalary(null));
    }

    static double totalSalary(Person[] arr) {
        if (arr == null) {
            return 0;
        }
        double salary = 0;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] instanceof WageEmployee) {
                    WageEmployee tmp = (WageEmployee) arr[i];
                    salary += tmp.calcSalary();
                } else if (arr[i] instanceof SalaryEmployee) {
                    SalaryEmployee tmp = (SalaryEmployee) arr[i];
                    salary += tmp.getSalary();
            }
        }
        return salary;
    }
}
