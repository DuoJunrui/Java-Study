package com.mybatis.mapper;

import java.util.List;
import com.mybatis.entity.DBDepartment;

public interface DepartmentMapper {
	
	int insertDepartment(DBDepartment department);
	int deleteDepartment(DBDepartment department);
	List<DBDepartment> listDepartment();
	int updateDepartment(DBDepartment department);

}