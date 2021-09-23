package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class AddressBookData {
    private int id;
    public String fullName;
    public String address;
    public String city;
    public String state;
    public String emailId;
    public String zip;
    public String phoneNumber;

    public AddressBookData() {
    }

    public AddressBookData(int id , AddressBookDTO addressBookDTO) {
        this.id=id;
        this.fullName=addressBookDTO.fullName;
        this.address=addressBookDTO.address;
        this.city=addressBookDTO.city;
        this.state=addressBookDTO.state;
        this.emailId=addressBookDTO.emailId;
        this.zip=addressBookDTO.zip;
        this.phoneNumber=addressBookDTO.phoneNumber;


    }


}
