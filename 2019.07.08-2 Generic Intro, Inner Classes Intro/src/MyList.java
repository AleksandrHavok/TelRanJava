
public class MyList<T>  {
    private T[] arr;
    private int count;

    public MyList() {
        arr = (T[]) new Object[10];//кастинг специально для того чтобы могли использовать класс для разных типов.
        // Так мы уверены что у нас будет точно нужный тип у массивов
    }

    boolean add(T value) {
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

    public int indexOf(T value) {
        if (value != null) {
            for (int i = 0; i < count; i++) {
                if (arr[i].equals(value)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public T get(int index){
        if(index<0||index>=count){
            return null;
        }
        return arr[index];
    }

    public int size(){
        return count;
    }

}
