package CompoundInterestCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    Calculator calculate = new Calculator();

    @Test
    public void TestThatCalculationReturnRightValue(){
        assertEquals(1.819, calculate.calculateInterestYear(10, 6, 12), 0.01);
    }

    @Test
    public void TestThatUserCantInputNegativeValue(){
        assertThrows(IllegalArgumentException.class, ()-> calculate.calculateInterestYear(-10, -6, -12));
    }

    @Test
    public void TestThatCalculateInvestmentAmountReturnRightValue(){
        assertEquals(1_819.3967340322902, calculate.calculateInvestmentAmount(1000, 10, 6, 12), 0.001);
    }

    @Test
    public void TestThatUserCantInputNegativeAndZeroValues(){
        assertThrows(IllegalArgumentException.class, ()-> calculate.calculateInvestmentAmount(-1000, 10, 6, 12));
    }

    @Test
    public void TestThatCalculateMonthlyContributionReturnRightValue(){
        assertEquals(32_775.8693612916, calculate.calculateMonthlyContribution(200, 10, 6, 12), 0.001);
    }

    @Test
    public void TestThatMonthlyContributionCantBeNegativeAndZeroValues(){
        assertThrows(IllegalArgumentException.class, ()-> calculate.calculateMonthlyContribution(-200, 10, 6, 12));
    }


    @Test
    public void TestThatFutureValueInvestmentReturnRightValue(){
        assertEquals(34_595.266095323896, calculate.futureValueInvestment(1000, 200, 10, 6, 12), 0.001);
    }
}
