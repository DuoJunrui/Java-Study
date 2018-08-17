package com.syh.ex128;

import java.util.Random;

/**
 * �������ڲ�������ַ���������������Ҫ���ı����С�ͨ�������ṩ�ķ��������ַ����������ģ�ͣ�
 * Ҳ�����Զ�����Ҫ��ӵ��ַ��������ַ����������ģ�͡�<br/>
 * <b><i>NOTE:�ַ����ؼ�Ϊ��������ַ����ķ�Χ</i></b>
 * 
 * @author ������
 * @version V1.8
 */

public class RandomString {
	// ���ڶ�������ַ��������ķ�Χ
	private StringBuilder stringSeed = new StringBuilder("");
	
	/**
	 * ָ��StringModeö���࣬��ͨ�����������ַ����������ģ��
	 */
	public StringMode mode;
	
	/**
	 * ��ʼ���ַ����أ�ʹ�䲻�����κ�Ԫ��
	 */
	public RandomString() {
	}

	/**
	 * ͨ��Ԥ��ģ��ģ�Ͷ��ַ����ؽ��г�ʼ��
	 * 
	 * @param modes
	 *            ��Ҫ�����ַ������е�ģ�ͣ�ΪStringModeö�ٶ���
	 */
	public RandomString(StringMode... modes) {
		addMode(modes);
	}
	
	/**
	 * ͨ���Զ�����ַ������ַ����ؽ��г�ʼ��
	 * 
	 * @param modes
	 *            ��Ҫ�����ַ������е�ģ�ͣ�ΪStringModeö�ٶ���
	 */
	public RandomString(String mode) {
		addMode(mode);
	}

	/**
	 * �÷������ڷ����ַ�����
	 * 
	 * @return ���ڷ�������ַ������ɵķ�Χ
	 */
	public String getStringSeed() {
		return stringSeed.toString();
	}
	
	/**
	 * �÷����������ַ����������ģ�ͣ�ͨ���÷�����ӵ�ģ�ͽ�������ַ��������Ƿ������֮�ظ���Ԫ��
	 * @param modes ��Ҫ���뵽�ַ������е�ģ��
	 */
	public void addMode(StringMode... modes) {
		for (StringMode m : modes) {
			stringSeed.append(m.getSeed());
		}
	}
	
	/**
	 * �÷����������ַ����������ģ�ͣ���ͨ��isRepeat�����ж��Ƿ�������ӿ��ظ����ַ��������ַ�����
	 * 
	 * @param isRepeat �ַ������е�Ԫ���Ƿ���ظ�
	 * @param mode ��Ҫ���뵽�ַ������е�ģ��
	 */
	public void addMode(boolean isRepeat, StringMode... modes) {
		//�жϴ���Ĳ����Ƿ������ַ�������Ԫ���ظ�����Ϊtrue�����ͬ�ڵ���addMode(StringMode... modes)
		if ( !isRepeat ) {
			//ѭ������ȡ���д����ģ��
			for ( StringMode m : modes ) {
				//�ж�ģ�������Ƿ��Ѿ����ڣ��������򲻽������
				if ( stringSeed.indexOf(m.getSeed()) > -1 ) {
					continue;
				}
				
				packageString(m.getSeed());
			}
		} else {
			addMode(modes);
		}
	}
	
	/**
	 * �÷����������ַ�����������Զ�����ַ�����ͨ���÷�����ӵ��ַ�����������ַ��������Ƿ������֮�ظ���Ԫ��
	 * @param mode ��Ҫ���뵽�ַ������е�ģ��
	 */
	public void addMode(String mode) {
		stringSeed.append(mode);
	}
	
	/**
	 * �÷����������ַ�����������Զ�����ַ�������ͨ��isRepeat�����ж��Ƿ�������ӿ��ظ����ַ��������ַ�����
	 * 
	 * @param isRepeat �ַ������е�Ԫ���Ƿ���ظ�
	 * @param mode ��Ҫ���뵽�ַ������е�ģ��
	 */
	public void addMode(boolean isRepeat, String mode) {
		//�жϴ���Ĳ����Ƿ������ַ�������Ԫ���ظ�����Ϊtrue�����ͬ�ڵ���addMode(StringMode... modes)
		if ( !isRepeat ) {
			//�ж�ģ�������Ƿ��Ѿ����ڣ��������򲻽������
			if ( stringSeed.indexOf(mode) > -1 ) {
				return;
			}
			
			packageString(mode);
		} else {
			addMode(mode);
		}
	}

