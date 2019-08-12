import org.junit.Test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

import static org.junit.Assert.*;

/*
todo
Make unit tests for methods in ArrayList<String> (you can use other methods in ArrayList)
1. Tests for method String remove(int index);
2. Tests for method boolean add(String e);
3. Tests for method void add(int index, String element);
 */
public class TestArrayList {
    private static ArrayList<String> namesList = new ArrayList<>();
    private String name = "Vasya ";
    private String anotherName = "Petya ";
    private String thirdName="Anna";



    @Test
    public void testAdd() {

            for (int i = 0; i < 5; i++) {
                namesList.add(name + i);
            }
            String[] testArray = {
                    name + 0,
                    name + 1,
                    name + 2,
                    name + 3,
                    name + 4};
            assertEqualsTest(testArray);
    }

    @Test
    public void testAddByIndex() {
        for (int i = 1; i < 5; i++) {
            namesList.add(i, anotherName + i);
        }

    }

    @Test
    public void testRemoveByIndex() {
//        testAddByIndex();
        for (int i = 0; i < 3; i++) {
            namesList.remove(1);
        }
        namesList.remove(5);

//        String[] testArray = {
//                name + 0,
//                anotherName+4,
//                name + 1,
//                name + 2,
//                name + 3,
//                thirdName,
//                thirdName
//        };
//        assertEqualsTest(testArray);
    }

    @Test(expected = ConcurrentModificationException.class)
    public void testRemoveByName(){
        namesList.add(thirdName);
        namesList.add(thirdName);
        namesList.add(thirdName);
        for (String str:namesList) {
            if (str.equals(thirdName)) {
                namesList.remove(str);
            }
        }
    }

    private void assertEqualsTest(String[] testArray) {
        String[] arr = namesList.toArray(new String[0]);
        assertArrayEquals(testArray, arr);
    }
}
