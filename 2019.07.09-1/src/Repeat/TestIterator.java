package Repeat;

import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args){
        RangeIterator itr1= new RangeIterator(10,20);
        ReverseRangeIterator itr2 = new ReverseRangeIterator(10,20);
        display(itr1);
        display(itr2);
        System.out.println("----------------");
        DoubleRangeIterator itr3 = new DoubleRangeIterator(10,15);
        display(itr3);

        String[] names = {" 1", " 2", " 3", " 4"};
        //цикл foreach - упрощенный for
        //может работать только по массиву или методу итератора,
        //Пока hasNext() возвращает true, в str пишет, что возвращает next()
        //String str == T v в методе display, names == iterator
        for (String str:names){
            System.out.println(str);
        }
    }

    //public static void display(Iterator<Integer> iterator) {
    //можно делать универсальные дженерик методы способом ниже:
    public static <T> void display(Iterator<T> iterator){
        if (iterator!= null){
            while (iterator.hasNext()){
                T v = iterator.next();
                //System.out.println("a " +iterator.next());
                System.out.println(v);
            }
        }
    }
}
