package com.stu.djr.department.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.along.entity.DbDepartment;
import com.common.djr.UUIDUtil;
import com.stu.djr.department.mapper.IDbDepartmentMapper;

@Service
public class DepartmentService {
	
	@Autowired
	private IDbDepartmentMapper departmentMapper;

	/**
	 * 查询所有部门
	 * 
	 * @return
	 */
	public List<DbDepartment> listDepartment() {
		// TODO
		return this.departmentMapper.listDepartment();
	}

	/**
	 * 添加部门
	 */
	@Transactional
	public int insertDepartment(DbDepartment department) {
		// TODO
		// 新增记录
		department.setId(UUIDUtil.createUUID());
		department.setDepartment_name(department.getDepartment_name());
		department.setRemarks(department.getRemarks());
	
		return this.departmentMapper.insertDepartment(department);
	}

	/**
	 * 修改部门信息
	 * 
	 */
	@Transactional
	public int updateDepartment(DbDepartment department) {
		// TODO
	
		if (department.getId() == null) {
			return 0;
		}
		return this.departmentMapper.updateDepartment(department);
	}

	/**
	 * 删除部门
	 */
	@Transactional
	public int deleteDepartment(DbDepartment department) {
		// TODO
		if (department.getId() == null) {
			return 0;
		}
		return this.departmentMapper.deleteDepartment(department);
	}


}
