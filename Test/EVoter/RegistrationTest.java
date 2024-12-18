package EVoter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RegistrationTest {

    private Registration registerUser = new Registration();
    @Test
    public void Test_That_user_Can_Register(){
        Voter voters = registerUser.userRegistration(18, "Babatunde", 'M', "1111");
        assertEquals(1, registerUser.getnumberOfRegisteration());
    }
    @Test
    public void Test_That_Candidate_Can_Register(){
        Candidate candidates = registerUser.candidateRegister("1111", "B1345batunde", 'M');
        assertEquals(1, registerUser.getNumberOfCandidateRegisterated());
    }

    @Test
    public void Test_That_Error_Is_Thrown_When_Voter_Is_Not_Found(){
        Voter voters = registerUser.userRegistration(25, "Babatunde", 'M', "1111");

    }
}
