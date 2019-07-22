public class TestCompany {
    public static void main(String[] args) {
        Person p1 = new Person(111, "Petya", 18);
        Person p2 = new Person(112, "Petya1", 10);
        //-------------------------------
        WageEmployee w1 = new WageEmployee(221, "Sasha", 19, 100, 5);
        WageEmployee w2 = new WageEmployee(221, "Sasha", 19, 100, 5);
//        WageEmployee w2 = null;
        WageEmployee w3 = new WageEmployee(222, "Sasha2", 20, 100, 5);
        WageEmployee w4 = new WageEmployee(223, "Sasha3", 21, 100, 7);
        WageEmployee w5 = new WageEmployee(224, "Sasha4", 19, 100, 5);
        WageEmployee w6 = new WageEmployee(225, "Sasha5", 19, 100, 5);
        WageEmployee w7 = new WageEmployee(2222, "WageOversize", 25, 5000, 2);
        //-------------------------------
        SalaryEmployee s1 = new SalaryEmployee(331, "Vasya", 20, 1000);
        SalaryEmployee s2 = new SalaryEmployee(332, "Vasya2", 21, 1000);
        SalaryEmployee s3 = new SalaryEmployee(333, "Vasya3", 20, 1000);
        SalaryEmployee s4 = new SalaryEmployee(334, "Vasya4", 21, 1000);
        SalaryEmployee s5 = new SalaryEmployee(335, "Vasya5", 21, 1000);
        SalaryEmployee s6 = new SalaryEmployee(225, "Sasha5", 19, 1000);
        SalaryEmployee s7 = new SalaryEmployee(337, "Vasya7", 21, 1000);
        SalaryEmployee s8 = new SalaryEmployee(3333, "SalaryOversize", 25, 50000);
        //-------------------------------
        Person arr[] = new Person[10];
        arr[0] = p1;
        arr[5] = w1;
        arr[2] = s1;
        Company comp = new Company(arr);
        //New array output
        System.out.println("==============================================");
        System.out.println("+++++First array output+++++");
        System.out.println("==============================================");
        comp.printReport();
        //-------------------------------
        //Check method add
        System.out.println("==============================================");
        //Adding WageEmployee
        System.out.println("+++++Check add+++++");
//        System.out.println(w2);
        comp.add(w2);
//        System.out.println(w3);
        comp.add(w3);
//        System.out.println(w3);
        comp.add(w3);
//        System.out.println(w4);
        comp.add(w4);
//        System.out.println(w5);
        comp.add(w5);
//        System.out.println(w6);
        comp.add(w6);
        //-------------------------------
        //Adding Person
//        System.out.println(p2);
        comp.add(p2);
        //-------------------------------
        //Adding SalaryEmployee
//        System.out.println(s2);
        comp.add(s2);
//        System.out.println(s3);
        comp.add(s3);
//        System.out.println(s4);
        comp.add(s4);
//        System.out.println(s5);
        comp.add(s5);
//        System.out.println(s6);
        comp.add(s6);
//        System.out.println(s2);
        comp.add(s2);
//        System.out.println(s7);
        comp.add(s7);
        //-------------------------------
        //Print array after add
        System.out.println("==============================================");

//        System.out.println("+++++Print after add+++++");
        comp.printReport();
        System.out.println("Total add in array: " + comp.size());
        //-------------------------------
        //Check method remove
        System.out.println("==============================================");

        System.out.println("+++++Check remove+++++");

//        System.out.println(w3);
        comp.remove(w3.getId());
//        System.out.println(w3);
        comp.remove(w3.getId());
//        System.out.println(s3);
        comp.remove(s3.getId());
//        System.out.println(s3);
        comp.remove(s3.getId());
//        System.out.println(s4);
        comp.remove(s4.getId());
        //Print array after remove
        System.out.println("==============================================");
//        System.out.println("+++++Print after remove+++++");
        comp.printReport();
        System.out.println("Total add in array: " + comp.size());
        //-------------------------------
        //Use add after remove
        System.out.println("==============================================");

        System.out.println("+++++Fill null elements before addCell+++++");
//        System.out.println(s6);
        comp.add(s6);
//        System.out.println(s6);
        comp.add(s6);
//        System.out.println(s7);
        comp.add(s7);
//        System.out.println(s3);
        comp.add(s3);
        //Print array after add
        System.out.println("==============================================");
//        System.out.println("+++++Print after remove&add+++++");
        comp.printReport();
        System.out.println("Total add in array: " + comp.size());
        //-------------------------------
        //Check method addCell
        System.out.println("==============================================");
        System.out.println("++++++addCell+++++");
//        System.out.println(w7);
        comp.addCell(w7);
//        System.out.println(s8);
        comp.addCell(s8);
        //Print array after addCell
        System.out.println("==============================================");
//        System.out.println("+++++Print after addCell+++++");
        comp.printReport();
        System.out.println("Total add in array: " + comp.size());
        //-------------------------------
        //Check method removeCell
        System.out.println("==============================================");
        System.out.println("++++removeCell++++");
//        System.out.println(s3);
        comp.removeCell(s3.getId());
//        System.out.println(s3);
        comp.removeCell(s3.getId());
//        System.out.println(w4);
        comp.removeCell(w4.getId());
        //Print array affter removeCell
        System.out.println("==============================================");
//        System.out.println("+++++Print after removeCell+++++");
        comp.printReport();
        System.out.println("Total add in array: " + comp.size());
    }
}