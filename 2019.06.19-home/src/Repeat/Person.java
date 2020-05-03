package Repeat;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return id + " name: " + name + " age: " + age;
    }

    public boolean equals(Person p) {
        if (p == null) {
            return false;
        }
        return id == p.id;
    }
}
