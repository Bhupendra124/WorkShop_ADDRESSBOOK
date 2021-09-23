package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.services.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
/**
 * url--get--readdata
 * Get---localhost:8082/addressbook/get
 * return--Get Call Sucess
 *
 */
public class AddressBookController {
//Dependancy injection
    @Autowired
    private IAddressBookService addressBookService;

    @RequestMapping(value = {"" ,"/","/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData(){
        List<AddressBookData> dataList=null;
        dataList=addressBookService.getAddressBookData();
        ResponseDTO respDTO=new ResponseDTO("Get Call Sucess", dataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    /**
     * Get-localhost:8082/addressbook/get/1
     * @param id
     * @return-=read/get data by id
     */

    @GetMapping("/get/{Id}")
    public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("Id") int id){
        AddressBookData bookData=null;
        bookData=addressBookService.getAddressBookDataById(id);
        ResponseDTO respDTO=new ResponseDTO("Get call For ID Sucess", bookData);
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }

    /**
     * add data
     * Post--localhost:8082/addressbook/create
     * @param addressBookDTO
     * @return---add data sucessfully
     */

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddresBookData(
            @RequestBody AddressBookDTO addressBookDTO){
        AddressBookData bookData=null;
        bookData=addressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO respDTO=new ResponseDTO("Create/add Employee Data Succesfully",bookData);
        return  new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }

    /**
     * update
     *Put- localhost:8082/addressbook/update/1
     * @param id
     * @param addressBookDTO
     * @return---Succesfully updated
     */

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateAddresBookData(@PathVariable("id") int id,
                                                       @RequestBody AddressBookDTO addressBookDTO){
        AddressBookData bookData=null;
        bookData=addressBookService.updateAddressBookData(addressBookDTO);
        ResponseDTO respDTO=new ResponseDTO("Update succesfull ", bookData);

        return  new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }

    /**
     * Delete-localhost:8082/addressbook/delete/1
     * @param id
     * @return {
     *     "message": "deleted succesfully ",
     *     "data": "Deleted id: 1"
     * }
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("id") int id){
        addressBookService.deleteAddressBookData(id);
        ResponseDTO respDTO=new ResponseDTO("deleted succesfully ", "Deleted id: "+id);
        return  new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }
}