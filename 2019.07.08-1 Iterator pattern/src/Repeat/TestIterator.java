package Repeat;

public class TestIterator {
    public static void main(String[] args) {
        RangeIterator itr = new RangeIterator(10, 20, 2, true);
        //Т.к. работаем с введенными данными в рамках поля объекта, то они будут изменяться и перезаписываться внутри
        //соответственно на новой итерации одна из границ(в зависимости от направления) изменится на величину шага
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //т.к. мы прошли по всем значениям итератора, то вернет hasNext=-1
        System.out.println(itr.next());
    }
}
