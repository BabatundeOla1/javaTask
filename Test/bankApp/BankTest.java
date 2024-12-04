package bankApp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BankTest {
    @Test
    public void Test_that_account_can_created(){
        Bank gtBank = new Bank();
        Account account = gtBank.createAccount("Babatunde", "1234");
        assertEquals(1, gtBank.getNumberOfAccounts());
    }

    @Test
    public void Test_that_account_can_deposit_after_it_has_been_created(){
        Bank gtBank = new Bank();
        Account account = gtBank.createAccount("Babatunde", "1234");
        assertEquals(1, gtBank.getNumberOfAccounts());
        gtBank.deposit(1000, "1");
        assertEquals(1000, account.getBalance("1234"));
    }
}
