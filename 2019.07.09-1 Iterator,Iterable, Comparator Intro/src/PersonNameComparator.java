import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo( o2.getName());//чтобы не писать реализацию компоратора самому, можем юзать метод
        //compareTo
        //Сравнивает в лексикографическом порядке сравнить две строки

    }
}
