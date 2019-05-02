package com.mybatis.demo;

import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import com.mybatis.common.UUIDUtil;
import com.mybatis.entity.DBDepartment;
import com.mybatis.entity.DBStaff;
import com.mybatis.mapper.DepartmentMapper;
import com.mybatis.mapper.StaffMapper;

public class MyBatisDemo {
	
	//员工表处理
	//@Test
	public void initStaff() {
		
		SqlSession session = null;
		
		try {
			//加载MyBatis配置文件
			String  resource ="resources/mybatis_config.xml";
			
			InputStream is = Resources.getResourceAsStream(resource);
			
			//构建SqlSession的工厂
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
			
			//创建能执行映射文件中的SQL的SqlSesseion
			session = sessionFactory.openSession();
			
			StaffMapper staffMapper = session.getMapper(StaffMapper.class);
			
			//增加（插入）员工信息
			DBStaff staffInsert = new DBStaff();
			staffInsert.setId(UUIDUtil.createUUID());
			staffInsert.setName("橘子");
			staffInsert.setSex("女");
			staffInsert.setAge(26);
			staffInsert.setDepartmentID("f9caca3284704687ac3aa7fa3313be5e");
			System.out.println("成功添加" + staffMapper.insertStaff(staffInsert)+"个员工信息。");
			
			//根据员工姓名删除员工信息
			DBStaff staffDelete = new DBStaff();
			staffDelete.setName("小东");
			System.out.println("成功删除" + staffMapper.deleteStaff(staffDelete) + "个员工信息。");
			
			//根据员工ID修改员工姓名
			DBStaff staffUpdate = new DBStaff();
			staffUpdate.setId("d7ca61b023274f029ea3017dec63a58e");
			staffUpdate.setName("火影忍者");
			System.out.println("成功修改" + staffMapper.updateStaff(staffUpdate) + "个员工信息。");
			
			//如果有增、删、改、操作,需要手动提交事务才能更新到数据库
			session.commit();
			
			//查询所有员工信息
			List<DBStaff> staffList = staffMapper.listStaff();
			staffList.forEach(
					
					(staffItem)->{
						System.out.println("员工姓名：" +staffItem.getName()+ "，性别：" + staffItem.getSex()+
								"，年龄："+staffItem.getAge());
					}
				);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//关闭SqlSesseion
			session.close();
		}
	}
	
	
	//部门表处理
	@Test
	public void initDepartment() {
		
		SqlSession session = null;
		
		try {
			//加载MyBatis配置文件
			String  resource ="resources/mybatis_config.xml";
			
			InputStream is = Resources.getResourceAsStream(resource);
			
			//构建SqlSession的工厂
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
			
			//创建能执行映射文件中的SQL的SqlSesseion
			session = sessionFactory.openSession();
			
			DepartmentMapper dm = session.getMapper(DepartmentMapper.class);
			
			//增加（插入）部门信息
			DBDepartment departmentInsert = new DBDepartment();
			departmentInsert.setId(UUIDUtil.createUUID());
			departmentInsert.setDepartment_name("修理部");
			departmentInsert.setRemarks("电脑及手机维修");
			System.out.println("成功添加" + dm.insertDepartment(departmentInsert)+ "个部门信息。");
			
			//根据部门名称删除部门信息
			DBDepartment departmentDelete = new DBDepartment();
			departmentDelete.setDepartment_name("运维部二部");
			System.out.println("成功删除" + dm.deleteDepartment(departmentDelete) + "个部门信息。");
			
			//根据部门ID修改部门姓名
			DBDepartment departmentUpdate = new DBDepartment();
			departmentUpdate.setId("d211e039a24147b1a51e311d1e089b82");
			departmentUpdate.setDepartment_name("游戏策划");
			System.out.println("成功修改" + dm.updateDepartment(departmentUpdate) + "个部门信息。");
			
			//如果有增、删、改、操作,需要手动提交事务才能更新到数据库
			session.commit();
			
			//查询所有部门信息
			List<DBDepartment> departmentList = dm.listDepartment();
			departmentList.forEach(
					
					(departmentItem)->{
						System.out.println("部门名称：" +departmentItem.getDepartment_name()+ "，职责备注：" + departmentItem.getRemarks());
					}
				);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//关闭SqlSesseion
			session.close();
		}
	}	

}
