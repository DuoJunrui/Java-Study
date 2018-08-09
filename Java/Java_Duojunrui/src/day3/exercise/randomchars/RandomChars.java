package day3.exercise.randomchars;

import java.util.Random;

/**
 * 
 * @author �࿡�
 * @date 2018��7��22�� ����12:02:32 
 *
 */

//Ex0128 ��������ַ���
public class RandomChars {
	
	//��������ַ���
	public StringBuilder randomChars;
	
	//�ַ�����Χ
	public StringBuilder charsArea;
	
	//�ַ�������
	public int charsLength;
	
	
	/**�޲ι���
	 * Ĭ�Ϸ�Χ�Ǵ�д��ĸ������Ϊ10
	 * */
	public RandomChars() {
		
		this.setArea(Enumerate.CAP);
		this.setLength(10);
		this.creatChars();
		
	}
	
	/**
	 * �����ַ��������ͺͳ��������ַ���
	 * */
	public RandomChars(int length, Enumerate enu) {
		this.setArea(enu);
		this.setLength(length);
		this.creatChars();
	}
	
	/**
	 * �û�������ַ������ͺͳ����������ַ��� 
	 * */
	public RandomChars(int length, String enu) throws Exception{
		this.setArea(enu);
		this.setLength(length);
		this.creatChars();
		
	}
	
	/**
	 * �û�������ַ������ͺͳ����������ַ��� 
	 * @param length �ַ�������
	 * @param enu �ַ�������
	 * @param repeat �Ƿ������ַ�����Χ���ظ��ַ�
	 * @throws Exception ��������ַ�����ΧΪ��ʱ�׳����쳣 ���ο���
	 */
	public RandomChars(int length, String enu , boolean repeat) throws Exception{
		this.setArea(repeat,enu);
		this.setLength(length);
		this.creatChars();
		
	}
	
	/**
	 * 
	 * @param length �����ַ�������
	 */
	public void setLength(int length) {
		if(length > 0) {
			this.charsLength=length;
		}
		
	}
	
	/**
	 * 
	 * @param enu �����ַ�����Χ
	 */
	public void setArea(Enumerate enu) {
		
		if(this.charsArea == null) {
			
			this.charsArea = new StringBuilder();
		}
		
		this.charsArea.setLength(0);//�������
		this.charsArea.append(enu.toString());
		
	}
	
	//�����ַ�����Χ
	public void setArea(String area) throws Exception {
		if (this.charsArea == null) {
			this.charsArea = new StringBuilder();
		}
		this.charsArea.setLength(0);
		if(area.length() > 0) {
			this.charsArea = new StringBuilder(area);
		}else {
			throw new Exception("������ַ�������Ϊ�գ�");
		}
	}
		
	public void setArea(boolean repeat, String area) throws Exception {
			
		this.charsArea.setLength(0);
		if (repeat) {
			this.charsArea = new StringBuilder(area);
		} else {
			if(area.length() > 0) {
				for (int i = 0; i < area.length(); i++) {
					if (this.charsArea.toString().indexOf(area.charAt(i)) == -1) {
						this.charsArea.append(area.charAt(i));
					}
				}
			}else {
				throw new Exception("������ַ�������Ϊ�գ�");
			}
		}
	}
	
	
	/**
	 * ��ȡ��������ַ����ķ�Χ
	 * @return
	 */
	public String getArea() throws Exception{
		if (this.charsArea != null && this.charsArea.length() > 0 ) {
			
			return this.charsArea.toString();
			
		}else {
			throw new Exception("������ַ�������Ϊ�գ�");
		}
		//return null;
	}
	
	/**
	 * 
	 * @return ��ȡ���ɵ��ַ���
	 * @throws Exception ������ַ�������Ϊ��
	 */
	public String getChars() throws Exception{
		if (this.randomChars != null && this.randomChars.length() > 0) {
			return this.randomChars.toString();
		}else {
			throw new Exception("������ַ�������Ϊ�գ�");
		}
		
	}
	
	/**
	 * ɾ��һ���ַ���
	 * @param deleteChars ɾ���ַ���
	 * @throws Exception
	 */
	public void deleteChar(String deleteChars) throws Exception{
		
		if (this.charsArea != null || this.charsArea.length() > 0) {
			for(char c : deleteChars.toCharArray()) {
				if(this.charsArea.toString().indexOf(c)!=-1) {
					this.charsArea.deleteCharAt(this.charsArea.toString().indexOf(c));
				}
			}
		}else {
			throw new Exception("������ַ�������Ϊ�գ�");
		}
	}
	
	/**
	 * ��������ַ���
	 */
	public void creatChars() {
		if (this.randomChars == null) {
			this.randomChars = new StringBuilder();
		}
		Random rd = new Random();
		this.clear();
		for (int i = 0; i < this.charsLength; i++) {
			
			if (this.charsArea != null || this.charsArea.length() > 0) {
				
				randomChars.append(this.charsArea.charAt(rd.nextInt(this.charsArea.length())));
			}
		}
	}
	
	/**
	 * ��ȡ�ַ�������
	 * @return
	 */
	public int getLenght() {
		return this.charsLength;
	}
	
	/**
	 * �������ַ���
	 */
	public void clear() {
		this.randomChars.setLength(0);
	}
}

	

	
//	public void RandomChars(String str) {
//		this.str = str;
//		
//	}
//	
//	public String getName() {
//		
//		return str;
//		
//	}
//	
//	public void addEnu(Enumerate enu) {
//		
//		str = enu.getName() + str;
//		
//	}
//	
//	//���������ַ���
//	public void addEnu(String str) {
//		
//		this.str = this.str + str;
//		
//	}
//	
//	
//	//����ַ�������
//	public int length() {
//		
//		int i = str.length();
//		return i;
//	}
//		
//		
//	}