	/**
	 * �÷����������StringSeed�д洢������ַ������ɷ�Χ
	 */
	public void clear() {
		stringSeed.replace(0, (stringSeed.length()), ""); // ������ַ������ɷ�Χ���
	}

	/**
	 * �÷������ڷ���StringSeed�ĳ��ȣ�����ַ������ɷ�Χ�ĳ��ȣ�
	 * 
	 * @return ��������ַ������ɷ�ΧStringSeed�ĳ���
	 */
	public int length() {
		return stringSeed.length();
	}

	/**
	 * ��������������ַ������ɷ�Χ��ɾ�����û�ָ�������з����������ַ���
	 * 
	 * @param str
	 *            �û�ָ����Ҫ������ַ������ɷ�Χ��ɾ�����ַ���
	 * @return ����ɾ����״̬��true��ʾɾ���ɹ���false��ʾɾ��ʧ��
	 * @see #remove(int)
	 * @see #remove(int, int)
	 */
	public boolean remove(String str) {
		// �ж�StringSeed�Ƿ�Ϊ�գ�Ϊ���򷵻�false
		if (stringSeed.length() == 0) {
			return false;
		}

		// �ж��û�ָ����Ҫ�Ƴ����ַ����Ƿ�Ϊ�գ����Ϊ�գ��򷵻�false
		if (str.equals("") || str == null) {
			return false;
		}

		// ���ڴ洢��StringSeed�в��ҵ������û�ָ��ָ���ַ���str��λ��
		int StartPos = stringSeed.indexOf(str);

		// �ж�����StringSeed���Ƿ����ָ�����ַ�����û���ҵ����򷵻�false
		if (StartPos < 0) // ����޷��ҵ���Char��ƥ����ַ���
		{
			return false; // ɾ��ʧ�ܣ�����false
		}

		// ѭ������StringSeed���Ƴ�ָ�����ַ���
		while (StartPos > 0) {
			stringSeed.delete(StartPos, StartPos + str.length());// ��StringSeed���Ƴ�ָ�����ַ���
			StartPos = stringSeed.indexOf(str, StartPos);// ���²���StringSeed�Ƿ񻹰���str
		}

		return true;// ɾ������������true
	}

	/**
	 * ��������������ַ������ɷ�Χ��ɾ�����û�ָ����Χ�ڣ��ַ�����λ���Ǵ�0��ʼ�����ַ���<br/>
	 * note��ָ���ķ�Χ�У�ɾ����Ԫ�ذ�����ʼλ�õ�Ԫ�أ�������������λ�õ�Ԫ�أ����磺<br/>
	 * &nbsp;&nbsp;&nbsp;&nbsp; StringSeed.append("0123456789");<br/>
	 * &nbsp;&nbsp;&nbsp;&nbsp; remove(0, 3);<br/>
	 * &nbsp;&nbsp;&nbsp;&nbsp; System.out.println(StringSeed.toString());<br/>
	 * ������Ϊ��<br/>
	 * 3456789
	 * 
	 * @param startPos
	 *            ��ʾ�û�ָ����Χ����ʼλ�ã�������λ�õ�Ԫ�أ�
	 * @param endPos
	 *            ��ʾ�û�ָ����Χ�Ľ���λ�ã���������λ�õ�Ԫ�أ�
	 * @return ����ɾ����״̬��true��ʾɾ���ɹ���false��ʾɾ��ʧ��
	 * @see #remove(int)
	 * @see #remove(String)
	 */
	public boolean remove(int startPos, int endPos) {
		// �ж�StringSeed�Ƿ�Ϊ�գ�Ϊ���򷵻�false
		if (stringSeed.length() == 0) {
			return false;
		}

		// �ж��û�ָ����ʼλ���Ƿ���ڽ���λ�ã������򷵻�false
		if (startPos > endPos) {
			int temp = startPos;
			startPos = endPos;
			endPos = temp;
		}

		// �ж��û�ָ��λ���Ƿ����StringSeed�ķ�Χ���������򷵻�false
		if (startPos < 0 || endPos > stringSeed.length()) {
			return false;
		}

		stringSeed.delete(startPos, endPos);// ɾ��ָ��λ�õ��ַ���

		return true;// ɾ���ɹ�������true
	}

