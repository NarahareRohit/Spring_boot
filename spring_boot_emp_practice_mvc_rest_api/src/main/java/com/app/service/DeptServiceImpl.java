package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.DeptDao;
import com.app.pojos.Department;

@Service
@Transactional
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	private DeptDao deptdao;

	@Override
	public List<Department> getAllDept() {
		return deptdao.findAll();
	}

}
