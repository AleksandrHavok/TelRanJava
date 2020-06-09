package Repeat;

public class Student {
    private String name = "Anon";
    private int age = 18;
    private String phone = "8 800 555 35 35";

    Student(){
        System.out.println("constructor");
    }

    Student(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public void display() {
        System.out.println(name + " " + age + " " + phone);
    }
}
