package Repeat;

import java.util.Random;

public class TestOOP {

    public static void main(String[] args) {
        /*Модификаторы доступа
         *public
         * private
         * package
         * protected
         */

        MyClass m = new MyClass();
        System.out.println(m.a(132));
        System.out.println(m.getA());
        System.out.println("-----------------------------");
        Student s1/*экземпляр класса*/ = new Student("Sasha", 23, "1525");//Класс является типом данных. В данном случае ссылочный тип данных
        /*основные признаки ООП:
         * инкапсуляция - все поля класса private и есть public методы кторыми можно работать со значениями полей
         * полиморфизм
         * наследование
         * */
        s1.setName("Havi");
        s1.setAge(26);
        System.out.println(s1.getName() + " " + s1.getAge() + " " + s1.getPhone());

        Student s2 = new Student("Petya", 22, "99151");
        s2.setName("Petya");
        s2.setAge(-35);
        System.out.println(s2.getAge() + " " + s2.getName());
        Random rnd;
        s1.display();
        s2.display();
        Student s3 = null;
        //     s3.display();//падаем в NPE
        Student[] students = new Student[5];
        students[0] = s1;
        students[1] = s2;
        s3 = new Student();
        students[2] = s3;
        printStudents(students);
        printStudents(null);//выходим из метода, т.к. массив пустой
    }

    public static void printStudents(Student[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            Student curr = arr[i];
            if (arr[i] != null) {//проверка на null, иначе упадем в NPE, т.к. в массиве не все ячейки заполнены
                curr.display();
            }
        }
    }
}
