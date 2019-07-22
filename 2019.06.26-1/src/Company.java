public class Company {
    private Person[] arr;
    private int count;

    public Company() {
        arr = new Person[10];
    }

    public boolean add(Person p) {
        if (p == null) {
            return false;
        }
        if (count == arr.length) {
            Person[] tmp = new Person[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                tmp[i] = arr[i];
            }
            arr = tmp;
        }
        arr[count++] = p;
        return true;
    }

    public boolean remove(int id) {
        return true;
    }

    public int size() {
        return count;
    }

    public void printReport() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += arr[i].calcSalary();
            System.out.println(arr[i].toString());
        }
        System.out.println("----------------");
        System.out.println("Total salary= "+total);
    }
}