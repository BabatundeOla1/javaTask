import org.junit.Test;
import static org.junit.Assert.*;

public class MyStackTest {

    @Test
    public void TestThatStackIsEmpty(){
        MyStack mySt = new MyStack();
        assertTrue(mySt.Empty());
    }
    @Test
    public void TestThatStackCanTakeInput() {
        MyStack mySt = new MyStack();
        mySt.push("Theezy");
        mySt.push("Ola");
        mySt.push("Olaleye");
        assertEquals(3, mySt.size());
    }

    @Test
    public void TestThatStackCanRemoveElement() {
        MyStack mySt = new MyStack();
        mySt.push("Theezy");
        mySt.push("Ola");
        mySt.push("Babs");
        assertEquals(3, mySt.size());
        mySt.pop();
        assertEquals("Ola", mySt.pop());

    }

}
