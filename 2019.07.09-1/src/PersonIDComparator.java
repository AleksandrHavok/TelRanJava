import java.util.Comparator;

public class PersonIDComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getId(), o2.getId());//чтобы не писать реализацию компоратора самому, можем юзать метод
        //compare у Integer

    }
}
