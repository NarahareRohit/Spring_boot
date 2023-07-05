package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.app.dao.EmployeeDao;
import com.app.pojos.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao empDao;
	
	@Override
	public List<Employee> getAllEmpList() {
		// TODO Auto-generated method stub
		return empDao.findAll();
	}

	@Override
	public Employee validEmp(String email, String pw) {
		return empDao.findByEmailAndPassword(email, pw);
	}

	@Override
	public List<Employee> getEmpByDeptId(long id) {
		return empDao.findByAssignedDeptId(id);
	}

}
