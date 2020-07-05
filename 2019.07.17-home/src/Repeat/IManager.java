package Repeat;

public interface IManager {

    public boolean add(Person person);
    public boolean remove(int id);
    public Person find(int id);
    public Iterable<Person> find(int minAge, int maxAge);
    public Iterable<Person> getAllPersonsById();
    public Iterable<Person> getAllPersonsByAge();
    public Iterable<Person> getAllPersonsByName();
    public int size();

}
