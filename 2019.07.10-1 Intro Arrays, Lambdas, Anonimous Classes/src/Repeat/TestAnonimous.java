package Repeat;

//Ввод в анонимные классы
public class TestAnonimous {
    public static void main(String[] args) {
        MyClass c1 = new MyClass();
        c1.display();

        MyClass c2 = new MyClass() {
            //реализация анонимного класса
            //переопределяем метод
            void display() {
                System.out.println("My realisation");
            }
        };
        c2.display();
        //обратимся к анонимному классу
        System.out.println(c2.getClass().getName());
        //обратимся к внутреннему классу
        System.out.println(c2.getClass().getSuperclass().getName());
        System.out.println(c1.getClass().getName());

        //В анонимных классах можно использовать только final переменные
        //Необходимо при инициализации указывать объект как final, указывая таким образом,
        //что он не будет изменяться. Связано с ограничениями анонимных классов, так что final
        //для переменных используемых в анонимном классе является обязательным атрибутом
        final int sum = 10;
        //Если переменная не final, то при попытке переопределения будет ошибка компиляции
        //в методе doSome в анонимном классе с требованием указать атрибут final.
        //Соответственно переопределение переменной также будет невалидно(т.к. она final)
        //закомментим и ее тоже
        //sum=100;

        MyInterface my = new MyInterface() {
            @Override
            public void doSome() {
                System.out.println("Do " + sum);
            }
        };
        my.doSome();
        System.out.println(my.getClass().getName());
        //Даже попытка переопределения после использования анонимного класса будет вызывать ошибку в doSome, комментаим.
        //sum = 100;
    }

    interface MyInterface {
        void doSome();
    }

    static class MyClass {
        void display() {
            System.out.println("MyClass");
        }
    }
}
