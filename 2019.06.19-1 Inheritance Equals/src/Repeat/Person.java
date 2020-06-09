package Repeat;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + " " + age;
    }

    //своеобразное переопределение уже существующего метода equals из класса Object
    public boolean equals(Person p){
        // проверяем на null (чтобы не словить NPE)
        if (p==null){
            return false;
        }
        // затем проверяем что имена одинаковые
        if (!name.equals(p.name)){
            return false;
        }
        // финальная проверка, если возраст одинаковый, то возвращаем true -
        // подтверждаем, что это искомый Person
        return age==p.age;
    }

}
