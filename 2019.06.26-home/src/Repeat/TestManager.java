package Repeat;

public class TestManager {
    public static void main(String[] args) {
        Person[] arr = new Person[100];
        for (int i = 10; i < 20; i++) {
            arr[i] = new Person("Person " + i, 100 + i, i);
        }
        PersonManager pm = new PersonManager(arr);
        pm.printReport();
        System.out.println("Size: " + pm.size());
        System.out.println("-----------------");
        System.out.println(pm.find(15));
        System.out.println("-----------------");
        //Т.к. find для промежутка - это метод типа Person[],
        //то нам необходимо иметь массив для получения значений
        Person find[] = pm.find(25, 30);
        for (int i = 0; i < find.length; i++) {
            //проверка на случай пустого элемента массива (когда не нашли подходящие элементы - вернем массив из null)
            //чтобы не выводить null в консоль
            if (find[i] != null) {
                System.out.println(find[i]);
            }
        }
    }
}
