package com.along.entity;


public class DbStaff {
	//员工表ID
	private String id;
	//员工姓名
	private String name;
	//员工性别
	private String sex;
	//员工年龄
	private int age;
	//员工部门ID
	private String departmentID;
	
	private DbDepartment department;
	//TODO
	private String departmentName;

	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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
	public DbDepartment getDepartment() {
		return department;
	}
	public void setDepartment(DbDepartment department) {
		this.department = department;
	}



}