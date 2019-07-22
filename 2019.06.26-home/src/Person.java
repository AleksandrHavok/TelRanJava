public class Person {
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
    public int getId(){
        return id;
    }
    public int getAge() {
        return age;
    }

    public String toString(){
        return name+" "+id+" "+age;
    }

    public boolean equals(Person other){
        if (other==null){
            return false;
        }
        return id==other.id;
    }


}
