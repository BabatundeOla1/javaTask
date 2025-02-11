package EVoter;

import java.util.Scanner;

public class Election {

    private static Inec inec = new Inec();

    public static void main(String[] args) {
        displayMenu();
    }
    public static void displayMenu(){
        String mainMain = """
                        ==============================
                                BIVAS NIGERIA
                        ==============================
                        1 -> Register Voter
                        2 -> Register Candidate
                        3 -> Login
                        4 -> Exit
                        ==============================
                            Select an Option:
                        ==============================
                """;

        display(mainMain);
        String userOption = input("Enter option: ");
        switch (userOption){
            case "1"->
                registerVoter();
            case "2"->
                registerCandidate();
            case "3"->
                login();
            default->
                displayMenu();
        }
    }

    private static void registerVoter(){
        try{
            String name = input("Enter name: ");
            int age = Integer.parseInt(input("Enter age(Age should be 18 and above): "));
            String password = input("Enter password(Password length should be atleast 8): ");
            Voter voters = inec.voterRegistration(age,name,password);
            display("Account created successfully!!" + "\n" + name  + " Your I.D is " + voters.getUserID());
            displayMenu();
        }
        catch(IllegalArgumentException error){
            display(error.getMessage());
            //displayMenu();
        }
    }

    private static void registerCandidate(){
        try{
            String name = input("Enter name: ");
            Candidate candidates = inec.candidateRegistration(name);
            display("Account created successfully!!" +  "\n" + name + " Your I.D is " + candidates.getCandidateID());
            displayMenu();
        }
        catch(IllegalArgumentException error){
            display(error.getMessage());
            displayMenu();
        }
    }

    public static void login(){
        loginMenu();
    }

    public static void loginMenu(){
        String loginMenu = """
                        ==============================
                                BIVAS LOGIN
                        ==============================
                        1 -> Voter Login
                        2 -> Candidate Login
                        3 -> Main Menu
                        ==============================
                            Select an Option:
                        ==============================
                """;
        display(loginMenu);
        String userOption = input("Enter option: ");
        switch (userOption){
            case "1" ->
                voterLogin();
            case "2"->
                candidateLogin();
            case "3"->
                displayMenu();
        }
    }

    private static void candidateLogin() {
        try{
            String candidateID = input("Enter I.D: ");
            Candidate candidate = inec.findCandidateAccount(candidateID);
            if(candidate != null){
                display("Login Successful.");
            }
            else {
                display("Invalid Login details.");
            }
        }catch (IllegalArgumentException error){
            display("Candidate not found. Login failed.");
        }
        candidateMenu();
    }

    private static void voterLogin(){
        try{
            String voterID = input("Enter I.D: ");
            String voterPassword = input("Enter Password: ");
            Voter voter = inec.findVoterAccount(voterID);
            boolean validateVoter = voter != null;
            boolean validateVoterPassword = voter.getPassword().equals(voterPassword);
            if(validateVoter && validateVoterPassword){
                display("Login Successful.");
                voterMenu();
            }
            else {
                display("Invalid Login details.");
            }
        }catch (IllegalArgumentException error){
            display("Voter not found. Login failed.");
            loginMenu();
        }

    }

    public static void voterMenu(){
        String voterMenu = """
                        ==============================
                               BIVAS VOTE MENU
                        ==============================
                        1 -> Cast Vote
                        2 -> Login Menu
                        3 -> Main Menu
                        ==============================
                            Select an Option:
                        ==============================
                """;
        display(voterMenu);
        String voterOption = input("Enter option: ");
        switch (voterOption){
            case "1" ->
                castVote();
            case "2"->
                loginMenu();
            default->
                displayMenu();
        }

    }

    public static void candidateMenu(){
        String candidateMenu = """
                        ==============================
                               BIVAS VOTE MENU
                        ==============================
                        1 -> Check result
                        2 -> Login Menu
                        3 -> Main Menu
                        ==============================
                            Select an Option:
                        ==============================
                """;
        display(candidateMenu);
        String voterOption = input("Enter option: ");
        switch (voterOption){
            case "1" ->
                checkResult();
            case "2"->
                loginMenu();
            default->
                displayMenu();
        }
    }

    private static void checkResult() {
        inec.displayResults();
    }

    private static void castVote() {
//        String votersID = input("Enter Voter's ID: ");
        String candidateID = input("Enter Candidate's ID: ");
        inec.castVote(candidateID);
        display("VOTE CASTED!!!");
        voterMenu();
    }

    private static String input(String message){
        Scanner sc = new Scanner(System.in);
        display(message);
        return sc.nextLine();
    }

    private static void display(String message){
        System.out.println(message);
    }
}