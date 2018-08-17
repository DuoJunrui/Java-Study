package com.syh.tool;

public enum RegionType {
	/**
	 * ������
	 */
	BEIJING("������", "��", "11"),
	/**
	 * �����
	 */
	TIANJIN("�����", "��", "12"),
	/**
	 * �ӱ�ʡ
	 */
	HEIBEI("�ӱ�ʡ", "��", "13"),
	/**
	 * ɽ��ʡ
	 */
	SHANXI_JIN("ɽ��ʡ", "��", "14"), 
	/**
	 * ���ɹ�������
	 */
	NEIMENGGU("���ɹ�������", "��", "15"), 
	/**
	 * ����ʡ
	 */
	LIAONING("����ʡ", "��", "21"), 
	/**
	 * ����ʡ
	 */
	JILIN("����ʡ", "��", "22"), 
	/**
	 * ������ʡ
	 */
	HEILONGJIANG("������ʡ", "��", "23"), 
	/**
	 * �Ϻ���
	 */
	SHANGHAI("�Ϻ���", "��", "31"), 
	/**
	 * ����ʡ
	 */
	JIANGSU("����ʡ", "��", "32"), 
	/**
	 * �㽭ʡ
	 */
	ZHEJIANG("�㽭ʡ", "��", "33"), 
	/**
	 * ����ʡ
	 */
	ANHUI("����ʡ", "��", "34"), 
	/**
	 * ����ʡ
	 */
	FUJIAN("����ʡ", "��", "35"), 
	/**
	 * ����ʡ
	 */
	JIANGXI("����ʡ", "��", "36"), 
	/**
	 * ɽ��ʡ
	 */
	SHANDONG("ɽ��ʡ", "³", "37"), 
	/**
	 * ����ʡ
	 */
	HENAN("����ʡ", "ԥ", "41"), 
	/**
	 * ����ʡ
	 */
	HUBEI("����ʡ", "��", "42"), 
	/**
	 * ����ʡ
	 */
	HUNAN("����ʡ", "��", "43"), 
	/**
	 * �㶫ʡ
	 */
	GUANGDONG("�㶫ʡ", "��", "44"), 
	/**
	 * ����׳��������
	 */
	GUANGXI("����׳��������", "��", "45"), 
	/**
	 * ����ʡ
	 */
	HAINAN("����ʡ", "��", "46"), 
	/**
	 * ������
	 */
	CHONGQING("������", "��", "50"), 
	/**
	 * �Ĵ�ʡ
	 */
	SICHUAN("�Ĵ�ʡ", "��", "51"), 
	/**
	 * ����ʡ
	 */
	GUIZHOU("����ʡ", "��", "52"), 
	/**
	 * ����ʡ
	 */
	YUNNAN("����ʡ", "��", "53"), 
	/**
	 * ����������
	 */
	XIZANG("����������", "��", "54"), 
	/**
	 * ����ʡ
	 */
	SHANXI_SHAN("����ʡ", "��", "61"), 
	/**
	 * ����ʡ
	 */
	GANSU("����ʡ", "��", "62"), 
	/**
	 * �ຣʡ
	 */
	QINGHAI("�ຣʡ", "��", "63"), 
	/**
	 * ���Ļ���������
	 */
	NINGXIA("���Ļ���������", "��", "64"), 
	/**
	 * �½�ά���������
	 */
	XINJIANG("�½�ά���������", "��", "65");
	
	private String name;
	private String abbreviation;
	private String number;
	
	RegionType(String name, String abbreviation, String number) {
		this.name = name;
		this.abbreviation = abbreviation;
		this.number = number;
	}
	
	/**
	 * ���ڷ���������
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * ���ڷ��ص�������д
	 * @return
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * ���ڷ��������
	 * @return
	 */
	public String getNumber() {
		return number;
	}
	//TODO ���ַ���׼��д��XML��
}
