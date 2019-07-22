public class TestEmployeeDuplicate {
    public static void main(String[] args) {
        Person p1 = new Person("Vasya", 27);
        Person p2 = new Person("Vasya", 27);
        Person[] arr = new Person[10];

        add(arr, p1);
        add(arr, p2);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].toString());
//                System.out.println(arr[i]);
            } else{
                System.out.println(arr[i]);
            }
        }

        boolean res=p1.equals(p2);
        System.out.println(res);
    }

    public static void add(Person[] arr, Person p) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = p;
                break;
            } else if (arr[i].equals(p)) {
                break;
            }
        }
    }
}
