package Repeat;

import java.util.Iterator;

public class TestNames {
    public static void main(String[] args) {
        NamesList list = new NamesList();
        list.add("Vasya");
        list.add("Sasha");


        String[] array = list.getAll();
        //записи в списке не будут перезаписаны, обновятся только записи в array
        array[0] = "Loser";
        array[1] = "Loser";

        for (String s : array) {
            System.out.println(s);
        }
        System.out.println("===============");

        array = list.getAll();
        //Вместо обращения к классу итератора в NamesList можно инициализировать
        //объект используя интерфейс - вернется объект типа NamesIterator
		//NamesList.NamesIterator iterator = list.iterator();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Iterable<String> itr = new NamesList();
        for (String str: itr){
            System.out.println(str);
        }

    }
}
