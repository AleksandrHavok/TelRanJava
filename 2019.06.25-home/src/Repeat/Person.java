package Repeat;

public class Person {
    private String name;
    private int id;
    private int age;

    public Person(String name,int id, int age){
        this.name=name;
        this.id=id;
        this.age=age;
    }

    public String toString(){
        return id + " name: " + name + " age: " + age;
    }

    public boolean equals(Person otherPerson){
        if(otherPerson == null){
            return false;
        }
        return id==otherPerson.id;
    }
}
