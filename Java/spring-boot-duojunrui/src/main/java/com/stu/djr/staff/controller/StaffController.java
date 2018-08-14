package com.stu.djr.staff.controller;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.along.entity.DbStaff;
import com.stu.djr.staff.service.StaffService;

@Controller
@RequestMapping(value = "staff")
public class StaffController {

	@Autowired
	private StaffService staffService;

	//@Test
	public void test() {
		DbStaff staff = new DbStaff();
		staff.setAge(55);

		staff.setSex("男");

		System.out.println(JSON.toJSONString(staff));

	}

	//@Test
	public void test2() {
		DbStaff staff = JSON.parseObject("{\"name\":\"张而\"}", DbStaff.class);
		List<DbStaff> list = JSON.parseArray(
				"[{\"name\":\"asd1\"},{\"name\":\"as2d2\"},{\"name\":\"asd3\"},{\"name\":\"asd4\"},{\"name\":\"asd5\"}]",
				DbStaff.class);
		list.forEach((it) -> {
			System.out.println(it.getName());
		});

		// System.out.println(staff.getName()+","+staff.getSex()+","+staff.getAge());

	}

	/**
	 * 员工列表
	 */
	@ResponseBody
	@RequestMapping(value = "listStaff", method = RequestMethod.GET)
	public String listStaff(Integer start,Integer count,HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		
		Boolean isLogin = (Boolean) session.getAttribute("isLogin");
		if(isLogin==null || !isLogin)
		{
			return "请先登陆";
		}
		
		
		if(start==null || start<0)
		{
			start=0;
		}
		if(count==null || count<1)
		{
			count=1;
		}

		DbStaff staff = (DbStaff) session.getAttribute("staff");
		if (staff == null) {
			System.out.println("没有缓存员工信息");
		} else {
			System.out.println("当前缓存的员工是" + JSON.toJSONString(staff));
		}

		System.out.println("----------------listStaff--begin");
		List<DbStaff> staffList = this.staffService.listStaff(start,count);
		System.out.println("----------------Staff");
		System.out.println(JSON.toJSONString(staffList.get(0)));

		session.setAttribute("staff", staffList.get((new Random()).nextInt(staffList.size())));

		System.out.println("----------------staffList");
		System.out.println(JSON.toJSONString(staffList));
		System.out.println("----------------listStaff--end");
		return JSON.toJSONString(staffList);
	}

	/**
	 * 根据年龄查询员工列表
	 */
	@ResponseBody
	@RequestMapping(value = "listStaffByAge", method = RequestMethod.GET)
	public String listStaffByAge(Integer age) {
		System.out.println("----------------listStaffByAge--begin");
		List<DbStaff> staffList = this.staffService.listStaffByAge(age);
		System.out.println("----------------listStaff--end");
		return JSON.toJSONString(staffList);
	}
	
	/**
	 * 统计员工数量
	 */
	@ResponseBody
	@RequestMapping(value = "getStaffCount", method = RequestMethod.GET)
	public String getStaffCount() {
		System.out.println("----------------getStaffCount--begin");
		int taffCount = this.staffService.getStaffCount();
		System.out.println("----------------getStaffCount--end");
		return "{\"taffCount\":"+taffCount+"}";
	}


	/**
	 * 添加员工
	 * 
	 * @param name
	 * @param sex
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "addStaff", method = RequestMethod.POST)
	public String addStaff(@RequestBody DbStaff staff) {
		// TODO
		System.out.println("添加员工。。。123");
		System.out.println(JSON.toJSONString(staff));
		return "成功添加" + this.staffService.addStaff(staff) + "个员工";
	}

	/**
	 * 修改员工;根据ID改名字
	 * 
	 * @param staff
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "updateStaff", method = RequestMethod.POST)
	public String updateStaff(@RequestBody DbStaff staff,HttpServletRequest request) {
		// TODO
		System.out.println("修改员工。。。" + staff.getDepartment().getDepartment_name());
		System.out.println(JSON.toJSONString(staff));

		HttpSession session = request.getSession();

		DbStaff sessionStaff = (DbStaff) session.getAttribute("staff");
		if (sessionStaff == null) {
			System.out.println("修改员工  没有缓存员工信息");
		} else {
			System.out.println("修改员工  当前缓存的员工是" + JSON.toJSONString(sessionStaff));
		}

		return "成功修改"+this.staffService.updateStaff(staff)+"个员工";
	}

	/**
	 * 删除员工
	 * 
	 * @param staff
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "deleteStaff", method = RequestMethod.DELETE)
	public String deleteStaff(@RequestBody List<DbStaff> list) {
		// TODO
		// System.out.println("删除员工。。。");
		// System.out.println(JSON.toJSONString(staff));
		// return "成功删除"+this.staffService.deleteStaff(staff)+"个员工";
		System.out.println(JSON.toJSONString(list, SerializerFeature.WriteMapNullValue));
		return "成功删除";
	}

}
