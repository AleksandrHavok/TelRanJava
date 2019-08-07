public class Person implements Comparable<Person>{
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return id + " " + name + " " + age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person other = (Person) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Person o) {
//		if(Integer.compare(id, o.id) == 0) {
//			return 0;
//		}
        if(this.equals(o)) {
            return 0;
        }
        int res = name.compareTo(o.name);
        if(res == 0) {
            res = Integer.compare(id, o.id);
        }
        return res;
    }

}