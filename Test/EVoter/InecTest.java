package EVoter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RegistrationTest {

    private Registration register = new Registration();
    @Test
    public void Test_That_Voters_Can_Register(){
        Voter voter1 = register.voterRegistration(18, "Babatunde",  "1111");
        Voter voter2 = register.voterRegistration(19, "Theezy",  "1234");
        assertEquals(2, register.getnumberOfRegisteration());
    }

    @Test
    public void Test_That_Candidates_Can_Register(){
        Candidate candidate1 = register.candidateRegistration( "Tinubu");
        assertEquals(1, register.getNumberOfCandidateRegisterated());
        Candidate candidate2 = register.candidateRegistration("Peter Obi");
        assertEquals(2, register.getNumberOfCandidateRegisterated());
    }

    @Test
    public void Test_That_Error_Is_Thrown_When_Voter_Is_Not_Found(){
        Voter voter1 = register.voterRegistration(25, "Babatunde",  "1111");
        assertThrows(IllegalArgumentException.class, ()-> register.findVoterAccount("NGv5"));
    }

    @Test
    public void Test_That_Error_Is_Thrown_When_Candidate_Is_Not_Found(){
        Candidate candidate1 = register.candidateRegistration("Atiku");
        assertThrows(IllegalArgumentException.class, ()-> register.findCandidateAccount("NGc2"));
    }

    @Test
    public void Test_That_Candidate_Can_Check_Result(){
        Candidate candidate = register.candidateRegistration("Peter Obi");
        Voter voter1 = register.voterRegistration(18, "Babatunde",  "1111");
        Voter voter2 = register.voterRegistration(55, "Theezy",  "1234");
        Voter voter3 = register.voterRegistration(55, "Theezy",  "1234");
        voter1.castVote("NGv1", "1111", "NGc1");
        voter2.castVote("NGv2", "1234", "NGc1");
        voter3.castVote("NGv3", "1234", "NGc1");
        System.out.println("Vote count for Peter Obi: " + candidate.displayResult());
        assertEquals(3, candidate.displayResult());
    }

}
