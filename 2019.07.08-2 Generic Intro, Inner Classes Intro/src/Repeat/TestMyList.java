package Repeat;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        MyList<String> names = new MyList<>();
        names.add("Sasha");
        names.add("Vasya");
        names.add("Petya");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        MyList<Person> person = new MyList<>();
        person.add(new Person("Vasya", 22, 123));
        person.add(new Person("Kolya", 21, 222));
        person.add(new Person(names.get(0), 26, 321));

        for (int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i).printPerson());
        }

        IList<Integer> iList = new IntegerListImpl();
    }
}
