package OOPChapterNine;

import OOPChapterNine.questions.commissionEmployee.CommissionBaseEmployee;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommissionBaseEmployeeTest {

    @Test
    public void testThatGrossSaleCanNotBeInvalidAmount(){
        CommissionBaseEmployee commissionBaseEmployee = new CommissionBaseEmployee("Babatunde", "Olaleye", "123456789", 1.0, 10_000);
        assertThrows(IllegalArgumentException.class, ()-> commissionBaseEmployee.setGrossSale(-20020));
    }

    @Test
    public void testThatCommisionEmployeCanCalculateEarning(){
        CommissionBaseEmployee commissionBaseEmployee = new CommissionBaseEmployee("Babatunde", "Olaleye", "123456789", 1.0, 10_000);
        assertEquals(10_000.00, commissionBaseEmployee.earning());
    }



}