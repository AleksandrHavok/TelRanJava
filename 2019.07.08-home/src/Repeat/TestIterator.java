package Repeat;

public class TestIterator {
    /*  todo
        batterfly итератор
        принимает в себя массив int[] arr. Идет через 1 вперед, дошел до конца, делает шаг назад и идет в обратную сторону.
        123456 вернет 135642
     */
    public static void main (String[] args){
        int n = 7;
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=i+1;
        }
        //т.к. итератор не затрагивает непосредственно значения, а работает с индексами массива, то чтобы вернуть сами значения массива необходимо
        //указать что мы получаем значение по нужному индексу
        ButterFlyIterator bti = new ButterFlyIterator(arr);
        while (bti.hasNext()){
            System.out.println(arr[bti.next()]);
        }
        System.out.println("----------");
        arr = new int[] {4,3,7,6};
        bti = new ButterFlyIterator(arr);
        while (bti.hasNext()){
            System.out.println(arr[bti.next()]);
        }
    }
}
