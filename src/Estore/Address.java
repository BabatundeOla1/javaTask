package Estore;

public class Address {

    private String cityName;
    private String countryName;
    private int houseNumber;
    private String street;
    private String state;

    public Address(String cityName, String countryName, int houseNumber, String street, String state) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.houseNumber = houseNumber;
        this.street = street;
        this.state = state;
    }
}
