package server.companies;

public class Address {
    private String street; //Поле может быть null
    private Location town; //Поле может быть null
    public Address(String street, Location town){
        this.street = street;
        this.town = town;
    }
}