	/**
	 * ��������������ַ������ɷ�Χ��ɾ�����û�ָ��λ�ã��ַ�����λ���Ǵ�0��ʼ�����ַ���<br/>
	 * ���磺<br/>
	 * &nbsp&nbsp&nbsp&nbsp StringSeed.append("0123456789");<br/>
	 * &nbsp&nbsp&nbsp&nbsp remove(2);<br/>
	 * &nbsp&nbsp&nbsp&nbsp System.out.println(StringSeed.toString());<br/>
	 * ������Ϊ��<br/>
	 * 013456789
	 * 
	 * @param pos
	 *            ��ʾ�û�ָ��λ��
	 * @return ����ɾ����״̬��true��ʾɾ���ɹ���false��ʾɾ��ʧ��
	 * @see #remove(String)
	 * @see #remove(int, int)
	 */
	public boolean remove(int pos) {
		// �ж�StringSeed�Ƿ�Ϊ�գ�Ϊ���򷵻�false
		if (stringSeed.length() == 0) {
			return false;
		}

		// �ж��û�ָ��λ���Ƿ����StringSeed�ķ�Χ���������򷵻�false
		if (pos < 0 || pos > stringSeed.length()) {
			return false;
		}

		stringSeed.delete(pos, pos + 1);// ɾ��ָ��λ�õ��ַ���

		return true;// ɾ���ɹ�������true
	}

	/**
	 * �÷��������Ƴ�����ַ������ɷ�Χ���ظ����ַ����Դﵽ��Χ���ַ��������ظ������
	 * 
	 * @return �����Ƴ��ַ�����״̬��true��ʾ�Ƴ��ɹ���false��ʾ�Ƴ�ʧ��
	 * */
	public boolean removeRepetition() {
		// �ж�StringSeed�Ƿ�Ϊ�գ�Ϊ���򷵻�false
		if (stringSeed.length() == 0) {
			return false;
		}

		// ���ڱ���ɾ���ظ�Ԫ�غ���ַ���
		StringBuilder s = new StringBuilder();

		// ѭ������ֲ�ɾ���ַ����ظ�Ԫ��
		for (int i = 0; i < stringSeed.length(); i++) {
			// �ж�Ԫ���Ƿ���s�д��ڣ����������
			if (s.indexOf(getStringSeed().substring(i, i + 1)) > -1) {
				continue;
			}

			// �����ڵ��ַ���������ӽ�s��
			s.append(getStringSeed().substring(i, i + 1));
		}

		// �ж����ַ�����ԭ�ַ����Ƿ���ͬ����ͬ��˵��δ���иĶ�������false
		if (s.toString().equals(getStringSeed())) {
			return false;
		}

		clear();// ����clear()�����StringSeed
		stringSeed.append(s.toString());// ��s�е�Ԫ�ط���StringSeed��
		return true;//
	}

	/**
	 * ��Ĭ�Ϸ�ʽ�������ɵ�����ַ�����Ĭ�ϳ���Ϊ6���ַ�
	 * 
	 * @return ���ɵ�6���ַ����ȵ��ַ���
	 * @see #toString(int)
	 * @see #toString(int, int)
	 */
	@Override
	public String toString() {
		// �ж�����ַ������ɷ�Χ�Ƿ�Ϊ�գ�Ϊ����ֱ�ӷ��ؿ��ַ���
		if (stringSeed.length() == 0) {
			return "";
		}

		return GenerateString(6);
	}

