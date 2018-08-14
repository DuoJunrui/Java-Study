package com.mybatis.entity;

public class DBStaff {
	
	//员工ID
	private String id;
	
	//员工姓名
	private String name;
	
	//员工性别
	private String sex;
	
	//员工年龄
	private int age;
	
	//员工所在部门ID
	private String departmentID;
	
	//部门对象
	private DBDepartment department;
	

	public DBDepartment getDepartment() {
		return department;
	}

	public void setDepartment(DBDepartment department) {
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}
	
}
