import java.util.Random;

public class TestOOP {

    public static void main(String[] args) {
        /*Модификаторы доступа
         *public
         *private
         *package
         *protected
         */

        Student s1/*экземпляр класса*/ = new Student("Vasya",23,"01251");//Класс является типом данных. В данном случае ссылочный тип данных
        /*основные признаки ООП:
         *инкапсуляция - все поля класса private и есть методы public которыми можно работать со значениями полей
         *полиморфизм
         *наследование
         */
//        s1.setName("Vasya");
//        s1.setAge(23);

        Student s2 = new Student("Petya",23,"0555");
//        s2.setName("Petya");
//        s2.setAge(-32);

//        System.out.println("Student 1: " + s1.getName() + " " + s1.getAge());
//        System.out.println("Student 2: " + s2.getName() + " " + s2.getAge());
//        Random rnd;
//        s1.display();
//        s2.display();
//        Student s3=new Student();
        Student s3 = null;
//        s3.display();
//        Student[] students={s1,s2};
        Student[] students = new Student[5];
        students[0] = s1;
        students[1] = s2;
        s3 = new Student();
        students[2] = s3;
        printStudents(students);
//        printStudents(null);
    }

    public static void printStudents(Student[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            Student curr = arr[i];
            if (arr[i] != null) {
                curr.display();
//                arr[i].display();
//                System.out.println("=====");
            }
        }
    }

}
