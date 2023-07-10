package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.AddressRepo;
import com.app.dao.StudentRespo;
import com.app.dto.AddressDto;
import com.app.pojos.Address;
import com.app.pojos.Student;

@Service
@Transactional
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressRepo repo;
	@Autowired
	private StudentRespo srepo;
	@Autowired
	private ModelMapper mapper;

	@Override
	public List<Address> allAddress() {
		return repo.findAll();
	}

	@Override
	public Address addAddress(AddressDto address) {
		Student s = srepo.findById(address.getId()).orElseThrow();
		Address a = mapper.map(address, Address.class);
		a.setStd(s);
		//AddressDto aa = mapper.map(repo.save(a),AddressDto.class);
		return repo.save(a);
	}

}
