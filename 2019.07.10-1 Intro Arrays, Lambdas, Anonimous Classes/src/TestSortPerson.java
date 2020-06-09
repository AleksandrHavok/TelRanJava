import java.util.Arrays;
import java.util.Comparator;

public class TestSortPerson {

    public static void main(String[] args) {
        Person[] arr = new Person[3];
        arr[0] = new Person(23, "Petya");
        arr[1] = new Person(24, "Vasya");
        arr[2] = new Person(25, "Ira");

        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        // Comparator помимо stateless должен быть транзитивным a>b>c->a>c
        // если передаем a,b->a>b и исходя из этого если передадим в компаратор b,a->b<a;
        for (Person p : arr) {
            System.out.println(p);
        }

        Integer[] arr1 = new Integer[10000];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }
//        System.out.println(Arrays.toString(arr1));
        //реализуем хреновый компаратор ибо падаем на невыполнении контракта
        Arrays.sort(arr1, //            @Override
                //            public int compare(Integer o1, Integer o2) {
                //                if (Math.random() > 0.5) {
                //                    return 1;
                //                }
                //                return -1;
                //            }
                //заменили на лямбда выражение ниже
                TestSortPerson::compare);

//        System.out.println(Arrays.toString(arr1));
    }

    private static int compare(Integer o1, Integer o2) {
        if (Math.random() > 0.5) {
            return 1;
        }
        return -1;
    }
}
