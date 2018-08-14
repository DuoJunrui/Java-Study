package com.stu.djr.staff.service;

import java.util.List;
import java.util.Random;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.along.entity.DbStaff;
import com.common.djr.UUIDUtil;
import com.stu.djr.staff.mapper.IDbStaffMapper;

@Service
public class StaffService {
	@Autowired
	private IDbStaffMapper staffMapper;

	/**
	 * 查询所有员工;分页
	 * 
	 * @return
	 */
	public List<DbStaff> listStaff(Integer start,Integer count) {
		// TODO
		return this.staffMapper.listStaff(start,count);
	}

	/**
	 * 根据员工年龄查询
	 * 
	 * @param age
	 * @return
	 */
	public List<DbStaff> listStaffByAge(Integer age) {
		// TODO
		return this.staffMapper.listStaffByAge(age);
	}
	/**
	 * 统计员工数量
	 * 
	 * @return
	 */
	public int getStaffCount() {
		// TODO
		return this.staffMapper.getStaffCount();
	}

	/**
	 * 添加员工
	 * 
	 * @param staff
	 * @return
	 */
	@Transactional
	public int addStaff(DbStaff staff) {
		// TODO
		// 新增记录
		staff.setId(UUIDUtil.createUUID());
		staff.setAge((new Random()).nextInt(99) + 1);
		staff.setSex("男".equals(staff.getSex()) ? "男" : "女");
		staff.setDepartmentID("f9caca3284704687ac3aa7fa3313be5e");
		
		
		return this.staffMapper.addStaff(staff);
	}

	/**
	 * 修改员工
	 * 
	 * @param staff
	 * @return
	 */
	@Transactional
	public int updateStaff(DbStaff staff) {
		// TODO
		// 修改记录
		// TODO
		if (staff.getId() == null) {
			return 0;
		}
		return this.staffMapper.updateStaff(staff);
	}

	/**
	 * 删除员工
	 * 
	 * @param staff
	 * @return
	 */
	@Transactional
	public int deleteStaff(DbStaff staff) {
		// TODO
		if (staff.getId() == null) {
			return 0;
		}
		return this.staffMapper.deleteStaff(staff);
	}

}
