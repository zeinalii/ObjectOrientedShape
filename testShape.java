import org.junit.Test;
import static org.junit.Assert.*;

public class testShape {

    @Test
    public void testConcatenate() {
        MyUnit testShape = new testShape();

        String result = testShape.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}
