package Repeat;

public class WageEmployee extends Person{
    private int hours;
    private double price;

    public int getHours(){
        return hours;
    }

    public void setHours(int hours){
        this.hours=hours;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public WageEmployee(){//описываем конструктор по-умолчанию
        super(0,0,"NoName");//задаем дефолтные значения ддя всех WageEmployee,
        // создаваемых без указания параметров
    }

    //добавляем новый параметризированный конструктор по полям только класса Person
    public WageEmployee(int id,int age,String name){
        super(id,age,name);
    }
    //делаем перегрузку конструкторов - добавляем конструктор с таким же именем,
    // но другими входными параметрами
    public WageEmployee(int id,int age,String name,int hours,double price){
        super(id,age,name);
        this.hours=hours;
        this.price=price;
    }
    //аннотации есть в процессе написания кода, они затираются компилятором
    @Override//переопределяем метод из класса родителя Person за счет обращения к нему
    //через super.toString(), создаем строку, возвращаем ее обратно и добавляем параметр
    //класса WageEmployee
    public String toString(){
        return super.toString()+ " "+ hours + " "+ price;
    }
}
