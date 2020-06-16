package Repeat;

//Имплементируем интефейс Comparable для перебора при помощи compareTo
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int id;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return id + " " + name + " " + age;
    }

    //Override т.к. реализуем метод интерфейса
    @Override
    public int compareTo(Person o) {
        return Integer.compare(id, o.id);
    }
}
