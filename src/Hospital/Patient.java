package Hospital;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Patient {
    private String fullName;
    private Date DOB;
    private String contactDetails;
    private String patientID;

    public Patient(String fullName, String patientID, Date DOB , String contactDetails){
        validateFullName(fullName);
        validateContactDetails(contactDetails);
        this.fullName = fullName;
        this.patientID = patientID;
        this.DOB = DOB;
        this.contactDetails = contactDetails;
    }

    public void setFullName(String fullName) {
        validateFullName(fullName);
        this.fullName = fullName;
    }
    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }


    public void setContactDetails(String contactDetails) {
        validateContactDetails(contactDetails);
        this.contactDetails = contactDetails;
    }
    public String getPatientID() {
        return patientID;
    }

    public String getFullName() {
        return this.fullName;
    }
    public Date getDOB() {
        return this.DOB;
    }
    public String getContactDetails() {
        return this.contactDetails;
    }



    private void validateContactDetails(String contactDetails){
        if(contactDetails.length() != 11){
            throw new IllegalArgumentException("Phone number must be 11 digits.");
        }
        if (contactDetails.isBlank()){
            throw new IllegalArgumentException("Name Can not be Blank");
        }
    }

    private void validateFullName(String fullName){
        if(fullName.matches(".*\\d.*")){
            throw new IllegalArgumentException("Invalid Name");
        }
        if (fullName.isBlank()){
            throw new IllegalArgumentException("Invalid Name");
        }
    }

    private String convertDateToString(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(this.DOB);
    }
}
