public class PersonManager implements IManager {

    private Person[] persons;
    private int count = 0;

    public PersonManager() {
        persons = new Person[10];
    }

    public PersonManager(Person[] persons) {
        this.persons = new Person[10];
        if (persons != null) {
            for (int i = 0; i < persons.length; i++) {
                if (persons[i] != null) {
                    add(persons[i]);
                }
            }
        }
        this.persons = persons;
    }

    @Override
    public boolean add(Person person) {
        if (person == null) {
            return false;
        }
        if (count == persons.length) {
            Person[] tmp = new Person[persons.length * 2];
            for (int i = 0; i < count; i++) {
                tmp[i] = persons[i];
            }
            persons = tmp;
        }
        int indx = indexOf(person);
        if (indx < 0) {
            persons[count++] = person;
            return true;
        }
        return false;
    }


    @Override
    public boolean remove(int id) {
        Person tmp = new Person("", id, -123);
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
        Person tmp = new Person("", id, -123);
        int indx = indexOf(tmp);
        if (indx <= 0) {
            return null;
        }
        return persons[indx];
    }

    private int indexOf(Person p) {
        for (int i = 0; i < count; i++) {
            if (persons[i].equals(p)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Person[] find(int minAge, int maxAge) {
        Person[] res = new Person[10];
        if (minAge <= maxAge && minAge > 0 && maxAge > 0) {
            int resCount = 0;
            for (int i = 0; i < count; i++) {
                if (persons[i].getAge() >= minAge && persons[i].getAge() <= maxAge) {
                    resCount++;
                }
            }
            res = new Person[resCount];
            for (int i = 0, j = 0; i < count; i++) { //надо запомнить что так можно писать условия
                if (persons[i].getAge() >= minAge && persons[i].getAge() <= maxAge) {
                    res[j] = persons[i];
                    j++;
                }
            }
        }
        return res;
    }

    @Override
    public int size() {
        return count;
    }

    void printReport() {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null) {
                System.out.println(persons[i].toString());
            }
        }
    }
}
