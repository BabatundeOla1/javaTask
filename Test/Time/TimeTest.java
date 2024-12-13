package Time;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class TimeTest {

    private Time time = new Time();
    @Test
    public void Test_That_Hour_Can_Not_Be_Negative(){
        int hour = -11;
        int minute = 20;
        int second = 59;
        assertThrows(IllegalArgumentException.class, ()-> time.setTime(hour, minute, second));
    }
    @Test
    public void Test_That_Minute_Can_Not_Be_Negative(){
        int hour = 11;
        int minute = -29;
        int second = 40;
        assertThrows(IllegalArgumentException.class, ()-> time.setTime(hour, minute, second));
    }
    @Test
    public void Test_That_Second_Can_Not_Be_Negative(){
        int hour = 11;
        int minute = 29;
        int second = -40;
        assertThrows(IllegalArgumentException.class, ()-> time.setTime(hour, minute, second));
    }
}
