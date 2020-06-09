import java.util.Arrays;

public class TestArrays {

    public static void main(String[] args) {
        String[] arr = {"Vasya", "Petya", "Sofa", "Ira"};
        Arrays.sort(arr);
        int i = Arrays.binarySearch(arr, "Sasha");
        System.out.println(Arrays.toString(arr));
        System.out.println(i);
        System.out.println(Arrays.toString(arr));
        String[] copy = Arrays.copyOf(arr, 2);//опирует массив сколько есть, остальное отрезает.
        // Если больше изначального, то забивает его нулями
        System.out.println(Arrays.toString(copy));

        copy = Arrays.copyOfRange(arr, 3, 5);//to indx не включительно 1-3 выдернет 1 и 2
        // Если индекс больше оригинального массива, то добавляет null
        System.out.println(Arrays.toString(copy));
        Arrays.fill(arr, "NoName");//авто заполнение массива
        System.out.println(Arrays.toString(arr));
        copy = Arrays.copyOf(arr, arr.length);
        copy[0] = "Petya";
        System.out.println(Arrays.equals(arr, copy));//сверка поэлементная
    }
}
