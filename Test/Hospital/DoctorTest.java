package Hospital;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class DoctorTest {

    Doctor doctor = new Doctor("Babatunde Olaleye", "09036011444");

    @Test
    public void TestThatDoctorNameCantBeBlank(){
        assertThrows(IllegalArgumentException.class, ()-> doctor.setFullName("   "));
    }
    @Test
    public void TestThatDoctorNameThrowAnExceptionForInvalidInput(){
        assertThrows(IllegalArgumentException.class, ()-> doctor.setFullName("tuwetfwe3243"));
    }
    @Test
    public void TestThatErrorIsThrownWhenPhoneNumberLengthIsNotEqualsToEleven(){
        assertThrows(IllegalArgumentException.class, ()-> doctor.setContactDetails("090360114"));
    }

    @Test
    public void TestThatErrorIsThrownWhenPhoneNumberIsEmpty(){
        assertThrows(IllegalArgumentException.class, ()-> doctor.setContactDetails("     "));
    }
}
