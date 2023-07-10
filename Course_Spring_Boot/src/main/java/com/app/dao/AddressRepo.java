package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.dto.AddressDto;
import com.app.pojos.Address;

public interface AddressRepo extends JpaRepository<Address, Long>{

	AddressDto save(AddressDto aa);

}
