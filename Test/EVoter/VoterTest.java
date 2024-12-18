package EVoter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class VoterTest {
    Voter voters = new Voter(18, "userName", 'M', "1", "1111");
    @Test
    public void Test_that_age_can_not_be_below_eighteen(){
        int age = 17;
        assertThrows(IllegalArgumentException.class, ()-> voters.setAge(age));
    }
    @Test
    public void Test_That_VotersName_Contains_Only_Alphabets(){
        String name = "aghdsl1334";
        assertThrows(IllegalArgumentException.class, ()-> voters.setName(name));
    }
    @Test
    public void Test_That_Voter_Throws_Exception_If_Password_length_is_not_greaterThan_Four(){
        assertThrows(IllegalArgumentException.class, ()-> voters.setPassword("123455"));
    }
}
