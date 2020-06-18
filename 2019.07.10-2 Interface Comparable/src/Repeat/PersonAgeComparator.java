package Repeat;

//Помимо имплементации интерфейса его также требуется импортировать
import java.util.Comparator;

//Класс имплементирует (реализуют) интерфейс Comparator
//Сравниваем по возрасту
public class PersonAgeComparator implements Comparator<Person> {
    //реализуем интерфейс Compare
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
