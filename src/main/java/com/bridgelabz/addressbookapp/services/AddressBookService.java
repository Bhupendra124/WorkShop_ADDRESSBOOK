package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exception.AddressbookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.respository.AddressBookRespository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//Service Autowire in controller
@Service
@Slf4j
public class AddressBookService implements IAddressBookService{


    @Autowired
    private AddressBookRespository addressBookRespository;

   // private List<AddressBookData>  addressBookDataList=new ArrayList<>();



    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookRespository.findAll();
    }

    @Override
    public AddressBookData getAddressBookDataById(int id) {

        return (AddressBookData) addressBookRespository
                .findById(id)
                .orElseThrow(() -> new AddressbookException("Contact With Contact id :"+id+" does not exists...!!"));
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(addressBookDTO);
        //log.debug{"Contact Data "+addressBookData.toString());

        return addressBookRespository.save(addressBookData);
    }

    @Override
    public AddressBookData updateAddressBookData(int id,AddressBookDTO addressBookDTO) {
      AddressBookData addressBookData=this.getAddressBookDataById(id);
        addressBookData.updateAddressBookData(addressBookDTO);
        return addressBookRespository.save(addressBookData);
    }

    @Override
    public void deleteAddressBookData(int id) {
       AddressBookData addressBookData=this.getAddressBookDataById(id);
       addressBookRespository.delete(addressBookData);

    }




    public List<AddressBookData> getAddressBookDataByCity(String city) {
        return addressBookRespository.getAddressBookDataByCity(city);
    }


}
