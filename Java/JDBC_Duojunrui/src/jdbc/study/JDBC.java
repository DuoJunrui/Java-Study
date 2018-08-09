package jdbc.study;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author �࿡�
 * @date 2018��8��5�� ����0:02:53 
 * 
 * @note ʹ��Statement����
		ʹ�÷�Χ����ִ������SQL(�ṹ��ͬ������ֵ��ͬ)���Ĵ����Ƚ���
		�ŵ㣺�﷨��
		ȱ�㣺����Ӳ����Ч�ʵͣ���ȫ�Խϲ
		ԭ��Ӳ���룬ÿ��ִ��ʱ����SQL������б���  
 */

public class JDBC {

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
			// ��������
			Statement stat = conn.createStatement();
			String sql = null;
				
			String id = UUIDUtil.createUUID();
			String department_name = "����";
			String remarks = "����˾����";

			sql = "INSERT INTO db_department VALUES ('" + id + "','" + department_name + "','" + remarks + "');";
				
			System.out.println("�ɹ�����" + stat.executeUpdate(sql) + "����¼��");

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
			//��������
			Statement stat = conn.createStatement();
			String sql = null;
			String id = "1d94cb4950454b1b87e3f0cc654ae5e7";
			
			//����ΨһIDɾ�����²�
			sql = "DELETE FROM db_department WHERE id='" + id + "';";
			System.out.println("�ɹ�ɾ��" + stat.executeUpdate(sql) + "����¼��");
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
			//��������
			Statement stat = conn.createStatement();
			String sql = null;
			String id = "d211e039a24147b1a51e311d1e089b82";
			String remarks = "������ν�ɫ�Լ����β߻�";
			
			//�޸����β��ŵ�ְ��ע
			sql = "UPDATE db_department SET remarks = '" + remarks + "' WHERE id = '" + id + "';";
			System.out.println("�ɹ��޸�" + stat.executeUpdate(sql) + "����¼��");
			
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
			// ��������
			Statement stmt = conn.createStatement();
			String sql = null;
			ResultSet rs = null;

			// ��ѯ���в�����Ϣ
			sql = "SELECT d.`department_name` as dn, d.`remarks` rm FROM db_department d";

			// ��ѯָ�����ţ�����������Ϣ
			// sql = "SELECT d.`department_name` as dn, d.`remarks` rm FROM db_department d
			// WHERE d.department_name='������';";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String department_name = rs.getString("dn");
				String remarks = rs.getString("rm");
				System.out.println("�������ƣ�" + department_name + "�� ְ��ע��" + remarks);

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}
}
