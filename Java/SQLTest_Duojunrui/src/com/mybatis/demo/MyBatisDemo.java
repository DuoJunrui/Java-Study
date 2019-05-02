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
	@Test
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
			
			/*
			//4、根据姓名、性别、年龄添加至少15个员工（员工需要有男有女、年龄分布18-60岁）(4分)
			DBStaff staffInsert = new DBStaff();
			staffInsert.setId(UUIDUtil.createUUID());
			staffInsert.setName("白云");
			staffInsert.setSex("女");
			staffInsert.setAge(42);
			staffInsert.setDepartmentID("70acc4bfb2c14c0da14d50c0d0e4eb87");
			System.out.println("成功添加" + staffMapper.insertStaff(staffInsert)+"个员工信息。");
			*/
			
			/*
			//5、根据员工ID修改名字、性别、年龄 (3分)
			DBStaff staffUpdate = new DBStaff();
			staffUpdate.setId("030cfea6cd20464e956a48b01e16c6ad");
			staffUpdate.setName("海草");
			staffUpdate.setSex("女");
			staffUpdate.setAge(29);
			System.out.println("成功修改" + staffMapper.updateStaff(staffUpdate) + "个员工信息。");
			*/
			
			/*
			//6、根据员工ID、部门名称修改员工的部门 (3分)
			DBStaff updateStaffbyDepaerment = new DBStaff();
			updateStaffbyDepaerment.setId("09ed99cbfcbb416b86f107372e8181a9");
			updateStaffbyDepaerment.setDepartment("");
			updateStaffbyDepaerment.setDepartmentID("f01474fc8243438cb98e422799bc9ef0");;
			System.out.println("成功修改" + staffMapper.updateStaffbyDepaerment(updateStaffbyDepaerment) + "个员工信息。");
			*/
			
			
			//7、根据员工ID删除员工 (3分)
			DBStaff staffDelete = new DBStaff();
			staffDelete.setId("3615700cd145409bb01e16c6c386e21b");
			System.out.println("成功删除" + staffMapper.deleteStaff(staffDelete) + "个员工信息。");
			
			
			/*
			//8、根据指定年龄段查询统计该年龄段的员工人数 (4分)
			List<DBStaff> staffByAgeList = staffMapper.listStaffByAge(10);
			staffByAgeList.forEach((staffItem)->{
				System.out.println("名字="+staffItem.getName()+",性别="+staffItem.getSex()+",年龄="+staffItem.getAge()+",所属部门="+staffItem.getDepartment().getDepartment_name());
			});
			*/
			
			
			//如果有增、删、改、操作,需要手动提交事务才能更新到数据库
			session.commit();
			
			
			/*
			//查询所有员工信息
			List<DBStaff> staffList = staffMapper.listStaff();
			staffList.forEach(
					
					(staffItem)->{
						System.out.println("员工姓名：" +staffItem.getName()+ "，性别：" + staffItem.getSex()+
								"，年龄："+staffItem.getAge());
					}
				);
			*/	
				
				
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//关闭SqlSesseion
			session.close();
		}
	}
	
	
	//部门表处理
	//@Test
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
			
			/*
			//1、根据部门名称、部门备注添加至少3个部门 (3分)
			DBDepartment departmentInsert = new DBDepartment();
			departmentInsert.setId(UUIDUtil.createUUID());
			departmentInsert.setDepartment_name("修理部");
			departmentInsert.setRemarks("电脑及手机维修");
			System.out.println("成功添加" + dm.insertDepartment(departmentInsert)+ "个部门信息。");
			*/
			
			/*
			//2、根据部门名称修改部门备注 (3分)
			DBDepartment departmentUpdate = new DBDepartment();
			departmentUpdate.setDepartment_name("外联部");
			departmentUpdate.setRemarks("拉赞助，对外联谊");
			System.out.println("成功修改" + dm.updateDepartment(departmentUpdate) + "个部门信息。");
			*/
			

			//3、删除部门（删除时需要判断该部门没有员工才可删除）(3分)
			DBDepartment departmentDelete = new DBDepartment();
			departmentDelete.setDepartment_name("娱乐部");
			System.out.println("成功删除" + dm.deleteDepartment(departmentDelete) + "个部门信息。");
			
			
			//如果有增、删、改、操作,需要手动提交事务才能更新到数据库
			session.commit();
			
			/*
			//查询所有部门信息
			List<DBDepartment> departmentList = dm.listDepartment();
			departmentList.forEach(
					
					(departmentItem)->{
						System.out.println("部门名称：" +departmentItem.getDepartment_name()+ "，职责备注：" + departmentItem.getRemarks());
					}
				);
			*/
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//关闭SqlSesseion
			session.close();
		}
	}	

}
