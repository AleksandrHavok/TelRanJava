package Repeat;

public class PersonManager implements IManager {
    private Person[] persons;
    public int count = 0;

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
        //вставляем проверку на повторный элемент через метод indexOf,
        //чтобы не плодить код поиска в разных методах
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
            for (; indx < count; indx++) {
                persons[indx] = persons[indx + 1];
            }
            count--;
            persons[count] = null;
            return true;
        }
        return false;
    }

    //используется для поиска индекса искомого элемента
    //нужно для того, чтобы не писать один и тот же код поиска в разных методах
    private int indexOf(Person p) {
        for (int i = 0; i < count; i++) {
            if (persons[i].equals(p)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Person find(int id) {
        Person tmp = new Person("", id, -123);
        int indx = indexOf(tmp);
        if (indx <= 0) {
            return null;
        }
        //нужно возвращать именно нашего персона, потому надо быть внимательным
        //и не возвращать tmp - временную переменную
        return persons[indx];
    }

    @Override
    public Person[] find(int minAge, int maxAge) {
        //инстанцируем временный массив, чтобы если что можно было вернуть null
        Person[] res = new Person[10];
        if (minAge <= maxAge && minAge > 0 && maxAge > 0) {
            //сначала считаем, сколько персонов, подходящих под условия есть в массиве
            int resCount = 0;
            for (int i = 0; i < count; i++) {
                if (persons[i].getAge() >= minAge && persons[i].getAge() <= maxAge) {
                    resCount++;
                }
            }
            //в принципе здесь можно сделать возврат, если resCount=0,
            //чтобы зря не гонять цикл дальше
            if (resCount == 0) {
                return res;
            }
            //переопределяем размерность временного массива
            res = new Person[resCount];
            //делаем 2 переменных - счётчика в цикле,
            //условия выхода из цикла при этом можно завязать только на одном из них
            //равнозначно тому, если бы перед циклом был бы int j=0; а в цикле j не был бы определен
            for (int i = 0, j = 0; i < count; i++) {
                if (persons[i].getAge() >= minAge && persons[i].getAge() <= maxAge) {
                    //собираем подходящих по условию персонов в наш временный массив
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
        for (int i = 0; i < count; i++) {
            System.out.println(persons[i].toString());
        }
    }
}
