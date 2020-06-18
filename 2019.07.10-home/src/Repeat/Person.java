package Repeat;

public class Person implements Comparable<Person> {
    private String name;
    private int id;
    private int age;

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return id + " " + name + " " + age;
    }

    //Если бы реализовывали не через интерфейс Comparable, а через equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Person)){
            return false;
        }
        Person other = (Person) obj;
        if (id != other.id){
            return false;
        }
        return true;
    }

    //за счет compareTo работает фильтрация списка по id
    //т.к. через binarySearch ссылаемся сюда и сравниваем объекты по id
    @Override
    public int compareTo(Person o) {
        return Integer.compare(id, o.id);
    }

}
