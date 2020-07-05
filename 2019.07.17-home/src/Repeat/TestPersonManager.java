package Repeat;

public class TestPersonManager {
    public static void main(String[] args) {

        PersonManager pm = new PersonManager();
        pm.add(new Person("Sasha", 2, 21));
        pm.add(new Person("Sasha", 2, 21));
        pm.add(new Person("David", 3, 25));
        pm.add(new Person("Kolya",4,25));
        pm.add(new Person("Sofa", 7, 19));
        pm.add(new Person("Sofa",5,20));
        pm.add(new Person("Maria", 4, 18));
        pm.add(new Person("Lena", 1, 23));
        pm.add(new Person("Vasya", 10, 28));

        pm.remove(2);
        pm.displayById();
        System.out.println("------------");
        pm.displayByAge();
        System.out.println("------------");
        pm.displayByName();
        System.out.println("------------");
        System.out.println(pm.find(4));
        System.out.println(pm.find(5));

        Iterable<Person> arr = pm.find(21, 27);
        if (arr != null) {
            for (Person p : arr){
                System.out.println(p);
            }
        }
    }
}
