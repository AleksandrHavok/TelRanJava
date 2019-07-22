public class TestManager {
    public static void main(String[] args) {
        Person[] arr = new Person[30];
//        arr[0]=new Person("Person" + 0, 0 + 0, 0 + 0);
        for (int i = 0; i < 30; i++) {
            arr[i]=new Person("Person" + i, 0 + i, 0 + i);
        }
        PersonManager pm = new PersonManager(arr);
//        pm.add(new Person("Person" + 0, 0 + 0, 0 + 0));
//        for (int i = 1; i < 30; i++) {
//            pm.add(new Person("Person" + i, 0 + i, 0 + i));
//        }
        pm.printReport();
        System.out.println("Size: "+pm.size());
        System.out.println("-----------------");
        System.out.println(pm.find(15));
        System.out.println("-----------------");
        Person find[] = pm.find(10, 20);
        for (int i = 0; i < find.length; i++) {
            if (find[i] != null) {
                System.out.println(find[i]);
            }
        }
    }


}
