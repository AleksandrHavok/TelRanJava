package Repeat;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;

public class PersonManager implements IManager {
    private Person[] persons;
    private int count;

    PersonManager() {
        persons = new Person[10];
        count = 0;
    }

    @Override
    public boolean add(Person person) {
        if (person == null) {
            return false;
        }
        if (count == persons.length) {
            persons = Arrays.copyOf(persons, persons.length * 2);
        }
        int indx = indexOf(person);
        if (indx >= 0) {
            return false;
        }
        //Необходимо, т.к. используем binarySearch
        //indx = -indx - 1;
        //Специальная битовая операция, заменяющая по своей сути -indx - 1
        indx = ~indx;
        for (int i = count; i > indx; i--) {
            persons[i] = persons[i - 1];
        }
        persons[indx] = person;
        count++;
        return true;
    }

    private int indexOf(Person p) {
        //Если бы реализовывали через через equals в Persons, а не через интерфейс Comparable и
        //Arrays.binarySearch
        //for (int i=0;i<count;i++) {
        //    if (persons[i].equals(p)) {
        //        return i;
        //    }
        //}
        //return -1;

        //в случае, если элемент не был найден binarySearch
        //возвращает инвертированное значение в виде -indx-1
        //таким образом указывается где мог бы располагаться данный элемент
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
        if (indx >= 0) {
            return persons[indx];
        }
        return null;
    }

    @Override
    public Person[] find(int minAge, int maxAge) {
        if (minAge > maxAge) {
            return null;
        }
        //Была попытка завязаться на метод getAllPersonsByAge
        //неудачно по причине того, что когда расчитываем левую и правую границы
        //используем стандартный compareTo вместо компаратора который мы задаем.
        //Возможный вариант - дублировать компаратор из comp, но тогда смысл использования
        //метода getAllPersonsByAge теряется, сократим код буквально на 1 строку,
        //при этом операций будет больше
        //Альтернатива - сделать общий для методов компаратор, но тогда он будет постоянно висеть в памяти. Антивариант


        Person p1 = new Person("", minAge, Integer.MIN_VALUE);
        Person p2 = new Person("", maxAge, Integer.MAX_VALUE);
        Comparator<Person> comp = (a, b) -> {
            int res = Integer.compare(a.getAge(), b.getAge());
            if (res == 0) {
                res = Integer.compare(a.getId(), b.getId());
            }
            return res;
        };
        Person[] tmp = Arrays.copyOf(persons, count);
        Arrays.sort(tmp, comp);
        //Делаем бинарный поиск значений в двух разных вариациях
        int left = -Arrays.binarySearch(tmp, p1, comp) - 1;
        int right = ~Arrays.binarySearch(tmp, p2, comp);
        return Arrays.copyOfRange(tmp, left, right);
    }

    //Чтобы не писать внешние классы для компараторов, распишем их через лямбды
    //Также чтобы не менять изначальный отсортированный по id массив
    //будем использовать его копии

    @Override
    public Person[] getAllPersonsById() {
        //Тут можно без копии, потому что persons по умолчанию отсортирован по id
        //благодаря binarySearch и compareTo
        return Arrays.copyOf(persons, count);
    }

    @Override
    public Person[] getAllPersonsByAge() {
        Person[] res = Arrays.copyOf(persons, count);
        //Делаем сортировку персон по возрасту
        //Если возраст одинаковый, то делаем доп сравнение по id
        Arrays.sort(res, (a, b) -> {
            int comp = Integer.compare(a.getAge(), b.getAge());
            if (comp == 0) {
                comp = Integer.compare(a.getId(), b.getId());
            }
            return comp;
        });
        return res;
    }

    @Override
    public Person[] getAllPersonsByName() {
        Person[] res = Arrays.copyOf(persons, count);
        Arrays.sort(res, (a, b) -> a.getName().compareTo(b.getName()));
        return res;
    }

    @Override
    public int size() {
        return count;
    }

    //Вынесено в TestPersonManager в метод print, т.к. при вызове display всегда
    //будем печатать отсортированный по id массив
    //Наличие метода здесь лишено смысла
//    public void display() {
//        for (Person p : persons){
//            if(p !=null){
//                System.out.println(p.toString());
//            }
//        }
//        System.out.println("------------");
//    }
}
