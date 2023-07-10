package com.app.service;

import java.util.List;

import com.app.dto.AddressDto;
import com.app.pojos.Address;

public interface AddressService {
	List<Address> allAddress();
	Address addAddress(AddressDto address);
}
