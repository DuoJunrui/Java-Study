package jdbc.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author 多俊睿
 * @date 2018年8月5日 上午1:16:50 
 * @note 预编译PreparedStatement
		使用范围：当执行相似sql语句的次数比较多（例如用户登陆，对表频繁操作..）语句一样，只是具体的值不一样，被称为动态SQL
		优点：语句只编译一次，减少编译次数。提高了安全性（阻止了SQL注入）
		缺点: 执行非相似SQL语句时，速度较慢。
		原理：相似SQL只编译一次，减少编译次数
 */

public class JDBCPrepared {
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost/jdbc_study?useSSL=FALSE&serverTimezone=UTC"; // 数据库连接地址
		String user = "root"; // 用户名
		String password = "123456"; // 密码
		String driver = "com.mysql.cj.jdbc.Driver"; // 驱动名称
		
		Class.forName(driver); // 加载驱动类

		return DriverManager.getConnection(url, user, password);

	}
	
	// JDBC增加（插入） INSERT
		//@Test
		public void jdbcInsert() throws ClassNotFoundException, SQLException {
				
			Connection conn;
			conn = this.getConnection();

			try {
				
				String sql = null;
				
				String id = ""+UUIDUtil.createUUID();
				String name = "暴风雨";
				String sex = "男";
				int age = 25;
				String departmentID = "财务部";

				sql = "INSERT INTO db_staff VALUES (?,?,?,?,(SELECT id FROM db_department WHERE department_name= ? ));";
				
				//创建预编译声明
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, id);
				ps.setString(2, name);
				ps.setString(3, sex);
				ps.setInt(4, age);
				ps.setString(5, departmentID);
				
				System.out.println("成功插入" + ps.executeUpdate() + "条记录。");

			} catch (SQLException e) {
					
				e.printStackTrace();
				// TODO: handle exception
			} finally {
					
				conn.close();
			}

		}
		
		//JDBC删除 DELETE
		//@Test
		public void jdbcDelete() throws ClassNotFoundException, SQLException {
			Connection conn;
			conn = this.getConnection();
			try {
				
				String sql = null;
				String name = "小红";
				
				//根据姓名删除员工信息
				sql = "DELETE FROM db_staff WHERE name= ? ;";
				
				//创建预编译声明
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, name);
				
				System.out.println("成功删除" + ps.executeUpdate() + "条记录。");
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				conn.close();
			}
			
		}
		
		//JDBC修改、更新 UPDATE
		//@Test
		public void jdbcUpdate() throws ClassNotFoundException, SQLException {
			Connection conn;
			conn = this.getConnection();
			try {
				
				String sql = null;
				String name = "多俊睿";
				String departmentID = "运维部";
				
				//根据员工姓名修改员工部门
				sql = "UPDATE db_staff SET departmentID = (SELECT id FROM db_department WHERE department_name= ? ) WHERE name = ? ;";
				
				//创建预编译声明
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, departmentID);
				ps.setString(2, name);
				
				System.out.println("成功修改" + ps.executeUpdate() + "条记录。");
				
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				conn.close();
			}
		}
		
		
		// JDBC查询 SELECT
		@Test
		public void jdbcSelect() throws ClassNotFoundException, SQLException {
			Connection conn;
			conn = this.getConnection();
			try {
				
				String sql = null;
				
				// 查询所有员工信息
				sql = "select `name`, sex, age, department_name from db_staff FULL join db_department on departmentID = db_department.id ;";
				
				//创建预编译声明
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					
					String name = rs.getString("name");
					String sex = rs.getString("sex");
					int age = rs.getInt("age");
					String department_name = rs.getString("department_name");
					
					System.out.println("员工姓名：" + name + "， 员工性别：" + sex + "，员工年龄：" + age + "，员工部门：" + department_name );

				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				conn.close();
			}
		}

}
