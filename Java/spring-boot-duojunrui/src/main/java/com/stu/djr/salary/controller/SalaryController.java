package com.stu.djr.salary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.along.entity.DbSalary;
import com.stu.djr.salary.service.SalaryService;

@Controller
public class SalaryController {
	
	@Autowired
	private SalaryService salarySrevice;
	
	/**
	 * 查询工资列表
	 */
	
	@ResponseBody
	@RequestMapping(value = "listSalary", method = RequestMethod.GET)
	public String listSalary() {
		
		System.out.println("----------------listSalary--begin");
		List<DbSalary> salaryList = this.salarySrevice.listSalary();
		System.out.println("----------------Salary");
		System.out.println(JSON.toJSONString(salaryList.get(0)));
		System.out.println("----------------salaryList");
		System.out.println(JSON.toJSONString(salaryList));
		System.out.println("----------------listSalary--end");
		return JSON.toJSONString(salaryList);
	}
	
	/**
	 * 添加工资
	 */
	@ResponseBody
	@RequestMapping(value = "insertSalary",method=RequestMethod.POST)
	public String insertSalary(@RequestBody DbSalary salary)
	{
		//TODO
		System.out.println("添加工资：");
		System.out.println(JSON.toJSONString(salary));
		return "成功添加"+this.salarySrevice.insertSalary(salary)+"条工资。";
	}
	
	/**
	 * 修改工资信息;根据ID改绩效工资
	 */
	@ResponseBody
	@RequestMapping(value = "updateSalary",method=RequestMethod.POST)
	public String updateSalary(@RequestBody DbSalary salary)
	{
		//TODO
		System.out.println("修改绩效工资：");
		System.out.println(JSON.toJSONString(salary));
		return "成功修改"+this.salarySrevice.updateDepartment(salary)+"条工资信息。";
	}
	
	/**
	 * 删除工资信息
	 */
	@ResponseBody
	@RequestMapping(value = "deleteSalary",method=RequestMethod.DELETE)
	public String deleteSalary(@RequestBody DbSalary salary)
	{
		//TODO
		System.out.println("删除工资信息。");
		System.out.println(JSON.toJSONString(salary));
		return "成功删除"+this.salarySrevice.deleteDepartment(salary)+"个部门";
	}



}
