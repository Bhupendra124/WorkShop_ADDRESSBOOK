package com.bridgelabz.addressbookapp.respository;

import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRespository extends JpaRepository<AddressBookData, Integer> {
}
