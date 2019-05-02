package day3.exercise.numbergame;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 
 * @author 多俊睿
 * @date 2018年7月22日 下午4:02:17 
 *
 */

public class PlayGame {

	public static void main(String[] args) {	
			
		int min = 1; // 默认最小值	
		int max = 100; // 默认最大值	
		int times = 10; // 默认次数
			
			
		try {

			Scanner sc = new Scanner(System.in);// 创建对象
			
			boolean flag = true; // 建立循环
			
			Date time = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("HH时mm分ss秒");
			
			/**
			 * 游戏总开始时间
			 */
			long start = new Date().getTime();
			
			
			while (flag) {

				int m;
				
				System.out.println("这是从" + min + "到" + max + "的数字,你一共有" + times + "次机会");
				System.out.println("请选择 1：开始游戏   2：游戏配置     3：游戏退出");

				int n = sc.nextInt();// 接受对象
	
				switch (n) {

				case 1:
					
					m = (int) (Math.random() * (max - min) + min);
					// System.out.println(m);
					
					//单局游戏时间
					long start1 = new Date().getTime();
					
					for (int i = 1; i <= times; i++) {
						System.out.print("请输入你的数字:");
						int shu = sc.nextInt();
						
						if (shu == m) {
							System.out.println("\n恭喜你，你只用" + i + "次猜对了！");
							break;
						} else if (shu > m) {
							System.out.println("很遗憾，你猜大了，你还有" + (times - i) + "次机会");
						} else if (shu < m) {
							System.out.println("很遗憾，你猜小了，你还有" + (times - i) + "次机会");
						}
						if(times==i) {
							System.out.println("\n对不起，游戏次数用完了！");
						}
						
					}
					long end1 = new Date().getTime();
					time.setTime(end1 - start1 + 57600000);
					System.out.println("本局游戏共用时:" + sdf.format(time)+"，请选择相应数字继续操作。\n");
					
					break;

				case 2:
					System.out.println("请输入一个最大值，原来的最大值是" + max);
					int tempMax = sc.nextInt();
					max = tempMax;

					System.out.println("请输入一个最小值，原来的最小值的" + min);
					int tempMin = sc.nextInt();
					min = tempMin;

					System.out.println("请输入最大猜测次数，原来的次数为" + times);
					int tempTimes = sc.nextInt();
					times = tempTimes;

					if (tempMax > tempMin && tempTimes < (tempMax - tempMin)) {
						System.out.println("恭喜你，你配置成功!");
					} else {
						System.out.print("很遗憾，你配置失败!\n");
					}
					break;

				case 3:
					
					long end = new Date().getTime();
					
					time.setTime(end - start + 57600000);
					
					System.out.println("游戏结束,游戏总共用时:" + sdf.format(time));
					
					System.out.print("游戏结束了，欢迎下次再来啊!");
					System.exit(0);
					
					break;

				default:
					System.out.println("出错了，你输入了一个无效的字符，请你重新输入! \n");
					break;
				}
			}
			
			sc.close();
		
		} catch (Exception e) {
			System.out.println("出错了，你输入了一个无效的字符，请你重新输入! \n");

			main(args);
			// TODO: handle exception
		}
	}
}
