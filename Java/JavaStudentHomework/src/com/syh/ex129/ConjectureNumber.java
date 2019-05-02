package com.syh.ex129;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * �������һ�����֣����û�ȥ����²⣬��������Ӧ����ʾ��Ҫ�� <br/>
 * 1.��Ҫ��֤����Ľ�׳�ԣ���Ҫ��֤������������õ��ݴ���ƣ� <br/>
 * 2.��������²�Ĵ����������û����壬���ﵽ���Ĳ²����ʱ�������Ѻõ���ʾ��䣬�������ȷ�𰸣��������������ֻ�ܲ�3�Σ�
 * ���û�3��û�¶�ʱӦ������Ӧ����ʾ�� <br/>
 * 3.���������û����о���Ҫ��Ҫ���档 <br/>
 * 4.������Ϸ����ʱ�����۲¶���񣩣�Ӧ������β²����ʱ����ʱ����ĸ�ʽ�������ʽ��HH��mm:ss�����������ǰ�����û�ѡ���ټ�������ʱ����
 * Ӧ����������������ʱ����ʱ����ĸ�ʽ�������ʽ��HH��mm:ss����
 * 
 */
public class ConjectureNumber {
	public static void main(String[] args) {
		// ����һЩĬ�ϵĲ���
		// ��������ɵ���С��Χ
		int min = 0;
		// ��������ɵ����Χ
		int max = 100;
		// ���²����
		int count = 5;

		// �����û�����̨����
		Scanner sc = new Scanner(System.in);
		// �洢�û�������
		String choose = "";

		// ����һ�����ڼ�¼��Ϸ��ʼʱ��ĺ�����
		long totalStartTime = new Date().getTime();

		// ��ʾ�û���������
		System.out.println("��ӭ�����汾��������Ϸ����Ϸ��Ȩ���У�����ؾ���");
		// ѭ����ʹ�û���������Ϸ
		while (true) {
			System.out.println("��ǰ��������ɵķ�Χ�ǣ�" + min + "~" + max + "�����²����Ϊ��" + count + "�������ʾ����ѡ���Կ�ʼ��Ϸ��");
			System.out.println("1.��ʼ��Ϸ");
			System.out.println("2.��Ϸ����");
			System.out.println("3.�˳���Ϸ");
			System.out.print("��ѡ��");
			choose = sc.nextLine();

			// �ж��û���ѡ��
			if (choose.equals("1")) {
				// �û�ѡ��ʼ��Ϸ
				//��¼���ɵ��������
				int randomNum = new Random().nextInt(max - min + 1) + min;
				
				//ѭ�������ж��û�����Ĵ���
				boolean right = false;
				
				//������ʾ�û��²�ķ�Χ
				int mins = min;
				int maxs = max;
				
				//��¼��Ϸ��ʼʱ��
				long onceStartTime = new Date().getTime();
				//ѭ����ʹ�û���ʼ��Ϸ
				for ( int i = 0; i < count; i++ ) {
					//��¼�û�������
					int num = 0;
					
					System.out.println("��ǰ��������ɵķ�Χ�ǣ�" + mins + "~" + maxs + "��ʣ�����Ϊ��" + (count - i));
					System.out.print("���������²�����֣�");
					
					//�����쳣�Ĵ���
					try {
						num = Integer.valueOf(sc.nextLine());
					} catch (NumberFormatException e) {
						System.out.println("���������������������룡");
						i--;
						continue;
					}
					
					//�ж��û��������Ƿ�����ȷ��һ�£���������Ӧ����ʾ
					if ( num < randomNum ) {
						if ( count - i != 1 ) {
							System.out.println("���ź��������������С����ȷ�𰸣�������²⣡");
						}
						if ( num > mins ) {
							mins = num;
						}
						right = false;
					} else if ( num > randomNum ) {
						if ( count - i != 1 ) {
							System.out.println("���ź�������������ִ�����ȷ�𰸣�������²⣡");
						}
						if ( num < mins ) {
							maxs = num;
						}
						right = false;
					} else {
						System.out.println("��ϲ�����ش���ȷ��");
						right = true;
						break;
					}
				}
				//��¼��Ϸ��ʼʱ��
				long onceEndTime = new Date().getTime();
				
				//�ж��û��Ƿ�¶ԣ�û�¶ԣ�������ʾ
				if ( !right ) {
					System.out.println("���ź�����û�вµ���ȷ�𰸣���ȷ���ǣ�" + randomNum);
				}
				
				System.out.println("�����β��Ե���Ϸʱ���ǣ�" + showTime(onceEndTime - onceStartTime));
				
				//���ڼ�¼�û��Ƿ������Ϸ
				boolean continues = false;
				while (true) {
					System.out.print("�Ƿ���Ҫ���¿�ʼһ������Ϸ(Y/N)��");
					choose = sc.nextLine();
					//�ж��û�������
					if ( choose.equalsIgnoreCase("y") ) {
						continues = true;
						break;
					} else if ( choose.equalsIgnoreCase("n") ) {
						continues = false;
						break;
					} else {
						System.out.println("���������������������룡");
						continue;
					}
				}
				
				//�ж��û��Ƿ�Ҫ����
				if ( continues ) {
					continue;
				} else {
					break;
				}
				
			} else if (choose.equals("2")) {
				// �û�ѡ�����Ϸ��������
				while( true ) {
					System.out.println("��ǰ��Ϸ������������ɷ�ΧΪ��" + min + "~" + max + "�����²����Ϊ��" + count + "���������ʾѡ����Ҫ�޸ĵ��");
					System.out.println("1.�޸���������ɵ���Сֵ");
					System.out.println("2.�޸���������ɵ����ֵ");
					System.out.println("3.�޸����²����");
					System.out.println("4.���沢�˳��޸�");
					System.out.print("��ѡ��");
					choose = sc.nextLine();
	
					//�ж��û�������
					if ( choose.equals("1") ) {
						//�޸���������ɵ���Сֵ
						while( true ) {
							System.out.print("����������ַ������ɵ���С��Χ��");
							
							try {
								min = Integer.valueOf(sc.nextLine());
							} catch (NumberFormatException e) {
								System.out.println("���������������������룡");
								continue;
							}
							
							//�ж��û�����������Ƿ�Ϊ������
							if ( min <= 0 ) {
								System.out.println("�������С���ɷ�Χ�����������������������������������룡");
								continue;
							}
							
							//�ж��û��������Сֵ�Ƿ�������ֵ
							if ( min >= max ) {
								System.out.println("�����������ɷ�Χ�ǣ�" +  max + "�����������С��Χ���ܵ��ڴ������Χ�����������룡");
								continue;
							}
							
							//���û��������Сֵ��ͨ�������ж�ʱ��˵�����û��������Ϣ��Ч�������ѭ��
							break;
						}
						
					} else if ( choose.equals("2") ) {
						//�޸���������ɵ����ֵ
						while( true ) {
							System.out.print("����������ַ������ɵ����Χ��");
							
							try {
								max = Integer.valueOf(sc.nextLine());
							} catch (NumberFormatException e) {
								System.out.println("���������������������룡");
								continue;
							}
							
							//�ж��û�����������Ƿ�Ϊ������
							if ( max <= 0 ) {
								System.out.println("�����������ɷ�Χ�����Ǵ���0�������������������������������룡");
								continue;
							}
							
							//�ж��û��������Сֵ�Ƿ�������ֵ
							if ( min >= max ) {
								System.out.println("�����������ɷ�Χ�ǣ�" +  min + "�����������С��Χ���ܴ��ڵ������Χ�����������룡");
								continue;
							}
							
							//���û��������Сֵ��ͨ�������ж�ʱ��˵�����û��������Ϣ��Ч�������ѭ��
							break;
						}
					} else if (choose.equals("3") ) {
						//�޸����²����
						while( true ) {
							System.out.print("���������²������");
							
							try {
								count = Integer.valueOf(sc.nextLine());
							} catch (NumberFormatException e) {
								System.out.println("���������������������룡");
								continue;
							}
							
							//�ж��û�����������Ƿ�Ϊ������
							if ( count < 0 ) {
								System.out.println("���²���������������������������������������룡");
								continue;
							}
							
							//���û��������Сֵ��ͨ�������ж�ʱ��˵�����û��������Ϣ��Ч�������ѭ��
							break;
						}
					} else if ( choose.equals("4") ) {
						//���沢�˳��޸�
						break;
					} else {
						// ����û���ѡ���ڷ�Χ��ʱ����ʾ�û�
						System.out.println("���������������������룡");
					} 
				}

			} else if (choose.equals("3")) {
				// �˳���Ϸ
				break;
			} else {
				// ����û���ѡ���ڷ�Χ��ʱ����ʾ�û�
				System.out.println("���������������������룡");
			}
		}

		// ����һ�����ڼ�¼��Ϸ��ʼʱ��ĺ�����
		long totalEndTime = new Date().getTime();
		System.out.println("������Ϸ��ʱ��Ϊ��" + showTime(totalEndTime - totalStartTime));
		System.out.println("�ڴ����´����棬�ټ���");

		sc.close();
	}

	/**
	 * ���ڷ���ʱ��
	 * 
	 * @return
	 */
	private static String showTime(long time) {
		String timeText = "";
		// �������ʱ���֡���
		long s = 0;
		long m = 0;
		long h = 0;

		// ��ȡ������
		s = time / 1000;

		// ��ȡ������
		m = s / 60;
		// ��ȡʣ������
		s = s % 60;

		// ��ȡСʱ��
		h = m / 60;
		// ��ȡʣ�������
		m = m % 60;

		// ��дСʱ������ʾ��ʽ����Сʱ��ֻ��һλ������ǰ�油0����ͬ
		if (String.valueOf(h).length() == 1) {
			timeText += "0" + String.valueOf(h) + ":";
		} else {
			timeText += String.valueOf(h) + ":";
		}

		// ��д������
		if (String.valueOf(m).length() == 1) {
			timeText += "0" + String.valueOf(m) + ":";
		} else {
			timeText += String.valueOf(m) + ":";
		}

		// ��д����
		if (String.valueOf(s).length() == 1) {
			timeText += "0" + String.valueOf(s);
		} else {
			timeText += String.valueOf(s);
		}

		return timeText;
	}
}
