public abstract class Person {
    private int id;
    private String name;
    private int age;

    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public abstract double calcSalary();

    public boolean equals(Person other) {
        if (other == null) {
            return false;
        }
        return id == other.id;
    }

    public String toString() {
        return id + " " + name + " " + age;
    }
}
