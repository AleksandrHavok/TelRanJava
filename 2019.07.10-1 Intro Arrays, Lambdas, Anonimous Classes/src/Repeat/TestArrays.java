package Repeat;

import java.sql.SQLOutput;
import java.util.Arrays;

//введение в класс Arrays
public class TestArrays {
    public static void main(String[] args) {
        String[] arr = {"Vasya","Sasha","Kolya", "Petya"};
        Arrays.sort(arr);
        //бинарный поиск
        int i = Arrays.binarySearch(arr,"Sasha");
        System.out.println(Arrays.toString(arr));
        System.out.println(i);
        System.out.println(Arrays.toString(arr));
        //Создает массив указанной длины и копирует в него элементы
        //Если индекс меньше длины оригинала, то копируется только часть указанной длинны
        //Если индекс больше, чем оригинальный массив, то создает пустые элементы null
        String[] copy = Arrays.copyOf(arr,2);
        System.out.println(Arrays.toString(copy));
        copy = Arrays.copyOf(arr,7);
        System.out.println(Arrays.toString(copy));

        //Копирует часть массива не включая индекс to.
        //1-3 вернет элементы 1-2
        //Если индекс больше, чем длина оригинального массива, то создает пустые элементы null
        copy = Arrays.copyOfRange(arr,3,7);
        System.out.println(Arrays.toString(copy));
        //Автозаполнение массива, причем принимает на вход Object,
        //соответственно можно заполнять массив элементами того же типа
        Arrays.fill(arr,"Noname");
        System.out.println(Arrays.toString(arr));
        copy = Arrays.copyOf(arr,arr.length);
        copy[0] = "Petya";
        //Производится поэлементная сверка двух массивов
        System.out.println(Arrays.equals(arr,copy));
    }
}
