package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "contact_book")
public class AddressBookData {
    /**
     * @Entity- Annotation tells hybernate to create a table
     * @Table-specifies the mapped Table in DB
     * @Id-specify the Primary Key And Id genration is set to auto
     * @Column-specifiyes name of column
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contact_id")
    private int id;


    public String fullName;
    public String address;
    public String city;
    public String state;
    public String emailId;
    public String zip;
    public String phoneNumber;

    public AddressBookData() {}

    public AddressBookData(AddressBookDTO addressBookDTO){
        this.updateAddressBookData(addressBookDTO);
    }

    public AddressBookData(int id, AddressBookDTO addressBookDTO) {
    }




    public void updateAddressBookData(AddressBookDTO addressBookDTO) {
        this.fullName=addressBookDTO.fullName;
        this.address=addressBookDTO.address;
        this.city=addressBookDTO.city;
        this.state=addressBookDTO.state;
        this.emailId=addressBookDTO.emailId;
        this.zip=addressBookDTO.zip;
        this.phoneNumber=addressBookDTO.phoneNumber;
    }
}
