package Repeat;

//Класса, который будет реализовывать работу с массивами различных типов данных
//соответственно нужно указать, что это дженерик
public class MyList<T> {
    private T[] arr;
    private int count;

    public MyList() {
        //делаем downcasting с явным приведением специально чтобы могли использовать
        //данный класс для разных типов
        //Так мы будем уверены, что у нас точно будет нужный тип массива
        arr = (T[]) new Object[10];
    }

    public boolean add(T value) {
        if (value == null) {
            return false;
        }
        if (count == arr.length) {
            T[] tmp = (T[]) new Object[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                tmp[i] = arr[i];
            }
            arr = tmp;
        }
        arr[count++] = value;
        return true;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= count) {
            return false;
        }
        arr[index] = arr[count - 1];
        count--;
        return true;
    }

    public int indexOf(T value){
        if (value!= null){
            for (int i=0;i<count;i++){
                if(arr[i].equals(value)){
                    return i;
                }
            }
        }
        return -1;
    }

    public T get(int index) {
        if (index < 0 || index >= count) {
            return null;
        }
        return arr[index];
    }

    public int size() {
        return count;
    }
}
