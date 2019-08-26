import org.junit.Before;
import org.junit.Test;

public class TestManager {
    Manager manager;

    @Before
    public void setUp() throws Exception{
        manager=new Manager();
    }

//    @Test(expected = IllegalNameException.class)
    //Можно поставить проверку на любой рантайм, но это некореектно, т.к. обычно в тестах проверяют на конкретные исключения
    @Test(expected = RuntimeException.class)
    public void testAddForNull(){
        manager.add(null);
    }
}
