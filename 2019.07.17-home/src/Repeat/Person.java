package Repeat;

public class Person implements Comparable<Person> {
    private String name;
    private int id;
    private int age;

    public Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
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

    public String toString(){
        return id + " Name: " + name + " Age: " + age;
    }

    //В отличии от Arrays в случае коллекций binarySearch как я понял сравнивает значения только в списке,
    //по идее переопределять только для бинарки не обязательно.
    //В нашем случае используется по причине того, что в Collections методы contains и remove
    //при поиске элемента сравнивают элементы по equals из Object.
    //Что некорректно в случае сравнения объектов конкретного класса, т.к. мы сами должны определять
    //методику сравнения элементов, а не использовать стандартную.
    //Подробнее тут:
    //https://www.infoworld.com/article/3305792/comparing-java-objects-with-equals-and-hashcode.html
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
        return Integer.compare(id,o.id);
    }
}
