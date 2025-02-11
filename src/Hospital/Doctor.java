package Hospital;
public class Doctor {

    private String fullName;
    private String contactDetails;

    public Doctor(String fullName, String contactDetails) {
        validateFullName(fullName);
        validateContactDetails(contactDetails);
        this.fullName = fullName;
        this.contactDetails = contactDetails;
    }

    public void setFullName(String fullName) {
        validateFullName(fullName);
        this.fullName = fullName;
    }

    public void setContactDetails(String contactDetails) {
        validateContactDetails(contactDetails);
        this.contactDetails = contactDetails;
    }
    public String getFullName() {
        return fullName;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    private void validateContactDetails(String contactDetails){
        if(contactDetails.length() != 11){
            throw new IllegalArgumentException("Phone number must be 11 digits.");
        }
    }

    private void validateFullName(String fullName){
        if(fullName.matches(".*\\d.*")){
            throw new IllegalArgumentException("Invalid Name");
        }
        if (fullName.isBlank()){
            throw new IllegalArgumentException("Name Can not be Blank");
        }
    }

}
