import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class CalculatorTest {

    @Test
    public void testAdd() {
        int res = Calculator.add(4, 4);
//        if (res!=8){
//            fail("Expected 8, but has "+res);
//        }
        assertEquals(8, res);
    }

    @Test
    public void testDiv() {
        int res = Calculator.div(10, 2);
        assertEquals(5, res);
    }
@Test(expected = ArithmeticException.class)//можно закидывать сюда вместо try-catch
    public void testDivOnZero() {
//        try {
//            int res = Calculator.div(10, 0);
//            fail("Expected ArithmeticException but not take");
//        }
//        catch (ArithmeticException ex){
//        }
        Calculator.div(10, 0);
    }

    @Test
    public void testAsserts(){
        double a=0.1;
        a+=0.1;
        a+=0.1;
//        assertEquals(0.3,a);
        assertEquals(0.3,a,0.1);

        ArrayList<Integer> list=new ArrayList<>();
        assertEquals(true, list.isEmpty());
        assertTrue(list.isEmpty());
        list.add(21);
        list.add(22);
        list.add(31);
        Integer[] arr=list.toArray(new Integer [0]);

        Integer[] test={21,22,31};
        assertArrayEquals(test,arr);
    }

//    @Test
//    public void testMulti() {
//    }
//
//    @Test
//    public void testDiff() {
//    }
}