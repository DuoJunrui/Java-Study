package com.stu.djr.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.along.entity.DbDepartment;
import com.stu.djr.department.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentSrevice;
	
	/**
	 * 查询部门列表
	 */
	
	@ResponseBody
	@RequestMapping(value = "listDepartment", method = RequestMethod.GET)
	public String listDepartment() {
		
		System.out.println("----------------listDepartment--begin");
		List<DbDepartment> departmentList = this.departmentSrevice.listDepartment();
		System.out.println("----------------Department");
		System.out.println(JSON.toJSONString(departmentList.get(0)));
		System.out.println("----------------departmentList");
		System.out.println(JSON.toJSONString(departmentList));
		System.out.println("----------------listDepartment--end");
		return JSON.toJSONString(departmentList);
	}
	
	/**
	 * 添加部门
	 */
	@ResponseBody
	@RequestMapping(value = "insertDepartment",method=RequestMethod.POST)
	public String insertDepartment(@RequestBody DbDepartment department)
	{
		//TODO
		System.out.println("添加部门。。。");
		System.out.println(JSON.toJSONString(department));
		return "成功添加"+this.departmentSrevice.insertDepartment(department)+"个部门";
	}
	
	/**
	 * 修改部门信息;根据ID改名字
	 */
	@ResponseBody
	@RequestMapping(value = "updateDepartment",method=RequestMethod.POST)
	public String updateDepartment(@RequestBody DbDepartment department)
	{
		//TODO
		System.out.println("修改部门。。。");
		System.out.println(JSON.toJSONString(department));
		return "成功修改"+this.departmentSrevice.updateDepartment(department)+"个部门";
	}
	
	/**
	 * 删除部门
	 */
	@ResponseBody
	@RequestMapping(value = "deleteDepartment",method=RequestMethod.DELETE)
	public String deleteDepartment(@RequestBody DbDepartment department)
	{
		//TODO
		System.out.println("删除部门。");
		System.out.println(JSON.toJSONString(department));
		return "成功删除"+this.departmentSrevice.deleteDepartment(department)+"个部门";
	}


}
