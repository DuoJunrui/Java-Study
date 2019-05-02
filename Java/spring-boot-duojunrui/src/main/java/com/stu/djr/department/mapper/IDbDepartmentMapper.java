package com.stu.djr.department.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.along.entity.DbDepartment;

public interface IDbDepartmentMapper {
	
	int insertDepartment(@Param("dp")DbDepartment department);
	int deleteDepartment(DbDepartment department);
	List<DbDepartment> listDepartment();
	int updateDepartment(DbDepartment department);
	List<DbDepartment> listDepartmentByName(@Param("name")String department_name);

}