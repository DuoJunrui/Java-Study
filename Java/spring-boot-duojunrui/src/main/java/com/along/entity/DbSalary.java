package com.along.entity;

public class DbSalary {
	
	//工资表ID
	private String id;
	
	//基础工资
	private float basic_wage;
	
	//岗位工资
	private float post_wage;
	
	//绩效工资
	private float merit_pay;
	
	//奖惩
	private float rewards;
	
	//时间
	private long date;
	
	//备注
	private String remarks;
	
	//员工ID
	private String staffID;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getBasic_wage() {
		return basic_wage;
	}

	public void setBasic_wage(float basic_wage) {
		this.basic_wage = basic_wage;
	}

	public float getPost_wage() {
		return post_wage;
	}

	public void setPost_wage(float post_wage) {
		this.post_wage = post_wage;
	}

	public float getMerit_pay() {
		return merit_pay;
	}

	public void setMerit_pay(float merit_pay) {
		this.merit_pay = merit_pay;
	}

	public float getRewards() {
		return rewards;
	}

	public void setRewards(float rewards) {
		this.rewards = rewards;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getStaffID() {
		return staffID;
	}

	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}
	
	
	
	

}
