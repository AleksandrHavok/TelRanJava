package Repeat;

public class SalaryEmployee extends Person {
    private double salary;

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public SalaryEmployee(int id,int age, String name, double salary){
        super(id,age,name);//обращаемся к классу-родителю и создаем в конструкторе
        //класса Person экземпляр, затем возвращаем его в текущий класс и добавляем отсутствующие поля
        this.salary=salary;
    }

    //аннотации есть в процессе написания кода, они затираются компилятором
    @Override//переопределяем метод из класса родителя Person за счет обращения к нему
    //через super.toString(), создаем строку, возвращаем ее обратно и добавляем параметр
    //класса SalaryEmployee
    public String toString(){
        return super.toString()+" "+ salary;
    }
}
