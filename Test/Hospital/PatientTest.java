package Hospital;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertThrows;

public class PatientTest {

    @Test
    public void TestThatPatientContactInfoIsNotLessThanEleven() throws ParseException {
        Date dob = new SimpleDateFormat("dd-MM-yyyy").parse("25-12-1990");
        Patient patient = new Patient("Babatunde Olaleye", "TUN0001", dob, "09036011444");
        assertThrows(IllegalArgumentException.class, ()-> patient.setContactDetails("0903601144"));
    }
    @Test
    public void TestThatPatientFullNameCaNNotBeBlank() throws ParseException {
        Date dob = new SimpleDateFormat("dd-MM-yyyy").parse("25-12-1990");
        Patient patient = new Patient("Babatunde Olaleye", "TUN0001", dob, "09036011444");
        assertThrows(IllegalArgumentException.class, ()-> patient.setFullName(" "));
    }
    @Test
    public void TestThatPatientFullNameContainsOnlyAlphabets() throws ParseException {
        Date dob = new SimpleDateFormat("dd-MM-yyyy").parse("25-12-1990");
        Patient patient = new Patient("Babatunde Olaleye", "TUN0001", dob, "09036011444");
        assertThrows(IllegalArgumentException.class, ()-> patient.setFullName("12jhfdjg&*23"));
    }
}
