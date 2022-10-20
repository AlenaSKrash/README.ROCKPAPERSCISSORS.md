package com.sparta.alena;

public class Address {
    private int houseNo = 0;
    private String street = "";
    private String town = "";
    // constructor
    public Address(int houseNo, String street, String town) {
        this.houseNo = houseNo;
        this.street = street;
        this.town = town;
    }
    // getters
    public int getHouseNo() {
        return houseNo;
    }
    public String getStreet() {
        return street;
    }
    public String getTown() {
        return town;
    }

    // toString

}
