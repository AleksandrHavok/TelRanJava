//Помимо имплементации интерфейса, его требуется также импортировать
import java.util.Comparator;

//Класс имплементирует интерфейс Comparator
//Сравнивать будем по возрасту
public class PersonAgeComparator implements Comparator<Person> {
    //реализуем метод compare
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
