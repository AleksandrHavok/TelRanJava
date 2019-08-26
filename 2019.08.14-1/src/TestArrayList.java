import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;


public class TestArrayList {

//   ArrayList<String> strList =new ArrayList<>();
//   Каждый раз при запуске теста создается новый экземпляр листа, но со статиком мы ловим ошибки, т.к. тесты начинают зависить друг от друга
   static ArrayList<String> strList =new ArrayList<>();
    ArrayList<Integer> intList =new ArrayList<>();

//    public TestArrayList(){
//        System.out.println("Constructor");
//    }

    //аннотация before вызывается перед каждым тестом, была нужна для инициализации с нуля, сейчас можно запустить для экземпляров без статики
    //также есть аннотация after, например для закрытия ресурсов
    @Before
    public void setUp(){
        strList=new ArrayList<>();
    }

    @Test
    public void testAdd() {
//        ArrayList<String> list = new ArrayList<>();
//        assertTrue(list.add("Vasya"));
        assertTrue(strList.add("Vasya"));
//        assertEquals(1, list.size());
        assertEquals(1, strList.size());
    }

    @Test
    public void testAddForNull(){
//        ArrayList<String > list = new ArrayList<>();
//        list.add("Vasya");
        strList.add("Vasya");
//        assertTrue(list.add(null));
        assertTrue(strList.add(null));
//        list.add("Petya");
        strList.add("Petya");
//        assertEquals(3, list.size());
        assertEquals(3, strList.size());
    }

    @Test
    public void testAddForOverCapacity(){
//        ArrayList<Integer> list= new ArrayList<>();
        for (int i=0;i<10;i++){
//            list.add(i);
            intList.add(i);
        }
//        assertTrue(list.add(11));
        assertTrue(intList.add(11));
//        assertEquals(11,list.size());
        assertEquals(11,intList.size());
    }
}
