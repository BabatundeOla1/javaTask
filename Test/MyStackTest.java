import org.junit.Test;
import static org.junit.Assert.*;

public class MyStackTest {

    @Test
    public void TestThatStackIsEmpty(){
        MyStack mySt = new MyStack();
        assertTrue(mySt.isEmpty());
    }

    @Test
    public void TestThatStackCanTakeInput(){
        MyStack mySt = new MyStack();
        mySt.push("Theezy");
        mySt.push("Babatunde");
        mySt.push("Olaleye");
        assertEquals(3, mySt.size());

    }
}
