package CompoundInterestCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    Calculator calculate = new Calculator();

    @Test
    public void Test_That_Calculation_Return_Right_Value(){
        assertEquals(1.819, calculate.calculateInterestYear(10, 6, 12), 0.01);
    }

    @Test
    public void Test_That_User_Cant_Input_Negative_Value(){
        assertThrows(IllegalArgumentException.class, ()-> calculate.calculateInterestYear(-10, -6, -12));
    }

    @Test
    public void Test_That_calculate_Investment_Amount_Return_Right_Value(){
        assertEquals(1_819.3967340322902, calculate.calculateInvestmentAmount(1000, 10, 6, 12), 0.001);
    }

    @Test
    public void Test_That_User_Cant_Input_Negative_And_Zero_Values(){
        assertThrows(IllegalArgumentException.class, ()-> calculate.calculateInvestmentAmount(-1000, 10, 6, 12));
    }

    @Test
    public void Test_That_calculate_Monthly_Contribution_Return_Right_Value(){
        assertEquals(32_775.8693612916, calculate.calculateMonthlyContribution(200, 10, 6, 12), 0.001);
    }

    @Test
    public void Test_That_Monthly_Contribution_Cant_Be_Negative_And_Zero_Values(){
        assertThrows(IllegalArgumentException.class, ()-> calculate.calculateMonthlyContribution(-200, 10, 6, 12));
    }


    @Test
    public void Test_That_future_Value_Investment_Return_Right_Value(){
        assertEquals(34_595.266095323896, calculate.futureValueInvestment(1000, 200, 10, 6, 12), 0.001);
    }
}
