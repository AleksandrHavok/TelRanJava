package Repeat;

public abstract class Person {

    private String name;
    private int age;
    private int id;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //если есть абстрактный метод, то и класс должен обязательно быть абстрактным,
    //в обратную сторону не обязательно.
    public abstract double calcSalary();

    public boolean equals(Person other) {
        if (other == null) {
            return false;
        }
        return id == other.id;
    }

    public String toString(){
        return id + " " + name + " " + age;
    }
}
