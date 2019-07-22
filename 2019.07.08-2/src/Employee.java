public class Employee {
    private String name;
    private Salary salary;

    public Employee(String name, int hours, double price) {
        this.name = name;
        salary = new Salary();
        salary.hours = hours;
        salary.price = price;
        salary.tax=0.15;
    }

    public void printReport() {
        System.out.println(salary.calcBrutto());
        System.out.println(salary.calcNetto());
    }

    private class Salary {//вложенный класс, не статический. 10%-нестатик 90%-статики. Нужны для сокрытия реализации
        private int hours;
        private double price;
        private double tax;

        private double calcBrutto() {
            return hours * price;
        }

        private double calcNetto() {
            return calcBrutto() - calcBrutto() * tax;
        }
    }
}
