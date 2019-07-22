public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }

    public boolean equals(Person p) {
        if (p == null) {
            return false;
        }
        if (!name.equals(p.name)) {
            return false;
        }
        return age==p.age;

    }
}
