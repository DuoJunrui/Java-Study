package com.stu.djr.sysuser.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.along.entity.SysUser;
import com.stu.djr.sysuser.service.SysUserService;

@Controller
@RequestMapping(value="user")
public class SysUserController {
	@Autowired
	SysUserService userService;
	
	/**
	 * 用户列表
	 */
	@ResponseBody
	@RequestMapping(value = "listUser", method = RequestMethod.GET)
	public String listUser(Integer start,Integer count,HttpServletRequest request, HttpServletResponse response) {
		List<SysUser> list = this.userService.listUser(start, count);
		return JSON.toJSONString(list);
	}
	/**
	 * 修改用户密码
	 */
	@ResponseBody
	@RequestMapping(value = "updateUserPassword", method = RequestMethod.POST)
	public String updateUserPassword(@RequestBody SysUser user,HttpServletRequest request, HttpServletResponse response) {
		Map<String ,String> reslut = new HashMap<>();
		if(this.userService.updateUser(user))
		{
			reslut.put("msg", "密码已经修改为"+user.getNewPassword());
		}else {
			reslut.put("msg", "密码修改失败");
		}
		return JSON.toJSONString(reslut);
	}
	
	
	
	/**
	 * 添加用户
	 */
	@ResponseBody
	@RequestMapping(value = "addUser", method = RequestMethod.POST)
	public String addUser(@RequestBody SysUser user,HttpServletRequest request, HttpServletResponse response) {
		int count = this.userService.addUser(user);
		Map<String ,String> reslut = new HashMap<>();
		reslut.put("msg", "成功添加"+count+"个用户");
		return JSON.toJSONString(reslut);
	}
	
	/**
	 * 用户登陆
	 */
	@ResponseBody
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@RequestBody SysUser user,HttpServletRequest request, HttpServletResponse response) {
		boolean succeed = this.userService.login(user);
		Map<String ,String> reslut = new HashMap<>();
		if(succeed)
		{
			reslut.put("msg", "登陆成功");
			HttpSession session = request.getSession();
			session.setAttribute("isLogin", true);
			//从数据库获取用户信息放到session
			//TODO
			session.setAttribute("user", user);
		}else {
			reslut.put("msg", "登陆失败");
		}
		return JSON.toJSONString(reslut);
	}
	
	
	

}
