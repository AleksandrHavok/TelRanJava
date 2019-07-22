public class WageEmployee {
    private int id=0;
    private String name="NoName";
    private double hourPrice=0;
    private int hours=0;

    WageEmployee() {
    }

    WageEmployee( int id, String name, double hourPrice, int hours) {
        this.id=id;
        this.name=name;
        this.hourPrice=hourPrice;
        this.hours=hours;
    }
    
    void setId(int id){
        this.id=id;
    }
    void setName(String name){
        this.name=name;
    }
    void setHourPrice(double hourPrice){
        this.hourPrice=hourPrice;
    }
    void setHours(int hours){
        this.hours=hours;
    }

    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    double getHourPrice(){
        return hourPrice;
    }
    int getHours(){
        return hours;
    }

    double calcSalary(double hourPrice,int hours){
        return hourPrice*hours;
    }

    public void display() {
        System.out.println(name+ " id= "+ id+ " hour price= "+hourPrice+" hours= "+hours);
    }

}
