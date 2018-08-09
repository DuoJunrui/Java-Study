package jdbc.study;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author 多俊睿
 * @date 2018年8月5日 上午0:02:53 
 * 
 * @note 使用Statement对象
		使用范围：当执行相似SQL(结构相同，具体值不同)语句的次数比较少
		优点：语法简单
		缺点：采用硬编码效率低，安全性较差。
		原理：硬编码，每次执行时相似SQL都会进行编译  
 */

public class JDBC {

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
			// 创建声明
			Statement stat = conn.createStatement();
			String sql = null;
				
			String id = UUIDUtil.createUUID();
			String department_name = "财务部";
			String remarks = "管理公司财务";

			sql = "INSERT INTO db_department VALUES ('" + id + "','" + department_name + "','" + remarks + "');";
				
			System.out.println("成功插入" + stat.executeUpdate(sql) + "条记录。");

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
			//创建声明
			Statement stat = conn.createStatement();
			String sql = null;
			String id = "1d94cb4950454b1b87e3f0cc654ae5e7";
			
			//根据唯一ID删除人事部
			sql = "DELETE FROM db_department WHERE id='" + id + "';";
			System.out.println("成功删除" + stat.executeUpdate(sql) + "条记录。");
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
			//创建声明
			Statement stat = conn.createStatement();
			String sql = null;
			String id = "d211e039a24147b1a51e311d1e089b82";
			String remarks = "设计手游角色以及手游策划";
			
			//修改手游部门的职责备注
			sql = "UPDATE db_department SET remarks = '" + remarks + "' WHERE id = '" + id + "';";
			System.out.println("成功修改" + stat.executeUpdate(sql) + "条记录。");
			
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
			// 创建声明
			Statement stmt = conn.createStatement();
			String sql = null;
			ResultSet rs = null;

			// 查询所有部门信息
			sql = "SELECT d.`department_name` as dn, d.`remarks` rm FROM db_department d";

			// 查询指定部门（开发部）信息
			// sql = "SELECT d.`department_name` as dn, d.`remarks` rm FROM db_department d
			// WHERE d.department_name='开发部';";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String department_name = rs.getString("dn");
				String remarks = rs.getString("rm");
				System.out.println("部门名称：" + department_name + "， 职责备注：" + remarks);

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}
}
