package Hospital;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Reception {
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public Patient registerPatients(String fullName, Date DOB, String contactDetails){
        validateContactDetails(contactDetails);
        validateFullName(fullName);
        String patientID = getPatientID(fullName);
        Patient patient = new Patient(fullName, patientID, DOB, contactDetails);
        patients.add(patient);
        display("Registration successful!!" + "\n" + patient.getFullName()  + " Your ID is: " + getPatientID(fullName));
        return patient;
    }

    public Doctor registerDoctor(String fullName, String contactDetails){
        validateContactDetails(contactDetails);
        validateFullName(fullName);
        Doctor doctor = new Doctor(fullName, contactDetails);
        doctors.add(doctor);
        display("Registration successful!!" + "\n" + doctor.getFullName());
        return doctor;
    }

    public Appointment bookAppointment(String patientName, String doctorName, Date appointmentDate, String NatureOfSickness){
        Patient patient = findPatient(patientName);
        Doctor doctor1 = findDoctor(doctorName);
        Appointment appointment = new Appointment(patientName, doctorName, appointmentDate, NatureOfSickness);
        appointments.add(appointment);
        return appointment;
    }

    public Patient findPatient(String patientID){
        for (Patient patient : patients){
            if (patient.getFullName().equals(patientID))
                return patient;
        }
        throw new IllegalArgumentException("Patient Not Found.");
    }

    public Doctor findDoctor(String doctorName){
        for (Doctor doctors : doctors){
            if (doctors.getFullName().equals(doctorName))
                return doctors;
        }
        throw new IllegalArgumentException("Doctor Not Found.");
    }
    public String getPatientID(String userName){
        Random random = new Random();
        String userID = Integer.toString(random.nextInt(1000));
        char firstAlphabet = userName.charAt(0);
        return firstAlphabet + userID;
    }
//    public String getDoctorID(String doctorName){
//        Random random = new Random();
//        String userID = Integer.toString(random.nextInt(100));
//        return "LSH" + userID;
//    }

    public void displayAppointment() {
        if (appointments.isEmpty()){
            display("No Appointments Available");
            return;
        }
        display("List of Appointments Available:");
        display("Patient Names" + "\t"+"\t" + " Appointment Date" + "\t"+"\t" + "Nature Of Sickness");
        for (Appointment appointment : appointments){
            display(appointment.getPatient() +"\t"+"\t" + appointment.getAppointmentDate() + "\t"+"\t" + appointment.getNatureOfSickness());
        }
    }

    public void displayAvailableDoctors() {
        if (doctors.isEmpty()) {
            display("No doctor has been registered.");
            return;
        }
        display("List of Doctors Available:");
        display("Names" + "\t"+"\t" + " Contact Details");
        for (Doctor doctor : doctors) {
            display(doctor.getFullName() + "\t"+"\t" + doctor.getContactDetails() + "\n");
        }
    }

    public void displayRegisteredPatients(){
        if (patients.isEmpty()){
            display("No Patientss Found.");
            return;
        }
        display("List Of Patients");
        for (Patient patient : patients){
            display(patient.getFullName() + "\t"+"\t" + patient.getPatientID() + "\t"+"\t" + patient.getDOB() + "\t"+"\t" + patient.getContactDetails());
        }
    }

    private void display(String message){
        System.out.println(message);
    }

    private void validateContactDetails(String contactDetails){
        boolean isLess = contactDetails.length() < 11;
        boolean isGreater = contactDetails.length() > 11;
        if(isLess){
            throw new IllegalArgumentException("Phone number must be 11 digits.");
        }
        if (isGreater){
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
            throw new IllegalArgumentException("Name Can not be Blank");
        }
    }
}
