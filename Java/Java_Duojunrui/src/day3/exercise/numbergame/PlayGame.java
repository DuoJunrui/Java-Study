package day3.exercise.numbergame;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 
 * @author �࿡�
 * @date 2018��7��22�� ����4:02:17 
 *
 */

public class PlayGame {

	public static void main(String[] args) {	
			
		int min = 1; // Ĭ����Сֵ	
		int max = 100; // Ĭ�����ֵ	
		int times = 10; // Ĭ�ϴ���
			
			
		try {

			Scanner sc = new Scanner(System.in);// ��������
			
			boolean flag = true; // ����ѭ��
			
			Date time = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("HHʱmm��ss��");
			
			/**
			 * ��Ϸ�ܿ�ʼʱ��
			 */
			long start = new Date().getTime();
			
			
			while (flag) {

				int m;
				
				System.out.println("���Ǵ�" + min + "��" + max + "������,��һ����" + times + "�λ���");
				System.out.println("��ѡ�� 1����ʼ��Ϸ   2����Ϸ����     3����Ϸ�˳�");

				int n = sc.nextInt();// ���ܶ���
	
				switch (n) {

				case 1:
					
					m = (int) (Math.random() * (max - min) + min);
					// System.out.println(m);
					
					//������Ϸʱ��
					long start1 = new Date().getTime();
					
					for (int i = 1; i <= times; i++) {
						System.out.print("�������������:");
						int shu = sc.nextInt();
						
						if (shu == m) {
							System.out.println("\n��ϲ�㣬��ֻ��" + i + "�β¶��ˣ�");
							break;
						} else if (shu > m) {
							System.out.println("���ź�����´��ˣ��㻹��" + (times - i) + "�λ���");
						} else if (shu < m) {
							System.out.println("���ź������С�ˣ��㻹��" + (times - i) + "�λ���");
						}
						if(times==i) {
							System.out.println("\n�Բ�����Ϸ���������ˣ�");
						}
						
					}
					long end1 = new Date().getTime();
					time.setTime(end1 - start1 + 57600000);
					System.out.println("������Ϸ����ʱ:" + sdf.format(time)+"����ѡ����Ӧ���ּ���������\n");
					
					break;

				case 2:
					System.out.println("������һ�����ֵ��ԭ�������ֵ��" + max);
					int tempMax = sc.nextInt();
					max = tempMax;

					System.out.println("������һ����Сֵ��ԭ������Сֵ��" + min);
					int tempMin = sc.nextInt();
					min = tempMin;

					System.out.println("���������²������ԭ���Ĵ���Ϊ" + times);
					int tempTimes = sc.nextInt();
					times = tempTimes;

					if (tempMax > tempMin && tempTimes < (tempMax - tempMin)) {
						System.out.println("��ϲ�㣬�����óɹ�!");
					} else {
						System.out.print("���ź���������ʧ��!\n");
					}
					break;

				case 3:
					
					long end = new Date().getTime();
					
					time.setTime(end - start + 57600000);
					
					System.out.println("��Ϸ����,��Ϸ�ܹ���ʱ:" + sdf.format(time));
					
					System.out.print("��Ϸ�����ˣ���ӭ�´�������!");
					System.exit(0);
					
					break;

				default:
					System.out.println("�����ˣ���������һ����Ч���ַ���������������! \n");
					break;
				}
			}
			
			sc.close();
		
		} catch (Exception e) {
			System.out.println("�����ˣ���������һ����Ч���ַ���������������! \n");

			main(args);
			// TODO: handle exception
		}
	}
}
