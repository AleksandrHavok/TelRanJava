package Repeat;

//Паттерн Итератор
//Итератор - шаблон проектирования, с помощью которого можно производить перебор массива данных, например списка или коллекции
//при этом итератор не раскрывает внутреннее устройство перебираемого объекта
public class RangeIterator {
    private int start;
    private int end;
    private int step;
    private boolean reverse;

    public RangeIterator(int start, int end, int step, boolean reverse) {
        this.start = start;
        this.end = end;
        this.step = step;
        this.reverse = reverse;
    }

    //проверка на возможность сделать еще одну итерацию
    public boolean hasNext() {
        return end >= start;
    }
    //возвращает результат итерации исходя из переданных параметров
    //если порядок прямой, то возвращаем стартовое значение
    //затем увеличиваем его его на шаг
    //если порядок обратный, то возвращаем конечное значение
    //затем уменьшаем его на шаг
    public int next() {
        if (!hasNext()) {
            return -1;
        }
        int res;
        if (reverse) {
            res = end;
            end -= step;
            return res;
        } else {
            res = start;
            start += step;
        }
        return res;
    }
}
