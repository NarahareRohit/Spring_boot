package com.app.service;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeService {
	List<Employee> getAllEmpList();
	Employee validEmp(String email,String pw);
	List<Employee> getEmpByDeptId(long id);
}
