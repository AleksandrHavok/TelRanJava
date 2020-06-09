package Repeat;

public class Company {
    private Person[] arr;
    private int count;

    public Company(){
        arr= new Person[10];
    }

    public boolean add(Person p){
        if (p==null){
            return false;
        }
        if (count==arr.length){
            Person[] tmp = new Person [arr.length*2];
            for(int i=0;i<count;i++){
                tmp[i]=arr[i];
            }
            arr=tmp;
        }
        arr[count++]=p;
        return true;
    }

    //не реализован, ибо Person абстрактный и инстацнироваться от него нельзя
    public boolean remove(int id){
        // Person tmp = new Person(id,"",-123);// получим ошибку компиляции
        return true;
    }

    public int size(){
        return count;
    }

    public void printReport(){
        double sum=0;
        for (int i=0;i<count;i++){
            sum += arr[i].calcSalary();
            System.out.println(arr[i].toString());
        }
        System.out.println("---------------");
        System.out.println("Summary salary = " + sum);
    }
}
