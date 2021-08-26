import org.junit.Test;
import static org.junit.Assert.*;


public class MyUnit {

    public String concatenate(String one, String two){
        return one + two;
    }
}

public class MyUnitTest {

    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}
