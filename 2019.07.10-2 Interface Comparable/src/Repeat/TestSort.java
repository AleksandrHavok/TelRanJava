package Repeat;

import java.util.Arrays;
import java.util.Comparator;

//Введение в компараторы
//Класс для тестирования компараторов и сортировки Person по возрасту, идентификатору и имени
public class TestSort {
    public static void main(String[] args) {
        Person[] arr = new Person[10];
        arr[0] = new Person(1, "Kolya", 22);
        arr[1] = new Person(2, "Sasha", 26);
        arr[2] = new Person(3, "Denis", 19);
        PersonAgeComparator pac = new PersonAgeComparator();
        PersonIdComparator pic = new PersonIdComparator();
        PersonNameComparator pnc = new PersonNameComparator();

        sort(arr, pac);
        //цикл foreach - упрощенный for
        //может работать только по массиву или методу итератора
        //Пока hasNext() возвращает true в p пишет что возвращает next()
        //Соответственно сейчас будем прогонять цикл пока не кончится массив arr
        for (Person p : arr){
            System.out.println(p);
        }
        sort(arr, pic);
        for (Person p : arr){
            System.out.println(p);
        }
        sort(arr, pnc);
        for (Person p : arr){
            System.out.println(p);
        }

        //Используя стандартный класс Arrays и его метод sort будем падать с NPE
        //т.к. есть пустые элементы в массиве
        //Arrays.sort(arr);
        //Можно сделать сортировку указав промежуток [fromIndex, toIndex),
        //но упадем если левая граница превысит размер заполненной части массива
        Arrays.sort(arr,0,3);
        for(Person p : arr){
            System.out.println(p);
        }
        System.out.println("---------------------");
        //Аналогично будем падать с NPE
        //Arrays.sort(arr, new PersonAgeComparator());
        Arrays.sort(arr, 0,3, new PersonAgeComparator());
        for(Person p : arr){
            System.out.println(p);
        }
    }

    //Делаем универсальный метод для любых компараторов Person, обычная сортировка пузырьком
    public static void sort(Person[] arr, Comparator<Person> comp) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == null || arr[j + 1] == null) {
                    continue;
                }
                if (comp.compare(arr[j], arr[j + 1]) > 0) {
                    Person tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
