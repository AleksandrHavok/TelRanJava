public class TestShapes {

    public static void main(String[] args) {
        Triangle t1 = new Triangle(3);
        Triangle t2 = new Triangle(4);
        Shape t3 = new Triangle(4);
        Square s1 = new Square(3);
        Square s2 = new Square(4);
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(4);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println("============");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println("============");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
