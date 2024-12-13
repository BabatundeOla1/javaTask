package MyPersonalInterBankApp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Account1Test {

    private Account1 account = new Account1("Babatunde", "9036011444", "1234");
    @Test
    public void Test_That_Account_Can_Deposit5k(){
        account.deposit(5000);
        assertEquals(5000, account.getBalance());
    }

    @Test
    public void Test_That_Account_can_Deposit_10kAnd_withdraw_5k(){
        account.deposit(10_000);
        assertEquals(10_000, account.getBalance());
        account.withdraw(2500, "1234");
        assertEquals(7500, account.getBalance());
    }

    @Test
    public void Test_That_you_cant_deposit_less_than_one(){
        account.deposit(-5000);
        assertThrows(IllegalArgumentException.class, ()-> account.deposit(-5000));
    }


}
