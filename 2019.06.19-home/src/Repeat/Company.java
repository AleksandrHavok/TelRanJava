package Repeat;

//Вариант задачи, где нельзя превысить количество элементов в массиве.
//Массив создается в конструкторе класса Company, потому исключаем варианты криво заполненных массивов,
//только прямое создание массива через методы
public class Company {
    private int count = 0;
    private Person[] arr;

    //Т.к. массив инстанцируется в конструкторе, то мы точно знаем, что сам массив не null, можно убрать проверки в методах
    public Company() {
        arr = new Person[10];
    }

    //Метод добавления значения в массив с проверкой на переполнение
    public boolean add(Person p) {
        //проверка на то, что массив не пустой - не нужна, из-за конструктора.
        //if (arr == null) {
        //    return false;
        //}
        //проверка на то, что Person является WageEmployee или SalaryEmployee
        if (!(p instanceof SalaryEmployee) && !(p instanceof WageEmployee)) {
            return false;
        }
        //проверка на переполнение
        if (count == arr.length) {
            return false;
        }
        for (int i = 0; i < count; i++) {
            if (arr[i].equals(p)) {
                return false;
            }
        }
        arr[count] = p;
        count++;
        return true;
    }

    //Метод для удаления элемента из массива, при этом массив сам не уменьшается, вариант без полного смещения всех элементов до удаленного элемента(
    //производится перенос последнего элемента массива на место удаленного элемента, за счет чего исключаем падение в NPE на пустом элементе)
    public boolean remove(int id) {
        int indx = -1;
        Person tmp = new Person(id, null, -123);
        for (int i = 0; i < count; i++) {
            if (arr[i].equals(tmp)) {
                indx = i;
                break;
            }
        }
        if (indx >= 0) {
            //перекидываем на место удаленного элемента последний элемент массива для заполнения пустой ячейки
            arr[indx] = arr[count - 1];
            count--;
            arr[count] = null;
            return true;
        }
        return false;
    }

    public int size() {
        return count;
    }

    public void printReport() {

        double sum = 0;
        for (int i = 0; i < count; i++) {
            //проверки на arr[i] == null не нужны, потому что нет пустых ячеек в массиве, находящихся в пределах count
            if (arr[i] instanceof SalaryEmployee) {
                SalaryEmployee tmp = (SalaryEmployee) arr[i];
                sum += tmp.getSalary();
            } else if (arr[i] instanceof WageEmployee) {
                WageEmployee tmp = (WageEmployee) arr[i];
                sum += tmp.calcSalary();
            }
            System.out.println(arr[i].toString());

        }
        System.out.println("Total salary = " + sum);
    }
}