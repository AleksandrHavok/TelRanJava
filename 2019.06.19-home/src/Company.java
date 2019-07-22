public class Company {
    private Person arr[] = new Person[10];
    //Счетчик фактически добавленных элементов в массив
    private int addCount = 0;


    public Company(Person arr[]) {
        this.arr = arr;
    }

    /*добавляет уникальных персонов,если не добавил то возвращает false. не добавляет null и Person. только Wage и Salary
     *массив на 10 элементов, поэтому не добавляет когда массив закончился.
     */

    public boolean add(Person p) {
        if (arr == null) {
            return false;
        }
        int i = 0;
        if (p instanceof WageEmployee || p instanceof SalaryEmployee) {
            for (i = 0; i < arr.length; i++) {
                if (arr[i] != null && arr[i].equals(p)) {
//                    System.out.println("Employee exist yet");
                    return false;
                }
            }
            for (i = 0; i < arr.length; i++) {
                if (arr[i] == null) {
                    arr[i] = p;
                    addCount++;
                    break;
                }
            }
            if (i == arr.length) {
//                System.out.println("Array is full");
                return false;
            }
        } else {
//            System.out.println("This Employee is not Wage or Salary");
            return false;
        }
//        System.out.println("Add successful");
        return true;
    }

    //task* реализовать add так чтобы добавлялся элемент даже если массив переполнен. релокация массива
    public boolean addCell(Person p) {
        if (arr == null) {
            return false;
        }
        int i = 0;
        if (p instanceof WageEmployee || p instanceof SalaryEmployee) {
            for (i = 0; i < arr.length; i++) {
                if (arr[i] != null && arr[i].equals(p)) {
//                    System.out.println("Employee exist yet");
                    return false;
                }
            }
            for (i = 0; i < arr.length; i++) {
                if (arr[i] == null) {
                    arr[i] = p;
                    addCount++;
                    break;
                }
            }
            if (i == arr.length) {
//                System.out.println("Array is full, expanding array");
                Person[] tmp = new Person[arr.length + 1];

            }
        } else {
//            System.out.println("This Employee is not Wage or Salary");
            return false;
        }
//        System.out.println("Add successful");
        return true;
    }

    //по id уводим ячейку в null. не удаляет ячейку
    public boolean remove(int id) {
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    arr[i] = null;
//                    System.out.println("Remove successful");
                    return true;
                }
            }
        }
        if (i == arr.length) {
//            System.out.println("Array didn't consist element with Id= " + id);
            return false;
        }
        return true;
    }

    //по id удаляем ячейку.релокация массива
    public boolean removeCell(int id) {
        int i = 0;
        int count = 0;
        Person[] tmp = new Person[arr.length - 1];
        for (i = 0; i < arr.length - count; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    arr[i] = null;
//                    System.out.println("Remove successful");
                    count++;
                }
                tmp[i] = arr[i + count];
            }
        }
        if (i + count == arr.length) {
//            System.out.println("Array didn't consist element with Id= " + id);
            return false;
        }
        arr = tmp;
        return true;
    }

    // возвращает фактическое количество добавленных элементов в массив
    public int size() {
        return addCount;
    }

    //вывести все элементы массива и общуюю salary всех employee
    public void printReport() {
        double salary = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] instanceof WageEmployee) {
                WageEmployee tmp = (WageEmployee) arr[i];
                salary += tmp.calcSalary();
                System.out.println(arr[i].toString());
            } else if (arr[i] instanceof SalaryEmployee) {
                SalaryEmployee tmp = (SalaryEmployee) arr[i];
                salary += tmp.getSalary();
                System.out.println(arr[i].toString());
            } else {
                System.out.println(arr[i]);
            }
        }
        System.out.println("===============");
        System.out.println("Total Salary= " + salary);
    }
}
