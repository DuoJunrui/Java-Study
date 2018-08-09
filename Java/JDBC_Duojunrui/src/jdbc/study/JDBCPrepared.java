package jdbc.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author �࿡�
 * @date 2018��8��5�� ����1:16:50 
 * @note Ԥ����PreparedStatement
		ʹ�÷�Χ����ִ������sql���Ĵ����Ƚ϶ࣨ�����û���½���Ա�Ƶ������..�����һ����ֻ�Ǿ����ֵ��һ��������Ϊ��̬SQL
		�ŵ㣺���ֻ����һ�Σ����ٱ������������˰�ȫ�ԣ���ֹ��SQLע�룩
		ȱ��: ִ�з�����SQL���ʱ���ٶȽ�����
		ԭ������SQLֻ����һ�Σ����ٱ������
 */

public class JDBCPrepared {
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost/jdbc_study?useSSL=FALSE&serverTimezone=UTC"; // ���ݿ����ӵ�ַ
		String user = "root"; // �û���
		String password = "123456"; // ����
		String driver = "com.mysql.cj.jdbc.Driver"; // ��������
		
		Class.forName(driver); // ����������

		return DriverManager.getConnection(url, user, password);

	}
	
	// JDBC���ӣ����룩 INSERT
		//@Test
		public void jdbcInsert() throws ClassNotFoundException, SQLException {
				
			Connection conn;
			conn = this.getConnection();

			try {
				
				String sql = null;
				
				String id = ""+UUIDUtil.createUUID();
				String name = "������";
				String sex = "��";
				int age = 25;
				String departmentID = "����";

				sql = "INSERT INTO db_staff VALUES (?,?,?,?,(SELECT id FROM db_department WHERE department_name= ? ));";
				
				//����Ԥ��������
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, id);
				ps.setString(2, name);
				ps.setString(3, sex);
				ps.setInt(4, age);
				ps.setString(5, departmentID);
				
				System.out.println("�ɹ�����" + ps.executeUpdate() + "����¼��");

			} catch (SQLException e) {
					
				e.printStackTrace();
				// TODO: handle exception
			} finally {
					
				conn.close();
			}

		}
		
		//JDBCɾ�� DELETE
		//@Test
		public void jdbcDelete() throws ClassNotFoundException, SQLException {
			Connection conn;
			conn = this.getConnection();
			try {
				
				String sql = null;
				String name = "С��";
				
				//��������ɾ��Ա����Ϣ
				sql = "DELETE FROM db_staff WHERE name= ? ;";
				
				//����Ԥ��������
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, name);
				
				System.out.println("�ɹ�ɾ��" + ps.executeUpdate() + "����¼��");
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				conn.close();
			}
			
		}
		
		//JDBC�޸ġ����� UPDATE
		//@Test
		public void jdbcUpdate() throws ClassNotFoundException, SQLException {
			Connection conn;
			conn = this.getConnection();
			try {
				
				String sql = null;
				String name = "�࿡�";
				String departmentID = "��ά��";
				
				//����Ա�������޸�Ա������
				sql = "UPDATE db_staff SET departmentID = (SELECT id FROM db_department WHERE department_name= ? ) WHERE name = ? ;";
				
				//����Ԥ��������
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, departmentID);
				ps.setString(2, name);
				
				System.out.println("�ɹ��޸�" + ps.executeUpdate() + "����¼��");
				
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				conn.close();
			}
		}
		
		
		// JDBC��ѯ SELECT
		@Test
		public void jdbcSelect() throws ClassNotFoundException, SQLException {
			Connection conn;
			conn = this.getConnection();
			try {
				
				String sql = null;
				
				// ��ѯ����Ա����Ϣ
				sql = "select `name`, sex, age, department_name from db_staff FULL join db_department on departmentID = db_department.id ;";
				
				//����Ԥ��������
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					
					String name = rs.getString("name");
					String sex = rs.getString("sex");
					int age = rs.getInt("age");
					String department_name = rs.getString("department_name");
					
					System.out.println("Ա��������" + name + "�� Ա���Ա�" + sex + "��Ա�����䣺" + age + "��Ա�����ţ�" + department_name );

				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				conn.close();
			}
		}

}
