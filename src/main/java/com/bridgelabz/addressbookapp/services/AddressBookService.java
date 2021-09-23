package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//Service Autowire in controller
@Service
public class AddressBookService implements IAddressBookService{
    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> dataList=new ArrayList<>();
        dataList.add(new AddressBookData(1, new AddressBookDTO("Bhupendra","Govind Colony","Amla","MP","wadekar.bhupendra6@gmail.com","460551","9893902047")));
        return dataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int Id) {
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(1, new AddressBookDTO("Bhupendra","Govind Colony","Amla","MP","wadekar.bhupendra6@gmail.com","460551","9893902047"));
        return addressBookData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(1,addressBookDTO);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(1,addressBookDTO);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int Id) {

    }
}
