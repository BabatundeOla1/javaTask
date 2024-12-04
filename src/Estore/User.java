package Estore;

public class User {
    private String name;
    private int age;
    private String emailAddress;
    private String homeAddress;
    private String password;
    private String phone;

    public User(String name, int age, String emailAddress, String homeAddress, String password, String phone) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.password = password;
        this.phone = phone;
    }
}
