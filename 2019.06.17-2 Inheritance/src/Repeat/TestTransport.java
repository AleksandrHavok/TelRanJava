package Repeat;

public class TestTransport {
    public static void main (String[] args){

        Transport t1 = new Transport("12413","NoName","Anonimus",2003);
        System.out.println(t1.transportInfo());
        Transport t2 = new Transport("13512335","Russian Crazy","Love Machine",1966);
        System.out.println(t2.transportInfo());
        System.out.println("-----------------");

        Car c1 = new Car("1251","Mini Cooper", "Mini", 2010,false);
        System.out.println(c1.transportInfo());
        Car c2 = new Car("1515","A6","Audi",2007,true);
        System.out.println(c2.transportInfo());
        System.out.println("-----------------");

        Truck tr1 = new Truck("2222","Dakar","Kamaz",1998,15155);
        System.out.println(tr1.transportInfo());
        Truck tr2 = new Truck ("333333333","MAN", "MAN",1995,12580);
        System.out.println(tr2.transportInfo());
        System.out.println("------------------");

        Bike b1 = new Bike("125", "Rocx Tour", "Pride",2019,"Touring");
        System.out.println(b1.transportInfo());
        Bike b2 = new Bike("521","Weekender Nomad","Cannondale",2018,"Gravel");
        System.out.println(b2.transportInfo());
    }
}
