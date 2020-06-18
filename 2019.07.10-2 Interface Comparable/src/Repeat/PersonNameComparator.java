package Repeat;

//Помимо имплементации интерфейса, его необходимо также импортировать
import java.util.Comparator;

//Класс имплементирует (реализует) интефейс Comparator
//Сравниваем по имени
public class PersonNameComparator implements Comparator<Person> {
    //реализуем интерфейс Compare
    //Чтобы не писать свой компаратор, можно использовать compareTo
    //Сравнивает 2 строки в лексикографическом порядке, т.е. абв< абвг или абб < абв
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
