public class TestManager {
    public static void main(String[] args) {
        ShapeManager sm=new ShapeManager();
        Circle c1=new Circle(10);
        Rectangle r1=new Rectangle(3,2);
        sm.add(c1);
        sm.add(r1);

        sm.display();
    }
}
