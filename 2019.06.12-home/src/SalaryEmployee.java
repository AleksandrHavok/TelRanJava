public class SalaryEmployee {
    private int id = 0;
    private String name = "NoName";
    private double salary = 0;

    SalaryEmployee() {
    }

    SalaryEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void setId(int id) {
        id=id>0? id:-id;
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

    double calcSalary(){
        return salary;
    }

    public void display() {
        System.out.println(name+" id= "+id+ " salary= "+salary);
    }
}
