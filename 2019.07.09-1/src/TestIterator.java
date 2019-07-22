import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        RangeIterator itr1 = new RangeIterator(10, 20);
        ReverseRangeIterator itr2 = new ReverseRangeIterator(10, 20);
        display(itr1);
        display(itr2);
        //подход вида рпойти и распечатать является стандартным
        System.out.println("-------------------------------------------------- ");
        DoubleRangeIterator itr3=new DoubleRangeIterator(10, 15);
        display(itr3);

        String[] names={" 1"," 2"," 3"," 4"};
        for (String str:names) {//упрощенный for, работает с массивами.
            // Идет пока метод hasNext() возвращает true, в str пишет то что возвращает next()
            //String str=T v из display, names=iterator
            System.out.println(str);
        }
    }

//    public static void display(Iterator<Integer> iterator) { можно делать дженерик методы способом ниже:
        public static <T> void display(Iterator<T> iterator) {
        if (iterator != null) {
            while (iterator.hasNext()) {
                T v = iterator.next();
//                System.out.println(iterator.next());
                System.out.println(v);
            }
        }
    }

}
