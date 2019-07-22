import java.util.Arrays;
import java.util.Comparator;

public class TestSort {

    public static void main(String[] args) {
        Person[] arr=new Person[10];
        arr[0]=new Person(1,"David",23);
        arr[1]=new Person(2,"Anna",26);
        arr[2]=new Person(3,"Aleksandr",25);
        PersonAgeComparator pac=new PersonAgeComparator();
        PersonIDComparator pic=new PersonIDComparator();
        PersonNameComparator pnc=new PersonNameComparator();
        //если мы вызываем сортировки подряд, то будет стакаться сортировка
        sort(arr,pac);//сравнение по возрасту
        for(Person p:arr){
            System.out.println(p);
        }
        sort(arr,pic);//сравнение по id
        for(Person p:arr){
            System.out.println(p);
        }
        sort(arr,pnc);//сравнение по name
        for(Person p:arr){
            System.out.println(p);
        }

        //Arrays.sort(arr); падает с NPE
        Arrays.sort(arr,0,3);
        for (Person p:arr){
            System.out.println(p);
        }
        System.out.println("--------------------");
        //Arrays.sort(arr,new PersonAgeComparator()); падает с NPE
        Arrays.sort(arr,0,3,new PersonAgeComparator());
        for (Person p:arr){
            System.out.println(p);
        }
    }

//    public static void sort(Person[] arr){
    public static void sort(Person[] arr, Comparator<Person> comp){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1;j++){
//                if(arr[j].getAge()>arr[j+1].getAge()){
                //Делаем универсальный код, чтобы избавиться от привязки по методам.
                // Чтобы избавиться от кучи методов sort мы пишем кучу методов компараторов для разных полей
                if (arr[j]==null||arr[j+1]==null){
                    continue;
                }
                if(comp.compare(arr[j],arr[j+1])>0){
                    Person tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
}
