import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Predicate;

public class TestLists {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vasya");
        names.add("Petya");
        names.add("Sofa");
        names.add(1, "David");
        for (String str : names) {
            System.out.println((str));
        }
        String name = names.get(1);
        System.out.println(name);
        String updateName = names.set(1, "Anna");//запоминает предыдущее значение
        System.out.println("--------");
        System.out.println(updateName);
        System.out.println(names.get(1));
        System.out.println("--------");
        for (String str : names) {
            System.out.println((str));
        }
        System.out.println("--------");
        System.out.println(names.size());
        System.out.println("--------");
        String removed = names.remove(2);
        System.out.println(removed);
        System.out.println(names.size());
        boolean res = names.remove("Vasya");
        System.out.println(res);
        System.out.println("--------");
        System.out.println(names.size());
        names.add("Anna");
        names.add("Anna");
        int indx = names.indexOf("Anna");
        System.out.println(indx);
        indx = names.lastIndexOf("Anna");
        System.out.println(indx);
        indx = names.indexOf("Vasya");
        System.out.println(indx);
        System.out.println("--------");
        System.out.println(names.contains("Sofa"));
        System.out.println(names.isEmpty());
        names.clear();
        System.out.println(names.isEmpty());
        System.out.println("--------");
        names.add("Anna");
        names.add("Sofa");
        names.add("Vasya");
        names.add("Petya");
        names.add("David");
        List<String> subnames = names.subList(1, 4);
        subnames.clear();//Удалит из subnames, но так же и из names, т.к. ссылка на один элемент в ОЗУ
        for (String str : names) {
            System.out.println(str);
        }
        names.add("Anna");
        names.add("David");
        names.add("Anna");
        names.add("David");
        System.out.println("--------");

//        for (String str : names) {// ConcurrentModificationException, т.к. итератор внутри видит изменение массива. Нужно прерывание цикла
//            if (str.equals("Anna")) {
//                names.remove(str);
//                break;
//            }
//        }
//        for (String str : names) {
//            System.out.println(str);
//        }
//        System.out.println("--------");
//        removeDuplicates(names,"Anna");
        names.removeIf(str->str.equals("Anna"));
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("Anna");
            }
        });
        names.removeIf("Anna"::equals);//method reference, чуть сложнее лямбды
        for (String str : names) {
            System.out.println(str);
        }
        System.out.println("--------");
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(123);
        numbers.add(121);
        numbers.add(545);
        Integer min= Collections.min(numbers);
        System.out.println(min);
        Integer max= Collections.max(numbers);
        System.out.println(max);

        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.shuffle(numbers);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        indx=Collections.binarySearch(numbers, 123);
        System.out.println(indx);

        String [] arr={"Vasya","Perya","Sofa"};
        List<String> myList=Arrays.asList(arr);

        Integer[] arr1=numbers.toArray(new Integer[0]);//В скобках нужно передать любой экземпляр нужного типа,
        // небольшой костыль джавы, чтобы перейти от листа к массиву нужен тип для дженерика
        System.out.println(Arrays.toString(arr1));

    }

    //2 варианта реализации удаления элемента ниже
    public static void removeDuplicates1(ArrayList<String> list,String str){
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            if(itr.next().equals(str)){
                itr.remove();
            }
        }
    }


    public static void removeDuplicates(ArrayList<String> list, String str) {
        while (true) {
            boolean   isRemoved = false;
            for (String s : list) {
                list.lastIndexOf(str);
                if (s.equals(str)) {
                    list.remove(s);
                    isRemoved = true;
                    break;
                }

            }
            if (!isRemoved) {
                break;
            }
        }
    }
}

