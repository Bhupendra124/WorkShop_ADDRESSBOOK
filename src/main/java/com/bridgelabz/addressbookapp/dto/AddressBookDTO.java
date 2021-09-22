package com.bridgelabz.addressbookapp.dto;

public class AddressBookDTO {

    public String firstName;
    public String address;
    public String city;
    public String state;
    public String emailId;
    public String zip;
    public String phoneNumber;

    public AddressBookDTO(String firstName, String address, String city, String state, String emailId, String zip, String phoneNumber) {
        this.firstName = firstName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.emailId = emailId;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }
}