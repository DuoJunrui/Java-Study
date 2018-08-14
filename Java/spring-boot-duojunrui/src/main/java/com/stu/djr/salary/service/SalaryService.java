package com.stu.djr.salary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.along.entity.DbSalary;
import com.stu.djr.salary.mapper.IDbSalaryMapper;

@Service
public class SalaryService {
	
	@Autowired
	private IDbSalaryMapper salaryMapper;
	

	public List<DbSalary> listSalary() {
		// TODO Auto-generated method stub
		return this.salaryMapper.listSalary();
	}

	
	public int insertSalary(DbSalary salary) {
		// TODO Auto-generated method stub
		return this.salaryMapper.insertSalary(salary);
	}


	public int updateDepartment(DbSalary salary) {
		// TODO Auto-generated method stub
		return this.salaryMapper.updateSalary(salary);
	}


	public int deleteDepartment(DbSalary salary) {
		// TODO Auto-generated method stub
		return this.salaryMapper.deleteSalary(salary);
	}

}
