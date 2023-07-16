package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.EmployeeDao;
import com.app.dto.AuthDTO;
import com.app.pojos.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao empDao;

	@Override
	public List<Employee> getAllEmpList() {
		return empDao.findAll();
	}

	@Override
	public Employee addEmp1(Employee e) {
		return empDao.save(e);
	}

	@Override
	public Employee getEmpDetail(Long id) {
		return empDao.findById(id).orElseThrow(null);
	}

	@Override
	public void deleteEmpDetail(Employee emp) {
		empDao.delete(emp);
	}

	@Override
	public Employee updateEmpDetails(Employee emp) {
		return empDao.save(emp);
	}

	@Override
	public Employee validate(AuthDTO req) {
		return empDao.findByEmailAndPassword(req.getEmail(),req.getPassword());
	} 

}
