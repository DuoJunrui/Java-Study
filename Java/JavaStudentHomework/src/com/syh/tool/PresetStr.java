package com.syh.tool;

import java.util.Random;

import com.syh.ex128.RandomString;
import com.syh.ex128.StringMode;

/**
 * �����ṩһЩ��Ԥ��õ������Ϣ����ֱ�ӽ���ʹ��
 * 
 * @author ������
 * @version Ver1.0
 */
public class PresetStr {
	private static RandomString rs = new RandomString();
	
	/**
	 * �÷�������������������ó��ƺ�
	 * 
	 * @return ���ɵĳ��ƺ��ַ���
	 */
	public static String carLicence() {
		String s = "";

		// ��ӵ�����д
		rs.clear();
		rs.addMode(StringMode.AREA);
		s += rs.toString(1);

		// ��ӵ���һ�����룬ֻ��ӡ�ABCDE���������
		rs.clear();
		rs.addMode("ABCDE");
		s += rs.toString(1);

		// ��Ӻ���λ���
		rs.clear();
		rs.addMode(StringMode.CAP, StringMode.NUM, StringMode.NUM,
				StringMode.NUM, StringMode.NUM, StringMode.NUM, StringMode.NUM,
				StringMode.NUM, StringMode.NUM);
		s += rs.toString(5);

		return s;
	}
	
	/**
	 * �÷�����������һ��ָ����ʽ���������
	 * @param type ���Ƶ���ʽ
	 * @return ���ɵĳ��ƺ��ַ���
	 */
	public static String carLicence(CarLicecenType type) {
		String s = "";
		
		//�жϳ��Ƶ���ʽ
		switch (type) {
		case CIVIL: {
			s += carLicence();
			break;
		}
			
		case POLICE: {
			rs.clear();
			rs.addMode(StringMode.AREA);
			s += rs.toString(1);

			// ��ӵ���һ�����룬ֻ��ӡ�ABCDE���������
			rs.clear();
			rs.addMode("ABCDE");
			s += rs.toString(1);
			
			rs.clear();
			rs.addMode(StringMode.NUM);
			s += rs.toString(4);
			s += "��";
			break;
		}
		
		case ELCHEE: {
			s += "ʹ";
			rs.clear();
			rs.addMode(StringMode.NUM);
			s += rs.toString(6);
			break;
		}
		
		case ENERGY: {
			rs.clear();
			rs.addMode(StringMode.AREA);
			s += rs.toString(1);

			// ��ӵ���һ�����룬ֻ��ӡ�ABCDE���������
			rs.clear();
			rs.addMode("ABCDE");
			s += rs.toString(1);
			
			rs.clear();
			rs.addMode("DF");
			s += rs.toString(1);
			
			rs.clear();
			rs.addMode(StringMode.NUM);
			s += rs.toString(5);
			break;
		}
		}
		
		return s;
	}
	
	/**
	 * �÷��������������һ�����֤��
	 * @return ���ɵ����֤����
	 */
	public static String IdentityCard() {
		String s = "45030119";
		
		rs.clear();
		rs.addMode(StringMode.NUM);
		s += rs.toString(2);
		
		Random r = new Random();
		
		//������
		int i = (1 + r.nextInt(11));
		//�ж����ɵ�����ַ����Ƿ�С��10��С��10����s�в�ȫһ��0
		if ( i < 10 ) {
			s += "0";
		}
		s += i;
		
		//������
		i = (1 + r.nextInt(27));
		//�ж����ɵ�����ַ����Ƿ�С��10��С��10����s�в�ȫһ��0
		if ( i < 10 ) {
			s += "0";
		}
		s += i;
		
		s += rs.toString(4);
		
		return s;
	}
	
	public static String name() {
		String s;
		
		rs.clear();
		rs.addMode(StringMode.SURNAME);
		s = rs.toString(1);
		
		rs.clear();
		rs.addMode(StringMode.CH);
		s += rs.toString(1, 2);
		
		return s;
	}
	
}
