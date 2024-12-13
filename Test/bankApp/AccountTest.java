package bankApp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AccountTest {
    @Test
    public void Test_that_account_can_deposit_5k_and_balance_is_5k(){
        Account account = new Account("0074945501", "Babatunde", "correct Pincode");
        account.deposit(5_000);
        assertEquals(5_000, account.getBalance("correct Pincode"));
    }

    @Test
    public void Test_that_account_can_deposit_10k_and_withdraw_5k_and_give_5kBalance(){
        Account account = new Account("0074945501", "Babatunde", "correct Pincode");
        account.deposit(10_000);
        account.withdraw(5_000, "correct Pincode");
        assertEquals(5_000, account.getBalance("correct Pincode"));
    }

    @Test
    public void Test_that_you_cant_withdraw_with_wrong_pincode(){
        Account account = new Account("0074945501", "Babatunde", "correct Pincode");
        account.deposit(10_000);
        assertThrows(IllegalArgumentException.class, ()-> account.withdraw(5000,"wrong Pincode"));
    }
    @Test
    public void Test_that_you_can_check_balance_with_pincode(){
        Account account = new Account("0074945501", "Babatunde", "correct Pincode");
        int balance = account.getBalance("correct Pincode");
        assertEquals(balance, account.getBalance("correct Pincode"));
        account.deposit(10_000);
        assertEquals(10_000, account.getBalance("correct Pincode"));
    }

    @Test
    public void Test_that_you_cant_check_balance_with_wrong_pin(){
        Account account = new Account("0074945501", "Babatunde", "correct Pincode");
        assertThrows(IllegalArgumentException.class, ()-> account.getBalance("wrong Pincode"));
    }
}
