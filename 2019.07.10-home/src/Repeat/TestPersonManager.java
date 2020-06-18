package Repeat;

public class TestPersonManager {
    public static void main(String[] args) {
        IManager pm = new PersonManager();
        pm.add(new Person("Sasha", 26, 12));
        pm.add(new Person("Petya", 22, 13));
        pm.add(new Person("Ivan", 22, 14));
        pm.add(new Person("Ira", 26, 14));
        pm.add(new Person("Anna", 19, 12));
        pm.add(new Person("Kolya", 29, 17));
        pm.add(new Person("Lena", 24, 11));
        pm.add(new Person("Maria", 25, 22));
        pm.add(new Person("Sasha", 25, 8));

        Person[] res = pm.getAllPersonsById();
        print(res);
        res = pm.getAllPersonsByName();
        print(res);
        res = pm.getAllPersonsByAge();
        print(res);
        pm.remove(12);
        res = pm.getAllPersonsById();
        print(res);

        System.out.println(pm.find(14));
        System.out.println("----------------------");
        Person[] arr = pm.getAllPersonsByAge();
        arr = pm.find(22, 25);
        for (Person p : arr) {
            System.out.println(p);
        }
    }

    //Метод для печати массива
    public static void print(Person[] arr) {
        if (arr != null) {
            for (Person p : arr) {
                System.out.println(p.toString());
            }
        }
        System.out.println("------------");
    }
}
