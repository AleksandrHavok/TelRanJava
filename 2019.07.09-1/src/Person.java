public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int id;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return id+" "+name + " " + age;
    }

    public Person(int id,String name, int age)  {
        this.name = name;
        this.age = age;
        this.id = id;
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

    @Override
    public int compareTo(Person o){
        return Integer.compare(id, o.id);
    }
}
