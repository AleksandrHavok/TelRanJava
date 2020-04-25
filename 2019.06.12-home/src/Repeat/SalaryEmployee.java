package Repeat;

public class SalaryEmployee {
    private int id;
    private String name;
    private double salary;

    public SalaryEmployee() {
    }

    public SalaryEmployee(int id, String name, double salary) {
        id = id > 0 ? id : -id;//проверка на отрицательный id
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void setId(int id) {
        id = id > 0 ? id : -id;
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }


    double calcSalary() {
        return salary;
    }

    public void display() {
        System.out.println(id + " name= " + name + " salary= " + salary);
    }
}

