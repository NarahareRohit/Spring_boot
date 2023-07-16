package com.app.service;

import java.util.List;

import com.app.dto.AuthDTO;
import com.app.pojos.Employee;

public interface EmployeeService {
	List<Employee> getAllEmpList();

	Employee addEmp1(Employee e);

	Employee getEmpDetail(Long id) ;

	void deleteEmpDetail(Employee emp);

	Employee updateEmpDetails(Employee emp);

	Employee validate(AuthDTO req);
}
