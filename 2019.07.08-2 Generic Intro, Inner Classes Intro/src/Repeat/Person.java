package Repeat;

public class Person {
    private String name;
    private int age;
    private int id;

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String printPerson(){
        return id + " " + name + " " + age;
    }
}
