package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//Service Autowire in controller
@Service
public class AddressBookService implements IAddressBookService{

    private List<AddressBookData>  addressBookDataList=new ArrayList<>();



    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int id) {

        return addressBookDataList.get(id);
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(addressBookDataList.size()+1,addressBookDTO);
        addressBookDataList.add(addressBookData);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int id,AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData=this.getAddressBookDataById(id);
        addressBookData.setFullName(addressBookDTO.fullName);
        addressBookData.setAddress(addressBookDTO.address);
        addressBookData.setCity(addressBookDTO.city);
        addressBookData.setState(addressBookDTO.state);
        addressBookData.setEmailId(addressBookDTO.emailId);
        addressBookData.setZip(addressBookDTO.zip);
        addressBookData.setPhoneNumber(addressBookDTO.phoneNumber);
        addressBookDataList.set(id-1,addressBookData);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int id) {
        addressBookDataList.remove(id-1);

    }
}
