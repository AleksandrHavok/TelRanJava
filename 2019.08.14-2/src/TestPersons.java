import com.sun.source.tree.WhileLoopTree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestPersons {
    public static void main(String[] args) throws IOException {
//        ArrayList<Person> list = new ArrayList<>();
//        list.add(new Person("Vasya",23,"055555555"));
//        list.add(new Person("Petya",32,"0356467"));
//        list.add(new Person("Sofa",27,"88005553535"));
//        save(list, "persons.csv");

        List<Person> list=load("persons.csv");
        for(Person p:list){
            System.out.println(p);
        }
    }

    public static void save(List<Person> list,String fileName) throws IOException {
        FileWriter fw =new FileWriter(fileName);
        BufferedWriter bw=new BufferedWriter(fw);
        for(Person p:list){
            String str=p.toString();
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }

    public static List<Person> load(String fileName) throws IOException {
        ArrayList<Person> list=new ArrayList<>();
        FileReader fr=new FileReader(fileName);
        BufferedReader br=new BufferedReader(fr);
        String line;
        while ((line=br.readLine())!=null){
            String[]arr=line.split(",");
            int age=Integer.parseInt(arr[1]);
            list.add(new Person(arr[0],age,arr[2]));
        }
        return list;
    }
}
