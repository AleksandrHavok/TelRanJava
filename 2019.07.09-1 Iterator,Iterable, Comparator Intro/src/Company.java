import java.util.Iterator;

public class Company implements Iterable<Person> {
    private Person[] arr;
    private int count;

    public Company() {
        arr = new Person[10];
    }

    public void add(Person p) {
        if (count == arr.length) {
            Person[] tmp = new Person[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                tmp[i] = arr[i];
            }
            arr = tmp;
        }
        arr[count++] = p;
    }

    @Override
    public Iterator<Person> iterator() {//метод интерфейса Iterable возвращает экземпляр итератора PersonIterator
        return new PersonIterator();
    }

    private class PersonIterator implements Iterator<Person> {
        int curr = 0;

        @Override
        public boolean hasNext() {
            return curr < count;
        }

        @Override
        public Person next() {
            if (!hasNext()) {
                return null;
            }
            return arr[curr++];
        }
    }
}

