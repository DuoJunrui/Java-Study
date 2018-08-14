package com.stu.djr.staff.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.along.entity.DbStaff;

public interface IDbStaffMapper {
	List<DbStaff> listStaffByAge(@Param("age")Integer age);
	List<DbStaff> listStaff(@Param("start")Integer start,@Param("count")Integer count);
	int getStaffCount();
	int addStaff(@Param("st")DbStaff staff);
	int updateStaff(DbStaff staff);
	int updateStaffBatch(@Param("staffList")List<DbStaff> staffList,@Param("newDepartmentID")String newDepartmentID);
	int deleteStaff(DbStaff staff);
	int deleteStaffByName(@Param("staffName")String staffName123);

}
