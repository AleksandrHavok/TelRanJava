import java.util.ArrayList;
import java.util.List;

public class TestPersonManager {
    public static void main(String[] args) {

        PersonManager pm = new PersonManager();
        pm.add(new Person("Sasha", 21, 2));
        pm.add(new Person("Petya", 25, 3));
        pm.add(new Person("Vasya", 23, 1));
        pm.add(new Person("Ira", 27, 4));
        pm.add(new Person("Anna", 26, 6));
        pm.add(new Person("Kolya", 29, 5));
        pm.add(new Person("Maria", 20, 6));
        pm.add(new Person("Lena", 20, 12));
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

        ArrayList <Person> arr= (ArrayList<Person>) pm.find(22, 27);
        if (arr!=null) {
            for (Person p : arr) {
                System.out.println(p);
            }
        }
    }
}
