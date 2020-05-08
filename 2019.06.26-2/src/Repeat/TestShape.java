package Repeat;

//введение в интерфейсы и их реализацию в классах
public class TestShape {
    public static void main(String[] args){
        ShapeManager sm = new ShapeManager();
        Circle c1 = new Circle(2);
        Rectangle r1= new Rectangle(2,3);

        sm.add(c1);
        sm.add(r1);

        sm.display();
    }
}
