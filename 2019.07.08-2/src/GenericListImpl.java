public class GenericListImpl<T> implements IList<T> {
    @Override
    public boolean add(T value) {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public int indexOf(T value) {
        return 0;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
