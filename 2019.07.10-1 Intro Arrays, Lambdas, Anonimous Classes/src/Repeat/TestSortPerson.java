package Repeat;

import java.util.Arrays;
import java.util.Comparator;

public class TestSortPerson {
    public static void main(String[] args) {
        Person[] arr = new Person[3];
        arr[0] = new Person(23, "Perya");
        arr[1] = new Person(24, "Sasha");
        arr[2] = new Person(25, "Sofya");

        //Компаратор помимо того что stateless должен быть еще и транзитивным, т.е.
        //a>b>c следовательно a>c
        //Если передаем a,b следовательно a>b и исходя из этого если передадим в компаратор b,a, то b<a
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        //тоже самое но в виде лямбды
        Arrays.sort(arr,(o1,o2)->o1.getName().compareTo(o2.getName()));
        for (Person p:arr){
            System.out.println(p);
        }

        Integer[] arr1 = new Integer[10000];
        for (int i=0;i<arr1.length;i++){
            arr1[i] = i;
        }

        //System.out.println(Arrays.toString(arr1));
        //Реализуем плохой компаратор, потому что можем упасть на невыполнении контракта сравнения объектов
        //Контракт компаратора состоит в следующем:
        //если первый элемент больше, вернет 1, если равны 0, если второй больше, то вернет -1
//        Arrays.sort(arr1, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1,Integer o2){
//                if (Math.random()>0.5){
//                    return 1;
//                }
//                return -1;
//            }
//        });
//        System.out.println(Arrays.toString(arr1));

        //Заменяем на лямбда выражение, чтобы не зависить от контракта
        //:: используется для конвертации обычного метода в лямбда выражение
        Arrays.sort(arr1,TestSortPerson::compare);
        System.out.println(Arrays.toString(arr1));

    }

    private static int compare(Integer o1, Integer o2){
        if (Math.random()>0.5){
            return 1;
        }
        return -1;
    }
}
