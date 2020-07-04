package Repeat;

import java.util.*;
import java.util.function.Predicate;

public class TestLists {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Vasya");
        names.add("Petya");
        names.add("Sofa");
        //Добавляем элемент на индекс 1, остальные элементы списка будут сдвинуты на 1 дальше
        //Соответственно в итоге David2 будет находиться на позиции 1, а David на 2
        names.add(1,"David");
        names.add(1,"David2");
        for (String str : names){
            System.out.println(str);
        }
        //Метод для получения значечения из списка по его индексу
        String name = names.get(0);
        System.out.println(name);
        System.out.println("--------------");
        //Метод обновляет значение по указанному индексу на новое,
        //при этом сохраняет предыдущее значение
        String updateName = names.set(1,"Anna");
        System.out.println(updateName);
        System.out.println(names.get(1));
        System.out.println("--------------");
        for (String str : names){
            System.out.println(str);
        }
        System.out.println("--------------");

        //выводим размер списка
        System.out.println(names.size());
        System.out.println("--------------");

        //удаляем значение из списка
        String removed = names.remove(2);
        System.out.println(removed);
        System.out.println(names.size());
        boolean res = names.remove("Vasya");
        System.out.println(res);
        System.out.println(names.size());
        System.out.println("--------------");

        //нет проверки на уникальность, добавит оба элемента в конец списка
        names.add("Anna");
        names.add("Anna");
        //найдем первое вхождение элемента в списке
        int indx = names.indexOf("Anna");
        System.out.println(indx);
        //найдем соответственно последнее вхождение в список
        indx = names.lastIndexOf("Anna");
        System.out.println(indx);
        System.out.println("--------------");

        //проверка на наличие элемента в списке
        System.out.println(names.contains("Sofa"));
        //проверка на то пуст ли список
        System.out.println(names.isEmpty());
        //удаляем все элементы из списка
        names.clear();
        System.out.println(names.isEmpty());
        System.out.println("--------------");

        names.add("Anna");
        names.add("Sofa");
        names.add("Vasya");
        names.add("Petya");
        names.add("David");

        List <String> subnames = names.subList(1,4);
        //т.к. в ОЗУ ссылаемся на один и тот же элемент, то удалит записи также и из names
        subnames.clear();
        for(String str : names){
            System.out.println(str);
        }
        names.add("Anna");
        names.add("David");
        names.add("Anna");
        names.add("David");
        System.out.println("--------------");

        /*
        //Попытка удалить все однотипные записи из списка
        //Будем падать в ConcurentModificationException, т.к. итератор внутри видит
        //изменения массива, соответственно нужно прерывание цикла
        for (String str : names){
            if (str.equals("Anna")){
                names.remove(str);
                //Прерывание цикла
                break;
            }
        }
        for (String str : names){
            System.out.println(str);
        }
         System.out.println("--------------");
        */

        /*
        //Вариант массового удаления из массива #1
        removeDuplicates(names,"Anna");
        for (String str : names){
            System.out.println(str);
        }
        */

        /*
        //Вариант массового удаления из массива #2
        removeDuplicates1(names,"Anna");
        for (String str : names){
            System.out.println(str);
        }
        */
        //Есть стандартный метод для ArrayList для удаления одинаковых элементов
        names.removeIf(str->str.equals("Anna"));
        //распишем лямбду подробнее:
        names.removeIf(new Predicate<String>(){
            @Override
                    public boolean test(String s){
                return s.equals("Anna");
            }
        });
        //method reference
        //:: используется для конвертации обычного метода в лямбда выражение
        names.removeIf("Anna"::equals);
        for (String str : names){
            System.out.println(str);
        }
        System.out.println("--------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(123);
        numbers.add(121);
        numbers.add(454);
        Integer min = Collections.min(numbers);
        System.out.println(min);
        Integer max = Collections.max(numbers);
        System.out.println(max);

        //Сортировка по увеличению
        Collections.sort(numbers);
        System.out.println(numbers);
        //Перемешивание элементов в массиве
        Collections.shuffle(numbers);
        System.out.println(numbers);
        //Отобразить массив в обратном порядке
        Collections.reverse(numbers);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        //В коллекциях работает бинарный поиск ищем индекс элемента
        indx = Collections.binarySearch(numbers,123);
        System.out.println(indx);

        String [] arr = {"Vasya","Petya","Sofa"};
        //Преобразуем массив в список
        List <String> myList = Arrays.asList(arr);
        System.out.println(myList.toString());

        //Преобразование списка в массив.
        //В скобках нужно передать любой экземпляр нужного типа,
        //Небольшой костыль дажвы, чтобы перейти от списка к массиву нужно указать
        //тип для дженерика, хотя мы изначально создаем список указав тип
        Integer[] arr1 = numbers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr1));
    }




    //Реализация удаления одинаковых элементов из массива #1
    //По большому счету тот же вариант с прерыванием, который работает пока не вычистит
    //весь массив
    public static void removeDuplicates(ArrayList<String> list, String str) {
        while (true){
            boolean isRemoved = false;
            for (String s : list){
                list.lastIndexOf(str);
                if (s.equals(str)){
                    list.remove(s);
                    isRemoved = true;
                    break;
                }
            }
            if (!isRemoved){
                break;
            }
        }
    }

    //Реализация удаления одинаковых элементов из массива #2
    //Т.к. у нас была проблема с итератором класса ArrayList,
    //пишем свой итератор для удаления элементов
    public static void removeDuplicates1(ArrayList <String> list, String str){
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            if(itr.next().equals(str)){
                itr.remove();
            }
        }
    }
}
