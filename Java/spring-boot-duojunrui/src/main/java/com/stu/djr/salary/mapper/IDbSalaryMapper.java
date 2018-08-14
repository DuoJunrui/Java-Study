package com.stu.djr.salary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.along.entity.DbSalary;

public interface IDbSalaryMapper {
	
	int insertSalary(@Param("sal")DbSalary salary);
	int deleteSalary(DbSalary salary);
	List<DbSalary> listSalary();
	int updateSalary(DbSalary salary);
	

}
