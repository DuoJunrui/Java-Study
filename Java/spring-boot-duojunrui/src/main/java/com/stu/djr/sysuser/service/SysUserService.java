package com.stu.djr.sysuser.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.along.entity.SysUser;
import com.common.djr.UUIDUtil;
import com.stu.djr.sysuser.mapper.ISysUserffMapper;

@Service
public class SysUserService {
	@Autowired
	private ISysUserffMapper userffMapper; 
	
	public List<SysUser> listUser(Integer start,Integer count)
	{
		//TODO
		return this.userffMapper.listUser(start, count);
	}
	public int getUserCount()
	{
		//TODO
		return this.userffMapper.getUserCount();
	}
	public int addUser(SysUser user)
	{
		//TODO
		user.setId(UUIDUtil.createUUID());
		user.setCreatTime(System.currentTimeMillis());
		return this.userffMapper.addUser(user);
	}
	public boolean updateUser(SysUser user)
	{
		//TODO
		return this.userffMapper.updateUser(user)>0;
	}
	public int deleteUser(SysUser user)
	{
		//TODO
		
		return this.userffMapper.deleteUser(user);
	}
	public boolean login(SysUser user)
	{
		//TODO
		return this.userffMapper.loginByUserNameAndPassword(user)>0;
	}

}
