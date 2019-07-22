public interface IManager {
    public boolean add(Person person);
    public boolean remove(int id);
    public Person find(int id);
    public Person[] find (int minAge,int maxAge);
    public int size();
}
