package Repeat;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        //чтобы не писать свой компаратор, можно использовать compareTo
        //сравнивает 2 строки в лексиграфическом порядке
        return o1.getName().compareTo(o2.getName());
    }
}
