package Repeat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonManager implements IManager {
    private ArrayList<Person> listById;
    private ArrayList<Person> listByName;
    private ArrayList<Person> listByAge;

    private Comparator<Person> byIdComp;
    private Comparator<Person> byNameComp;
    private Comparator<Person> byAgeComp;

    public PersonManager() {
        init();
    }

    public void init() {
        listById = new ArrayList<>();
        listByName = new ArrayList<>();
        listByAge = new ArrayList<>();

        byIdComp = (p1, p2) -> {
            int res = Integer.compare(p1.getId(), p2.getId());
            return res;
        };
        byNameComp = (p1, p2) -> p1.getName().compareTo(p2.getName());
        byAgeComp = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge());
            if (res == 0) {
                res = Integer.compare(p1.getId(), p2.getId());
            }
            return res;
        };
    }

    @Override
    public boolean add(Person p) {
        if (p == null) {
            return false;
        }
        int index = Collections.binarySearch(listById, p);
        if (index < 0) {
            index = ~index;
            listById.add(index, p);
            index = ~Collections.binarySearch(listByAge, p, byAgeComp);
            listByAge.add(index, p);
            index = ~Collections.binarySearch(listByName, p, byNameComp);
            listByName.add(index, p);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(int id) {
        Person tmp = new Person(id, "", 0);
        int index = Collections.binarySearch(listById, tmp);
        if (index >= 0) {
            listById.remove(tmp);
            listByAge.remove(tmp);
            listByName.remove(tmp);
            return true;
        }
        return false;
    }

    @Override
    public Person find(int id) {
        Person tmp = new Person(id, "", 0);
        int index = Collections.binarySearch(listById, tmp);
        if (index >= 0) {
            return listById.get(index);
        }
        return null;
    }

    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        if (minAge > maxAge) {
            return null;
        }
        Person left = new Person(Integer.MIN_VALUE, "", minAge);
        Person right = new Person(Integer.MAX_VALUE, "", maxAge);
        int l = ~Collections.binarySearch(listByAge, left, byAgeComp);
        int r = ~Collections.binarySearch(listByAge, right, byAgeComp);
        return listByAge.subList(l, r);
    }

    @Override
    public Iterable<Person> getAllById() {
        return listById;
    }

    @Override
    public Iterable<Person> getAllByAge() {
        return listByAge;
    }

    @Override
    public Iterable<Person> getAllByName() {
        return listByName;
    }

    @Override
    public int size() {
        return listById.size();
    }

    public void displayById() {
        for (Person p : listById) {
            System.out.println(p);
        }
    }

    public void displayByName() {
        for (Person p : listByName) {
            System.out.println(p);
        }
    }

    public void displayByAge() {
        for (Person p : listByAge) {
            System.out.println(p);
        }
    }
}
