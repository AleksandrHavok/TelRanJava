package Repeat;

//Домашнее задание для ввода в понятие абстрактных классов
// без непосредственного участия понятия абстрактного класса и без полиморфизма
public class TestShapes {
    public static void main(String[] args) {

        Triangle t1 = new Triangle(15.2);
        System.out.println(t1.toString());
        Triangle t2 = new Triangle(3);
        System.out.println(t2.toString());

        Circle c1 = new Circle (4);
        System.out.println(c1.toString());
        Circle c2 = new Circle (10);
        System.out.println(c2.toString());

        Square s1 = new Square(8);
        System.out.println(s1.toString());
        Square s2 = new Square(25.5);
        System.out.println(s2.toString());
    }
}
