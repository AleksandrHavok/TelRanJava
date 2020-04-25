package Repeat;

public class WageEmployee {
    private int id;
    private String name;
    private double hourPrice;
    private int hours;

    public WageEmployee(){

    }
    public WageEmployee(int id, String name, double hourPrice, int hours){
        id=id>0?id:-id;
        this.id=id;
        this.name=name;
        this.hourPrice=hourPrice;
        this.hours=hours;
    }

    void setId(int id){
        id=id>0?id:-id;//проверка на отрицательный id
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
    double calcSalary(){
      return hourPrice*hours;
    }
    int getHours(){
        return hours;
    }

    public void display(){
        System.out.println(id + " name= " + name + " hour price= "+ hourPrice + " hours= " + hours);
    }

}
