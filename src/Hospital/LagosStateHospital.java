package Hospital;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LagosStateHospital {

    private static Reception lagosStateHospitalReception= new Reception();
    public static void main(String[] args) {
        MainMenu();
    }

    private static void MainMenu(){
        String mainMain = """
                        ==============================
                        Welcome to Lagos State Hopital
                        ==============================
                        1 -> Register Patient
                        2 -> Register Doctor
                        3 -> Login
                        4 -> Registered Patients                       
                        ==============================
                            Select an Option:
                        ==============================
                """;

        char userInput = input(mainMain).charAt(0);

        switch (userInput){
            case '1' -> registerPatient();
            case '2' -> registerDoctorr();
            case '3' -> login();
            case '4' -> checkRegisteredPatient();
            default -> existApp();
        }
    }
    private static void registerPatient(){
        try{
            String fullName = input("Enter Patient's full Name: ");
            Date DOB = inputDate("Enter Patient's DOB(dd-MM-yyyy).: ");
            String contactDetails = input("Enter Patient's Phone Number: ");
            Patient newPatient = lagosStateHospitalReception.registerPatients(fullName, DOB, contactDetails);
     }
        catch(IllegalArgumentException error){
            display(error.getMessage());
            MainMenu();
        }
        MainMenu();
    }

    private static void registerDoctorr() {
        try{
            String fullName = input("Enter Doctor's full Name: ");
            String contactDetails = input("Enter Phone NUmber: ");
            Doctor newDoctor = lagosStateHospitalReception.registerDoctor(fullName,contactDetails);
        }
        catch(IllegalArgumentException error){
            display(error.getMessage());
            MainMenu();
        }
        MainMenu();
    }

    private static void login(){
        String login = """
                        ========================================
                            Lagos State Hopital Login
                        ========================================
                        1 -> Book Appointment With A Specialist
                        2 -> Doctor Login
                        3 -> Main Menu                      
                        =========================================
                            Select an Option:
                        ========================================
                """;
        char userInput = input(login).charAt(0);

        switch (userInput){
            case '1' -> scheduleAppointment();
            case '2' -> doctorLogin();
            case '3' -> MainMenu();
        }
    }

    private static void checkRegisteredPatient() {
        lagosStateHospitalReception.displayRegisteredPatients();
    }
    private static void existApp() {
        display("Thank You!!");
    }

    private static void scheduleAppointment() {
        try{
            lagosStateHospitalReception.displayAvailableDoctors();
            String patientName = input("Enter Patient Name: ");
            String doctorName = input("Enter Doctors name: ");
            String natureOfSickness = input("How Are you feeling? ");
            Date appointmentDate = inputDate("Enter Appointment Date (dd-MM-yyyy): ");
            Appointment booking = lagosStateHospitalReception.bookAppointment(patientName, doctorName, appointmentDate, natureOfSickness);
            display("You have an Appointment with " + booking.getDoctor() + " on " + booking.getAppointmentDate());
        }
        catch(IllegalArgumentException error){
            display(error.getMessage());
            MainMenu();
        }
        login();
    }

    private static void doctorLogin() {
        String login = """
                        ========================================
                            Lagos State Hopital Doctor Login
                        ========================================
                        1 -> Check Available Appointments
                        2 -> Log in                  
                        =========================================
                            Select an Option:
                        ========================================
                """;
        char userInput = input(login).charAt(0);

        switch (userInput){
            case '1' -> availableAppointment();
            case '2' -> login();
        }
    }

    private static void availableAppointment() {
        lagosStateHospitalReception.displayAppointment();
        doctorLogin();
    }
    private static Date inputDate(String message) {
        while (true) {
            try {
                String dateInput = input(message);
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                return dateFormat.parse(dateInput);
            } catch (Exception e) {
                display("Invalid date format. Please try again (dd-MM-yyyy).");
            }
        }

    }

    private static String input(String message){
        display(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void display(String message){
        System.out.println(message);
    }
}
