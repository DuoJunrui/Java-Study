package com.mybatis.mapper;

import java.util.List;

import com.mybatis.entity.DBStaff;

public interface StaffMapper {
	
	
	int insertStaff(DBStaff staff);
	int deleteStaff(DBStaff staff);
	List<DBStaff> listStaff();
	int updateStaff(DBStaff staff);
	int updateStaffbyDepaerment(DBStaff staff);
	List<DBStaff> listStaffByAge(int age);
	
}
