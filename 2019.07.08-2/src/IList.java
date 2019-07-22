public interface IList <T> {
    boolean add(T value);
    boolean remove(int index);
    int indexOf(T value);
    T get(int index);
    int size();
}
