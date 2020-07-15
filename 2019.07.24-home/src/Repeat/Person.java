package Repeat;

public class Person implements Comparable<Person>{
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + age;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Person)){
            return false;
        }
        Person other = (Person)obj;
        if (id!=other.id){
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(id,o.id);
    }
}
