import java.util.Arrays;
import java.util.Comparator;

public class PersonManager implements IManager {

    private Person[] persons;

    private int count;

    public PersonManager() {
        persons = new Person[10];
        count = 0;
    }

    @Override
    public boolean add(Person person) {
        if (person == null) {
            return false;
        }
        if (count == persons.length) {
//            Person[] tmp = Arrays.copyOf(persons, persons.length * 2);
//            persons = tmp;
            persons = Arrays.copyOf(persons, persons.length * 2);

        }
        int indx = indexOf(person);
//        if (indx < 0) {
//            persons[count++] = person;
//            persons = getAllPersonsById();
//            return true;
//        }
//        return false;
        if (indx >= 0) {
            return false;
        }
//        indx = -indx - 1;
        indx = ~indx;//специальная битовая операция, заменяющая -indx-1
        for (int i = count; i > indx; i--) {
            persons[i] = persons[i - 1];
        }
        persons[indx] = person;
        count++;
        return true;

    }

    private int indexOf(Person p) {
//        for (int i = 0; i < count; i++) {
//            if (persons[i].equals(p)) {
//                return i;
//            }
//        }
//        return -1;
        return Arrays.binarySearch(persons, 0, count, p);
    }

    @Override
    public boolean remove(int id) {
        Person tmp = new Person("", 0, id);
        int indx = indexOf(tmp);
        if (indx >= 0) {
            for (; indx < count - 1; indx++) {
                persons[indx] = persons[indx + 1];
            }
            persons[count - 1] = null;
            count--;
            return true;
        }
        return false;
    }

    @Override
    public Person find(int id) {
        Person tmp = new Person("", 0, id);
        int indx = indexOf(tmp);
//        if (indx <= 0) {
//            return null;
//        }
//        return persons[indx];
        if (indx >= 0) {
            return persons[indx];
        }
        return null;
    }

    @Override
    public Person[] find(int minAge, int maxAge) {
//        persons = getAllPersonsById();
//        Person[] res = new Person[10];
//        if (minAge <= maxAge && minAge > 0 && maxAge > 0) {
//                int resCount = 0;
//                for (int i = 0; i < count; i++) {
//                    if (persons[i].getAge() >= minAge && persons[i].getAge() <= maxAge) {
//                        resCount++;
//                    }
//                }
//                res = new Person[resCount];
//                for (int i = 0, j = 0; i < count; i++) { //надо запомнить что так можно писать условия
//                    if (persons[i].getAge() >= minAge && persons[i].getAge() <= maxAge) {
//                        res[j] = persons[i];
//                        j++;
//                    }
//                }
//        }
//        return res;
        if (minAge > maxAge) {
            return null;
        }
        Comparator<Person> comp = (a, b) -> {
            int res = Integer.compare(a.getAge(), b.getAge());
            if (res == 0) {
                res = Integer.compare(a.getId(), b.getId());
            }
            return res;
        };

        Person[] tmp = Arrays.copyOf(persons, count);
        Person p1 = new Person("", minAge, Integer.MIN_VALUE);
        Person p2 = new Person("", maxAge, Integer.MAX_VALUE);
        Arrays.sort(tmp, comp);
        int left = -Arrays.binarySearch(tmp, p1, comp) - 1;
//        int right=-Arrays.binarySearch(tmp,p2,comp)-1;
        int right = ~Arrays.binarySearch(tmp, p2, comp);
        return Arrays.copyOfRange(tmp, left, right + 1);
    }

    // оригинальный метод до преобразования в лямбду
//    @Override
//    public Person[] getAllPersonsById() {
//        Arrays.sort(persons, 0, count, new Comparator<Person>() {//создаем анонимный класс через {}
//            public int compare(Person o1, Person o2) {
//                return Integer.compare(o1.getId(), o2.getId());
//            }
//        });
//        return persons;
//    }

    @Override
    public Person[] getAllPersonsById() {
        //после -> должно быть тело метода в {}, но т.к. тут сразу идет return то можем писать сразу что идет в нём
//        Arrays.sort(persons, 0, count, (o1, o2) -> {
//            ;
//            return Integer.compare(o1.getId(), o2.getId());
//        });
        Arrays.copyOf(persons, count);
        return persons;
    }


    @Override
    public Person[] getAllPersonsByAge() {
//        Arrays.sort(persons, 0, count, (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));
//        Arrays.sort(persons, 0, count, (o1, o2) -> ((Integer) o1.getAge()).compareTo((Integer) o2.getAge()));
        Person[] res = Arrays.copyOf(persons, count);
        Arrays.sort(res, (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));
        return res;
    }

    @Override
    public Person[] getAllPersonsByName() {
//        Arrays.sort(persons, 0, count, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        Person[] res = Arrays.copyOf(persons, count);
        Arrays.sort(res, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        return res;

    }

    @Override
    public int size() {
        return count;
    }

    public void display() {
        for (Person p : persons) {
            if (p != null) {
                System.out.println(p.toString());
            }
        }
//        for (int i = 0; i < persons.length; i++){
//            if (persons[i] != null) {
//                System.out.println(persons[i].toString());
//            }
//        }
        System.out.println("----------");
    }
}
