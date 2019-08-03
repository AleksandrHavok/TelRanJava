public class Person implements Comparable<Person> {
    private int age;
    private int id;
    private String name;

    public Person(int id, String name, int age) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        if (age != person.age) return false;
        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }
    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Person p) {

        if (Integer.compare(id, p.id) == 0) {
            return 0;
        }
//        if (this.equals(p)){
//            return 0;
//        }
        int res=name.compareTo(p.name);
        if(res==0){
            res=Integer.compare(id, p.id);
        }
        return res;
    }

}
