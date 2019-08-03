/*todo
реализовать через ArrayList
3 ArrayList: id,name,age
*/

import java.util.*;

public class PersonManager implements IManager {
    private ArrayList<Person> idList;
    private ArrayList<Person> ageList;
    private ArrayList<Person> nameList;
    private ArrayList<Person> persons;

    private Comparator<Person> compById;
    private Comparator<Person> compByAge;
    private Comparator<Person> compByName;

    private int count = 0;

    public PersonManager() {
        persons = new ArrayList<>();
        idList = new ArrayList<>();
        ageList = new ArrayList<>();
        nameList = new ArrayList<>();
        compById = (p1, p2) -> {
            int res = Integer.compare(p1.getId(), p2.getId());
            return res;
        };
        compByAge = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge());
            if (res == 0) {
                res = Integer.compare(p1.getId(), p2.getId());
            }
            return res;
        };
        compByName = (p1, p2) -> {
            int res = p1.getName().compareTo(p2.getName());
            if (res == 0) {
                res = Integer.compare(p1.getId(), p2.getId());
            }
            return res;
        };
    }

    public PersonManager(List<Person> list) {
        persons = new ArrayList<>(list);
        idList = new ArrayList<>(list);
        ageList = new ArrayList<>(list);
        nameList = new ArrayList<>(list);
        compById = (p1, p2) -> {
            int res = Integer.compare(p1.getId(), p2.getId());
            return res;
        };
        compByAge = (p1, p2) -> {
            int res = p1.getName().compareTo(p2.getName());
            if (res == 0) {
                res = Integer.compare(p1.getId(), p2.getId());
            }
            return res;
        };
        compByName = (p1, p2) -> {
            int res = p1.getName().compareTo(p2.getName());
            if (res == 0) {
                res = Integer.compare(p1.getId(), p2.getId());
            }
            return res;
        };
    }

    @Override
    public boolean add(Person person) {
        if (person == null) {
            return false;
        }
        if (person.getId() < 0) {
            return false;
        }
        if (person.getAge() < 0) {
            return false;
        }
        if (idList.contains(person)) {
            return false;
        }
        persons.add(person);
        idList.add(person);
        getAllPersonsById();
        ageList.add(person);
        getAllPersonsByAge();
        nameList.add(person);
        getAllPersonsByName();
        count++;
        return true;
    }

    @Override
    public boolean remove(int id) {
        if (persons.contains(find(id))) {
            idList.remove(find(id));
            ageList.remove(find(id));
            nameList.remove(find(id));
            persons.remove(find(id));
            count--;
            return true;
        }
        return false;
    }

    @Override
    public Person find(int id) {
        Person tmp = new Person("", -123, id);
        int indx = Collections.binarySearch(persons, tmp);
        if (indx >= 0) {
            return persons.get(indx);
        }
        return null;
    }

    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        if (minAge > maxAge) {
            return null;
        }
//        Person[] tmp = Arrays.copyOf(ageList.toArray(new Person[0]), count);
        Person p1 = new Person("", minAge, Integer.MIN_VALUE);
        Person p2 = new Person("", maxAge, Integer.MAX_VALUE);
//        int left=Arrays.binarySearch(tmp, p1,compByAge);
        int left = ~Collections.binarySearch(ageList, p1, compByAge);
//        if (left < 0) {
//            left = ~left;
//        }
//        int right=Arrays.binarySearch(tmp, p2,compByAge);
        int right = ~Collections.binarySearch(ageList, p2, compByAge);
//        if (right < 0) {
//            right = ~right;
//        } else {
//            right++;
//        }
//        tmp = Arrays.copyOfRange(tmp, left, right);

//        ArrayList<Person> list = new ArrayList<>(Arrays.asList(tmp));
//        return list;
         return ageList.subList(left, right);
    }


    @Override
    public Iterable<Person> getAllPersonsById() {
        Collections.sort(idList, compById);
        return idList;
    }

    @Override
    public Iterable<Person> getAllPersonsByAge() {
        Collections.sort(ageList, compByAge);
        return ageList;
    }

    @Override
    public Iterable<Person> getAllPersonsByName() {
        Collections.sort(nameList, compByName);
        return nameList;
    }

    @Override
    public int size() {
        return count;
    }

    public void displayById() {
        Person[] tmp = idList.toArray(new Person[count]);
        for (Person p : tmp) {
            System.out.println(p);
        }
    }

    public void displayByAge() {
        Person[] tmp = ageList.toArray(new Person[count]);
        for (Person p : tmp) {
            System.out.println(p);
        }
    }

    public void displayByName() {
        Person[] tmp = nameList.toArray(new Person[count]);
        for (Person p : tmp) {
            System.out.println(p);
        }
    }
}
