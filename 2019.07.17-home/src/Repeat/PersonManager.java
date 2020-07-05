package Repeat;

import java.util.*;

//Оставил комментарии с неоптимальными вариантами решения и почему они полная дичь.
public class PersonManager implements IManager {
    private ArrayList<Person> idList;
    private ArrayList<Person> ageList;
    private ArrayList<Person> nameList;
    //Судя по всему - бездумная копипаста из предыдущего дз с Arrays, по факту был изначально не нужен.
    //Проверил по коду - буквально НЕ ДЕЛАЕТ НИХЕРА ПОЛЕЗНОГО, а кое-что и вовсе ломает.
    //Видимо год назад я поленился.
    //Оставляем для истории, иначе некоторые комменты ниже будут непонятны
    //private ArrayList<Person> persons;

    private Comparator<Person> compById;
    private Comparator<Person> compByAge;
    private Comparator<Person> compByName;

    private int count = 0;

    public PersonManager() {
        //persons = new ArrayList<>();
        idList = new ArrayList<>();
        ageList = new ArrayList<>();
        nameList = new ArrayList<>();
        compById = (p1, p2) -> {
            int res = Integer.compare(p1.getId(), p2.getId());
            return res;
        };
        compByAge = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge());
            if (res == 0) {
                res = Integer.compare(p1.getId(), p2.getId());
            }
            return res;
        };
        compByName = (p1, p2) -> {
            int res = p1.getName().compareTo(p2.getName());
            if (res == 0) {
                res = Integer.compare(p1.getId(), p2.getId());
            }
            return res;
        };
    }

    public PersonManager(List<Person> list) {
        //persons = new ArrayList<>(list);
        idList = new ArrayList<>(list);
        ageList = new ArrayList<>(list);
        nameList = new ArrayList<>(list);
        compById = (p1, p2) -> {
            int res = Integer.compare(p1.getId(), p2.getId());
            return res;
        };
        compByAge = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge());
            if (res == 0) {
                res = Integer.compare(p1.getId(), p2.getId());
            }
            return res;
        };
        compByName = (p1, p2) -> {
            int res = p1.getName().compareTo(p2.getName());
            if (res == 0) {
                res = Integer.compare(p1.getId(), p2.getId());
            }
            return res;
        };

    }

    @Override
    public boolean add(Person person) {
        if (person == null) {
            return false;
        }
        if (person.getId() < 0) {
            return false;
        }
        if (person.getAge() < 0) {
            return false;
        }

        //Закоменнтим вариант с contains, т.к. это поиск по всему массиву в лоб,
        //что не оптимально и очень долго при проверке большого количества элементов.

        //На всякий случай, что делает этот кусок кода:
        //Здесь идет сравнение по Object, соответственно используется стандартный метод
        //equals для сравнения объектов.
        //Это дурной тон и некошерно, потому equals надо переопределить в Person
        //Подробнее о причинах смотри в Person
        //if (idList.contains(person)) {
        //    return false;
        //}

        //Был вариант поиска через find, но лучше написать отдельно бинарный поиск
        //и не плодить временные переменные
        int indx = Collections.binarySearch(idList, person);
        if (indx >= 0) {
            return false;
        }
        //Тут ничего сложного, просто добавляем элементы во все списки
        //persons.add(person);
        idList.add(person);
        getAllPersonsById();
        ageList.add(person);
        getAllPersonsByAge();
        nameList.add(person);
        getAllPersonsByName();
        count++;
        return true;
    }

    @Override
    public boolean remove(int id) {
        //Вариант с contains в данном случае поможет найти элемент, но это не оптимально, учитывая что Person
        //мы достаем через find, где уже идет бинарный поиск, то есть нужный элемент уже найден.
        //НУЖНО БОЛЬШЕ ДВОЙНОЙ РАБОТЫ

        //В remove заново искать элемент смысла нет, т.к. мы его уже нашли раньше.
        //Тем более с тем id, который мы передали в методе,
        //удаление произойдет некорректно во всех списках кроме idList, т.к. они отсортированы не по id.
        //С изначальной версией метода find с большой долей вероятности удаление вообще нигде
        //кроме списка persons и не произошло бы, а как мы уже выяснили, persons не нужен.

        //if (persons.contains(find(id))) {
        //    idList.remove(find(id));
        //    ageList.remove(find(id));
        //    nameList.remove(find(id));
        //    persons.remove(find(id));
        //    count--;
        //    return true;
        //}

        //Пишем поиск и remove нормального человека
        //Был вариант поиска через find, но по факту опять же делалась двойная работа,
        //лучше написать отдельно бинарный поиск и не плодить временные переменные

        //Также remove ищет напрямую по всему списку как и contains, соответственно для кошерности сравнения
        //объектов переопределяем equals в Person
        //Подробнее о причинах смотри в Person
        Person tmp = new Person("", id, -123);
        int indx = Collections.binarySearch(idList, tmp);
        if (indx >= 0) {
            idList.remove(tmp);
            ageList.remove(tmp);
            nameList.remove(tmp);
            //persons.remove(tmp);
            count--;
            return true;
        }

        return false;
    }

    @Override
    public Person find(int id) {
        Person tmp = new Person("", id, -123);
        //Комментим ибо полная хрень, т.к. persons НЕ отсортирован.
        //binarySearch в таком случае не найдет нужный элемент примерно никогда
        //ибо нет сортировки по id (привет поломка логики).
        //int indx = Collections.binarySearch(persons, tmp);
        //if (indx >= 0) {
        //    return persons.get(indx);
        //}

        //Реализуем нормально, производя поиск по отсортированному списку idList
        int indx = Collections.binarySearch(idList, tmp);
        if (indx >= 0) {
            return idList.get(indx);
        }
        return null;
    }

    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        if (minAge > maxAge) {
            return null;
        }
        Person p1 = new Person("", Integer.MIN_VALUE, minAge);
        Person p2 = new Person("", Integer.MAX_VALUE, maxAge);
        int left = ~Collections.binarySearch(ageList, p1, compByAge);
        int right = ~Collections.binarySearch(ageList, p2, compByAge);
        return ageList.subList(left, right);
    }

    //Здесь и далее мы создаем метод с типом Iterable.
    //Используется для того чтобы мы могли возвращать любой подходящий тип данных, вроде
    //ArrayList, LinkedList, HashSet, PriorityQueue и Stack.
    //Когда надо вернуть тип интерфейса, мы должны вернуть его реалиацию, в нашем случае - ArrayList
    //Подробнее тут https://progi.pro/iteriruemiy-kak-vozvrashaemiy-tip-10565208
    @Override
    public Iterable<Person> getAllPersonsById() {
        Collections.sort(idList, compById);
        return idList;
    }

    @Override
    public Iterable<Person> getAllPersonsByAge() {
        Collections.sort(ageList, compByAge);
        return ageList;
    }

    @Override
    public Iterable<Person> getAllPersonsByName() {
        Collections.sort(nameList, compByName);
        return nameList;
    }

    @Override
    public int size() {
        return count;
    }

    //ArrayList реализует интерфейс Iterable, так что можно сразу вставлять список в forEach
    //не используя преобразование в массив
    //Зачем я делал преобразование - не ясно, т.к. в классной работе уже использовали данную реализацию
    public void displayById() {
        //Person[] tmp = idList.toArray(new Person[count]);
        for (Person p : idList) {
            System.out.println(p);
        }
    }

    public void displayByAge() {
        //Person[] tmp = ageList.toArray(new Person[count]);
        for (Person p : ageList) {
            System.out.println(p);
        }
    }

    public void displayByName() {
        //Person[] tmp = nameList.toArray(new Person[count]);
        for (Person p : nameList) {
            System.out.println(p);
        }
    }
}