	/**
	 * ���������������ַ������䳤�ȷ�Χ���û�ָ��
	 * 
	 * @param stringLengthMin
	 *            ������ȵ���Сֵ
	 * @param stringLengthMax
	 *            ������ȵ����ֵ
	 * @return �������ɵ�����ַ���
	 * @see #toString()
	 * @see #toString(int)
	 */
	public String toString(int stringLengthMin, int stringLengthMax) {
		// �ж�����ַ������ɷ�Χ�Ƿ�Ϊ�գ�Ϊ����ֱ�ӷ��ؿ��ַ���
		if (stringSeed.length() == 0) {
			return "";
		}

		// �ж�ָ�����ַ��������Ƿ�С��0������ǣ��򷵻ؿ��ַ���
		if (stringLengthMin < 0) {
			return "";
		}

		// �ж�ָ�����ַ���������Сֵ�Ƿ�������ֵ������ǣ��򷵻ؿ��ַ���
		if (stringLengthMax - stringLengthMin < 0) {
			return "";
		}

		return GenerateString(new Random().nextInt((stringLengthMax
				- stringLengthMin + 1))
				+ stringLengthMin); // �������ɵ��ַ���
	}

	/**
	 * ���ɹ̶����ȵ�����ַ������䳤�����û�ָ��
	 * 
	 * @param stringLength
	 *            ����ַ����ĳ���
	 * @return �������ɵ�����ַ���
	 * @see #toString()
	 * @see #toString(int, int)
	 */
	public String toString(int stringLength) {
		// �ж�����ַ������ɷ�Χ�Ƿ�Ϊ�գ�Ϊ����ֱ�ӷ��ؿ��ַ���
		if (stringSeed.length() == 0) {
			return "";
		}

		// �ж�ָ�����ַ��������Ƿ�С��0������ǣ��򷵻ؿ��ַ���
		if (stringLength < 0) {
			return "";
		}

		return GenerateString(stringLength); // �������ɵ��ַ���
	}

	/**
	 * ��װ�ַ������ɷ�Χ�������ڲ���������ظ�������£���StringSeed�����޸ģ�
	 * �ڵ��ø÷���ʱ�����Ƚ������е��ַ������Ϊ�����ַ������ֱ�����жϣ��� �ﵽ������ظ��ַ�����Ŀ��
	 * 
	 * @param mode
	 *            �������StringSeed���ַ���
	 * @return �����ַ������״̬��trueΪ��ӳɹ���falseΪ���ʧ��
	 */
	private void packageString(String mode) {
		// ѭ������Mode���Ϊ�����ַ��������ֱ���StringSeed���жԱȣ����ĳ���ַ����ڣ�����Ӹ��ַ��Ա�֤���ַ������ظ����
		for (int i = 0; i < mode.length(); i++) {
			// �жϵ�ǰ�ַ��Ƿ������StringSeed�У�������ڣ������ѭ�����ж���һ���ַ�
			if (stringSeed.indexOf(mode.substring(i, i + 1)) > -1) {
				continue;
			}

			// ��������ڲ�ֵ��ַ������ַ�����StringSeed�У�����flag����Ϊtrue
			stringSeed.append(mode.substring(i, i + 1));
		}

	}

	/**
	 * ������������ַ����ĺ����㷨����ֹ������
	 * 
	 * @param stringLength
	 *            ָ�����ɵ�����ַ�������
	 * @return �������ɵ�����ַ���
	 * @see #toString()
	 * @see #toString(int)
	 * @see #toString(int, int)
	 */
	private String GenerateString(int stringLength) {
		String RandomString = ""; // ����һ���ַ������������ڴ洢ѡ����ַ���
		int ChooiseNumber = -1; // ����һ�����α���������������������֣������ڴ�StringSeed��ѡ���Ӧ���ַ�
		Random RandomNumber = new Random(); // ����һ��Random���������������������

		// ѭ������RandomString�з�������ַ�����ѭ�����������ַ����ĳ���
		for (int i = 0; i < stringLength; i++) {
			ChooiseNumber = RandomNumber.nextInt(stringSeed.length()); // ��0��StringSeed���ܳ����������һ������
			RandomString = RandomString + stringSeed.charAt(ChooiseNumber); // ����������StringSeed�ж�Ӧ���ַ�����RandomString
		}

		return RandomString; // �������ɵ��ַ���
	}
}
