package EVoter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class InecTest {

    private Inec inec = new Inec();
    @Test
    public void Test_That_Voters_Can_Register(){
        Voter voter1 = inec.voterRegistration(18, "Babatunde",  "12345678");
        Voter voter2 = inec.voterRegistration(19, "Theezy",  "12345678");
        assertEquals(2, inec.getnumberOfRegisteration());
    }

    @Test
    public void Test_That_Candidates_Can_Register(){
        Candidate candidate1 = inec.candidateRegistration( "Tinubu");
        assertEquals(1, inec.getNumberOfCandidateRegisterated());
        Candidate candidate2 = inec.candidateRegistration("Peter Obi");
        assertEquals(2, inec.getNumberOfCandidateRegisterated());
    }

    @Test
    public void Test_That_Error_Is_Thrown_When_Voter_Is_Not_Found(){
        Voter voter1 = inec.voterRegistration(25, "Babatunde",  "12345678");
        assertThrows(IllegalArgumentException.class, ()-> inec.findVoterAccount("NGv5"));
    }

    @Test
    public void Test_That_Error_Is_Thrown_When_Candidate_Is_Not_Found(){
        Candidate candidate1 = inec.candidateRegistration("Atiku");
        assertThrows(IllegalArgumentException.class, ()-> inec.findCandidateAccount("NGc2"));
    }

    @Test
    public void Test_That_Voters_Can_cast_Vote(){
        Candidate candidate = inec.candidateRegistration("Peter Obi");
        Voter vote = inec.voterRegistration(18, "Babatunde",  "12345678");
        inec.castVote("NGc1");
        Voter vote2 = inec.voterRegistration(55, "Theezy",  "12345678");
        inec.castVote("NGc1");
        assertEquals(2, candidate.getCountCandidateVote());
    }

    @Test
    public void TestThatVoterCantVoteTwice(){
        Candidate candidate = inec.candidateRegistration("Peter Obi");
        Voter vote = inec.voterRegistration(18, "Babatunde",  "12345678");
        inec.castVote("NGc1");
        inec.castVote("NGc1");


    }
}
