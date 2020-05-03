package Repeat;

public class Company {
    private int count = 0;
    private Person[] arr;

    public Company() {
        arr = new Person[10];
    }

    public boolean add(Person p) {
        if (!(p instanceof SalaryEmployee) && !(p instanceof WageEmployee)) {
            return false;
        }
        //Увеличение массива в случае достижения максимального размера.
        if (count == arr.length) {
            //Массив принято увеличивать в несколько раз, для сокращения процессорного времени.
            Person[] tmp = new Person[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                tmp[i] = arr[i];
            }
            arr = tmp;
        }
        for (int i = 0; i < count; i++) {
            if (arr[i].equals(p)) {
                return false;
            }
        }
        //arr[count] = p;
        //count++;
        //можно также увеличивать счетчик таким образом:
        arr[count++] = p;
        return true;
    }

    public boolean remove(int id) {
        int indx = -1;
        Person p = new Person("", id, -123);
        for (int i = 0; i < count; i++) {
            if(arr[i].equals(p)) {
                indx = i;
                break;
            }
        }
        if (indx >= 0) {
            //В данном случае можно не создавать новую переменную для цикла и новый массив,
            //сдвиг записей происходит в правой части от значения indx
            //соответственно левую часть массива можно не трогать
            //for (int i = indx; i < count - 1; i++) {
            //    arr[i] = arr[i + 1];
            //}
            //Как альтернатива этому циклу, можно использовать вариант ниже
            for (;indx<count-1;indx++){
                arr[indx]= arr[indx+1];
            }
            count--;
            arr[count]=null;
            return true;
        }
        return false;
    }

    public int size() {
        return count;
    }

    public void printReport() {
        double totalSum = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] instanceof SalaryEmployee) {
                SalaryEmployee tmp = (SalaryEmployee) arr[i];
                totalSum += tmp.calcSalary();
            } else if (arr[i] instanceof WageEmployee) {
                WageEmployee tmp = (WageEmployee) arr[i];
                totalSum += tmp.calcSalary();
            }
            System.out.println(arr[i].toString());
        }
        System.out.println("------------");
        System.out.println(totalSum);
    }
}
