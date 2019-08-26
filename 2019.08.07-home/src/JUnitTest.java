import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class JUnitTest {
    public void assertList(String [] expectedArray, ArrayList<String> actualList) {
        String [] actualArray = actualList.toArray( new String [0]);
        assertArrayEquals(expectedArray, actualArray);
    }

    public void createList(ArrayList<String> actualList) {
        int count = 0;
        while(count<5) {
            actualList.add("name" + count);
            count++;
        }
    }

    @Test

   public void testAdd() {
        ArrayList<String> list = new ArrayList<>();
        String[] testArray = {"name0", "name1", "name2", "name3", "name4"};
        createList(list);
        assertList(testArray, list);
    }

    @Test
   public void testAddByIndex() {
        ArrayList<String> list = new ArrayList<>();
        String[] testArray = {"name0", "name1", "name5", "name2", "name3",  "name4"};
        createList(list);
        list.add(2, "name5");
        assertList(testArray, list);
    }

    @Test
   public void testRemoveById() {
        ArrayList<String> list = new ArrayList<>();
        String[] testArray = {"name1", "name2", "name3", "name4"};
        createList(list);
        list.remove(0);
        assertList(testArray, list);
    }

//    @Test(expected = AddNullExeption.class)
//    public void testAddByNull() {
//        ArrayList<String> list = new ArrayList<>();
//        list.add(null);
//    }
    @Test
    public void testAddByNull() throws AddNullExeption {
        ArrayList<String> list = new ArrayList<>();
        String test=null;
        try {
            list.add(test);
            fail("Expected AddNullException but not take!");
        }
        catch (AddNullExeption ex){
            new AddNullExeption(test);
        }
    }
}