package Repeat;

public class Person {
    private int id;
    private int age;
    private String name;

    public Person(int id,int age, String name){
        this.name=name;
        this.id=id;
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String toString(){//выводим поля экземпляра класса в виде строки
        return id+ " "+ name + " "+ age;
    }
}
