package com.along.interceptor.configure;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.along.interceptor.LoginInterceptor;

@Configuration
public class InterceptorConfigure extends WebMvcConfigurationSupport{
	@Autowired
	private LoginInterceptor loginInterceptor;

	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		//List<String> addPathList = null;
		List<String> excludePathList = null;
		// 登录拦截器
		InterceptorRegistration login = registry
				.addInterceptor(this.loginInterceptor);
		// 设置拦截的路径
		login.addPathPatterns("/*/*");
		// 设置例外的路径
		excludePathList = new ArrayList<>();
		excludePathList.add("/user/login");
		excludePathList.add("/user/addUser");
		excludePathList.add("/static/*");
		login.excludePathPatterns(excludePathList);
	
		super.addInterceptors(registry);
	}
}
