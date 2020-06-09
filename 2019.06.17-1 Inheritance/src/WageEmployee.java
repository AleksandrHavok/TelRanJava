public class WageEmployee extends Person {
    private int hours;
    private double price;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public WageEmployee() {
        super(0,0,"NoName");
    }

    public WageEmployee( int id, int age,String name) {
        super(id,age,name);
    }

    public WageEmployee( int id, int age,String name, int hours, double price) {
        super(id,age,name);
        this.hours = hours;
        this.price = price;
    }

    @Override//аннотации есть в процессе написания кода, они затираются компилятором
    public String toString() {
        return super.toString()+" " +hours+" "+price;
    }
}
