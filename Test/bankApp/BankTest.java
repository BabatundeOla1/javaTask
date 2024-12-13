package bankApp;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest {
    @Test
    public void Test_that_account_can_created(){
        Bank gtBank = new Bank();
        Account account = gtBank.createAccount("Babatunde", "correct pincode");
        assertEquals(1, gtBank.getNumberOfAccounts());
    }
    @Test
    public void Test_that_account_can_deposit_after_it_has_been_created(){
        Bank gtBank = new Bank();
        Account account = gtBank.createAccount("Babatunde", "correct Pincode");
        assertEquals(1, gtBank.getNumberOfAccounts());
        gtBank.deposit(1000, "1");
        assertEquals(1000, account.getBalance("correct Pincode"));
    }
    @Test
    public void Test_that_you_cant_deposit_negative_amount(){
        Bank gtBank = new Bank();
        Account account = gtBank.createAccount("Babatunde", "correct Pincode");
        assertThrows(IllegalArgumentException.class, ()-> gtBank.deposit(-1000, "1"));
    }
    @Test
    public void Test_that_you_can_withdraw_in_Bank(){
        Bank gtBank = new Bank();
        Account account = gtBank.createAccount("Babatunde", "correct Pincode");
        gtBank.deposit(10_000, "1");
        gtBank.withdraw(5_000, "correct Pincode", "1");
        assertEquals(5_000, account.getBalance("correct Pincode"));
    }
    @Test
    public void Test_that_you_cant_withdraw_amount_greater_than_Balance(){
        Bank gtBank = new Bank();
        Account account = gtBank.createAccount("Babatunde", "correct Pincode");
        gtBank.deposit(10_000, "1");
        assertThrows(IllegalArgumentException.class, ()-> gtBank.withdraw(15_000, "correct Pincode", "1"));
    }
    @Test
    public void Test_that_you_can_transfer_to_another_account(){
        Bank gtBank = new Bank();
        Account sendersAccount = gtBank.createAccount("Babatunde", "correct Pincode");

        gtBank.deposit(10_000, "1");
        assertEquals(10_000, sendersAccount.getBalance("correct Pincode"));

        Account recipientAccount = gtBank.createAccount("Theezy", "correct Pin");
        assertEquals(0, recipientAccount.getBalance("correct Pin"));

        gtBank.transfer("1", "2", 5_000, "correct Pincode");
        assertEquals(5_000, sendersAccount.getBalance("correct Pincode"));
        assertEquals(5_000, recipientAccount.getBalance("correct Pin"));
    }
    @Test
    public void Test_that_error_is_thrown_if_recipient_account_is_not_found(){
        Bank gtBank = new Bank();
        Account sendersAccount = gtBank.createAccount("Babatunde", "correct Pincode");

        gtBank.deposit(10_000, "1");
        assertEquals(10_000, sendersAccount.getBalance("correct Pincode"));

        Account recipientAccount = gtBank.createAccount("Theezy", "correct Pin");
        assertEquals(0, recipientAccount.getBalance("correct Pin"));
        assertThrows(IllegalArgumentException.class, ()-> gtBank.transfer("1", "100", 5000, "correct Pincode"));

    }
}
