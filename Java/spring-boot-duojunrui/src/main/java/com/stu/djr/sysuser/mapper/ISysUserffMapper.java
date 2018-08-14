package com.stu.djr.sysuser.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.along.entity.SysUser;

public interface ISysUserffMapper {
	List<SysUser> listUser(@Param("start")Integer start,@Param("count")Integer count);
	int getUserCount();
	int addUser(SysUser user);
	int updateUser(SysUser user);
	int deleteUser(SysUser user);
	int loginByUserNameAndPassword(SysUser user);

}
