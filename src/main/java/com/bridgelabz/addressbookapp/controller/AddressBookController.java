package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")

/**
 * url--get--readdata
 * Get---localhost:8082/addressbook/get
 * return--Get Call Sucess
 */
public class AddressBookController {
    @RequestMapping(value = {"" ,"/","/get"})
    public ResponseEntity<String> getAddressBookData(){
        return new ResponseEntity<String>("Get Call Sucess", HttpStatus.OK);
    }

    /**
     * Get-localhost:8082/addressbook/get/1
     * @param id
     * @return-=read/get data by id
     */

    @GetMapping("/get/{Id}")
    public ResponseEntity<String> getAddressBookDataById(@PathVariable("Id") int id){
        return new ResponseEntity<String>("Get call success for id",HttpStatus.OK);
    }

    /**
     * add data
     * Post--localhost:8082/addressbook/create
     * @param addressBookDTO
     * @return---add data sucessfully
     */

    @PostMapping("/create")
    public ResponseEntity<String> addAddresBookData(
            @RequestBody AddressBookDTO addressBookDTO){
        return  new ResponseEntity<String>("add data sucessfully",HttpStatus.OK);
    }

    /**
     * update
     *Put- localhost:8082/addressbook/update/1
     * @param id
     * @param addressBookDTO
     * @return---Succesfully updated
     */

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateAddresBookData(@PathVariable("id") int id,
                                                       @RequestBody AddressBookDTO addressBookDTO){
        return  new ResponseEntity<String>("Succesfully updated",HttpStatus.OK);
    }

    /**
     * Delete-localhost:8082/addressbook/delete/1
     * @param id
     * @return Sucessfully deleted data
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAddressBookData(@PathVariable("id") int id){
        return  new ResponseEntity<String >("Sucessfully deleted data",HttpStatus.OK);
    }
}