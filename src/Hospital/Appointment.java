package Hospital;

import java.util.Date;

public class Appointment {

    private String doctorName;
    private String patientName;
    private Date appointmentDate;
    private String natureOfSickness;

    public Appointment(String patientName, String doctorName, Date appointmentDate, String natureOfSickness) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;
        this.natureOfSickness = natureOfSickness;
    }

    public String getDoctor() {
        return doctorName;
    }
    public String getPatient() {
        return patientName;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }
    public String getNatureOfSickness() {
        return natureOfSickness;
    }


}
