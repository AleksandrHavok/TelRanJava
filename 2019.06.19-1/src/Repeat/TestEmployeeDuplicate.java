package Repeat;

public class TestEmployeeDuplicate {
    public static void main(String[] args) {
        Person p1 = new Person("Sasha", 26);
        Person p2 = new Person("Denis", 25);
        Person[] arr = new Person[10];

        add(arr, p1);
        add(arr, p2);

        printPerson(arr);
    }

    // метод добавления нового значения в массив
    public static void add(Person[] arr, Person p) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = p;
                break;
            } else if (arr[i].equals(p)) {//проверка на наличие такого значения в массиве
                break;
            }
        }
    }
    //метод печати массива
    public static void printPerson(Person[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Проверка на null, ибо нельзя вызывать у пустой ссылки (null) метод,
            // при первом же null в массиве упадем в NPE
            if (arr[i] != null) {
                System.out.println(arr[i].toString());
            } else {
            // Если хотим распечатать весь массив, включая null в значениях,
            // то необходимо печатать сам элемент, то бишь ссыль на него - null
                System.out.println(arr[i]);
            }
        }
    }
}
