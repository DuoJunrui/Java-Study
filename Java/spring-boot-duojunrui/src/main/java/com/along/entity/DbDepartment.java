package com.along.entity;

import java.util.List;

public class DbDepartment {
	//部门表ID
	private String id;
	//部门名称
	private String department_name;
	//职责备注
	private String remarks;
	
	private List<DbStaff> staffList; 


	public String getId() {
		return id;
	}
	public void setId(String id) {
		 this.id = id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		 this.department_name = department_name;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		 this.remarks = remarks;
	}
	public List<DbStaff> getStaffList() {
		return staffList;
	}
	public void setStaffList(List<DbStaff> staffList) {
		this.staffList = staffList;
	}

}