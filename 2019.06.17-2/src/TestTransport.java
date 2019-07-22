public class TestTransport {
    public static void main(String[] args) {
        Transport t1 = new Transport("10413", "China", "NoName", 2019);
        System.out.println(t1.transportInfo());
        Transport t2 = new Transport("104131", "Russian Crazy", "Love Machine", 1996);
        System.out.println(t2.transportInfo());
        System.out.println("______________");
        Car c1 = new Car("1111", "X5", "BMW", 2010, true);
        System.out.println(c1.transportInfo());
        Car c2 = new Car("11111", "SLK500", "Mercedes", 2010, false);
        System.out.println(c2.transportInfo());
        System.out.println("______________");
        Truck tr1=new Truck("2222","Dakar","Kamaz",1997,15000);
        System.out.println(tr1.transportInfo());
        Truck tr2=new Truck("22221","URAL","URAL",1980,18000);
        System.out.println(tr2.transportInfo());
        System.out.println("______________");
        Bike b1=new Bike("3333","Dexperado X","Suzuki",1997,"Cruiser");
        System.out.println(b1.transportInfo());
        Bike b2=new Bike("33331","CB400","Honda",1995,"Classic");
        System.out.println(b2.transportInfo());


    }
}
