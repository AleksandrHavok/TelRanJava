//Помимо имплементации интерфейса его также требуется импортировать
import java.util.Comparator;

//Класс имплементирует (реализует) интерфейс Comparator
//Сравниваем по идентификатору
public class PersonIdComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
