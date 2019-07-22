public class Person implements Comparable<Person> {
    private String name;
    private int id;
    private int age;

    public Person(String name, int age, int id) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + ", age: " + age + ", id: " + id;
    }


    //    public boolean equals(Person p){
    @Override
    public boolean equals(Object p){
        if (p==null){
            return false;
        }
        Person tmp=(Person)p;
        return id==tmp.getId();
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(id, o.id);
    }
}
