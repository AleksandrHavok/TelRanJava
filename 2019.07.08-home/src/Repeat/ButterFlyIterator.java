package Repeat;

public class ButterFlyIterator {
    private int arr[];
    //начальный индекс и переменная, по которой будем его восстанавливать
    private int start=0,startReverse=0;
    private int end;
    private int step = 2;
    //проверка на то, идем в прямом или обратном направлении
    private boolean isReverse = false;
    //проверка на четность
    private boolean isEven = false;


    public ButterFlyIterator(int[] arr) {
        this.arr = arr;
        //конечное значение на 1 меньше, т.к. перебор идет по индексам
        this.end = arr.length-1;
        if (arr.length % 2 == 0) {
            isEven = true;
        }
    }


    public boolean hasNext() {
        //т.к. требуется проход в прямом и обратном направлении, то мы проверяем, дошел ли start до end,
        // затем восстанавливаем в нем начальное значение и, если массив нечетный, то делаем отступ в 1 от end
        // проверка на reverse нужна, чтобы в обратном направлении мы не заходили в это условие повторно, и не получили зацикливание
        if (!isReverse) {
            if (start > end) {
                start = startReverse;
                if (!isEven) {
                    end--;
                }
                isReverse = true;
            }
        }
        return end >= start;
    }

    public int next() {
        if (!hasNext()) {
            return -1;
        }
        int res;
        if (isReverse) {
            res = end;
            end -= step;
            return +res;
        } else {
            res = start;
            start += step;
        }
        return res;
    }
}
