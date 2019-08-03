public interface IManager {
    boolean add(Person p);
    boolean remove(int id);
    Person find(int id);
    Iterable<Person> find(int minAge, int MaxAge);
    Iterable<Person> getAllById();
    Iterable<Person> getAllByAge();
    Iterable<Person> getAllByName();
    int size();
}