package Repeat;

import java.util.Arrays;
import java.util.Iterator;

public class NamesList implements Iterable<String> {
    private String[] arr;
    private int count;

    public NamesList() {
        arr = new String[10];
        count = 0;
    }

    public void add(String name) {
        if (count == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        arr[count++] = name;
    }

    public String[] getAll() {
        String[] tmp = Arrays.copyOf(arr, count);
        return tmp;
    }

    public int size() {
        return count;
    }

    public Iterator<String> iterator() {
        return new NamesIterator();
    }

    private class NamesIterator implements Iterator<String> {
        int curr;

        @Override
        public boolean hasNext() {
            return curr < count;
        }

        @Override
        public String next() {
            return arr[curr++];
        }
    }
}
