package com.bridgelabz.addressbookapp.respository;

import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AddressBookRespository extends JpaRepository<AddressBookData, String> {

    @Query(value = "select * from address_db.contact_book where city =:city", nativeQuery = true)
    List<AddressBookData> getAddressBookDataByCity(String city);
   // public List<AddressBookData> listItemsWithPriceOver(@Param("amount") float amount);
   // AddressBookData getAddressBookDataByCity(String city);

  

    Optional<Object> findById(int id);
}
