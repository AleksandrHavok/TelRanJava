import java.util.ArrayList;
import java.util.List;

public class TestPersonManager {
    public static void main(String[] args) {

        PersonManager pm = new PersonManager();
        pm.add(new Person(2,"Sasha", 21));
        pm.add(new Person(3,"Petya", 25));
        pm.add(new Person(1,"Vasya", 23));
        pm.add(new Person(4,"Ira", 27));
        pm.add(new Person(6,"Anna", 26));
        pm.add(new Person(5,"Kolya", 29));
        pm.add(new Person(6,"Maria", 20));
        pm.add(new Person(12,"Lena", 20));
        pm.remove(2);
        pm.displayById();
        System.out.println("---------");
        pm.displayByAge();
        System.out.println("---------");
        pm.displayByName();
        System.out.println("---------");
        System.out.println(pm.find(4 ));
        System.out.println("---------");
        System.out.println(pm.find(8));
        System.out.println("---------");

        Iterable<Person> arr=  pm.find(23, 27);
        if (arr!=null) {
            for (Person p : arr) {
                System.out.println(p);
            }
        }
    }
}
