package com.syh.ex129;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * 随机产生一个数字，让用户去输入猜测，并给出相应的提示。要求： <br/>
 * 1.需要保证程序的健壮性，需要保证程序必须有良好的容错机制； <br/>
 * 2.数字允许猜测的次数可以由用户定义，当达到最大的猜测次数时，给出友好的提示语句，并输出正确答案；（例如设置最多只能猜3次，
 * 当用户3次没猜对时应给出相应的提示） <br/>
 * 3.程序允许用户自行决定要不要再玩。 <br/>
 * 4.单次游戏结束时（无论猜对与否），应输出本次猜测的用时，以时分秒的格式输出（格式：HH：mm:ss）；程序结束前（即用户选择不再继续游玩时），
 * 应输出本次游玩的总用时，以时分秒的格式输出（格式：HH：mm:ss）。
 * 
 */
public class ConjectureNumber {
	public static void main(String[] args) {
		// 定义一些默认的参数
		// 随机数生成的最小范围
		int min = 0;
		// 随机数生成的最大范围
		int max = 100;
		// 最大猜测次数
		int count = 5;

		// 允许用户控制台输入
		Scanner sc = new Scanner(System.in);
		// 存储用户的输入
		String choose = "";

		// 定义一个用于记录游戏开始时间的毫秒数
		long totalStartTime = new Date().getTime();

		// 提示用户进行输入
		System.out.println("欢迎您游玩本猜数字游戏，游戏版权所有，盗版必究！");
		// 循环，使用户能重新游戏
		while (true) {
			System.out.println("当前随机数生成的范围是：" + min + "~" + max + "，最大猜测次数为：" + count + "请根据提示进行选择以开始游戏：");
			System.out.println("1.开始游戏");
			System.out.println("2.游戏设置");
			System.out.println("3.退出游戏");
			System.out.print("请选择：");
			choose = sc.nextLine();

			// 判断用户的选择
			if (choose.equals("1")) {
				// 用户选择开始游戏
				//记录生成的随机数字
				int randomNum = new Random().nextInt(max - min + 1) + min;
				
				//循环，以判断用户输入的次数
				boolean right = false;
				
				//用于显示用户猜测的范围
				int mins = min;
				int maxs = max;
				
				//记录游戏开始时间
				long onceStartTime = new Date().getTime();
				//循环，使用户开始游戏
				for ( int i = 0; i < count; i++ ) {
					//记录用户的输入
					int num = 0;
					
					System.out.println("当前随机数生成的范围是：" + mins + "~" + maxs + "，剩余次数为：" + (count - i));
					System.out.print("请输入您猜测的数字：");
					
					//输入异常的处理
					try {
						num = Integer.valueOf(sc.nextLine());
					} catch (NumberFormatException e) {
						System.out.println("您的输入有误，请重新输入！");
						i--;
						continue;
					}
					
					//判断用户的输入是否与正确答案一致，并给出相应的提示
					if ( num < randomNum ) {
						if ( count - i != 1 ) {
							System.out.println("很遗憾，您输入的数字小于正确答案，请继续猜测！");
						}
						if ( num > mins ) {
							mins = num;
						}
						right = false;
					} else if ( num > randomNum ) {
						if ( count - i != 1 ) {
							System.out.println("很遗憾，您输入的数字大于正确答案，请继续猜测！");
						}
						if ( num < mins ) {
							maxs = num;
						}
						right = false;
					} else {
						System.out.println("恭喜您，回答正确！");
						right = true;
						break;
					}
				}
				//记录游戏开始时间
				long onceEndTime = new Date().getTime();
				
				//判断用户是否猜对，没猜对，予以提示
				if ( !right ) {
					System.out.println("很遗憾，您没有猜到正确答案，正确答案是：" + randomNum);
				}
				
				System.out.println("您本次测试的游戏时间是：" + showTime(onceEndTime - onceStartTime));
				
				//用于记录用户是否继续游戏
				boolean continues = false;
				while (true) {
					System.out.print("是否需要重新开始一局新游戏(Y/N)：");
					choose = sc.nextLine();
					//判断用户的输入
					if ( choose.equalsIgnoreCase("y") ) {
						continues = true;
						break;
					} else if ( choose.equalsIgnoreCase("n") ) {
						continues = false;
						break;
					} else {
						System.out.println("您的输入有误，请重新输入！");
						continue;
					}
				}
				
				//判断用户是否要继续
				if ( continues ) {
					continue;
				} else {
					break;
				}
				
			} else if (choose.equals("2")) {
				// 用户选择对游戏进行配置
				while( true ) {
					System.out.println("当前游戏的随机数字生成范围为：" + min + "~" + max + "，最大猜测次数为：" + count + "，请根据提示选择需要修改的项：");
					System.out.println("1.修改随机数生成的最小值");
					System.out.println("2.修改随机数生成的最大值");
					System.out.println("3.修改最大猜测次数");
					System.out.println("4.保存并退出修改");
					System.out.print("请选择：");
					choose = sc.nextLine();
	
					//判断用户的输入
					if ( choose.equals("1") ) {
						//修改随机数生成的最小值
						while( true ) {
							System.out.print("请输入随机字符串生成的最小范围：");
							
							try {
								min = Integer.valueOf(sc.nextLine());
							} catch (NumberFormatException e) {
								System.out.println("您的输入有误，请重新输入！");
								continue;
							}
							
							//判断用户输入的数字是否为正整数
							if ( min <= 0 ) {
								System.out.println("随机数最小生成范围必须是正整数，您的输入有误，请重新输入！");
								continue;
							}
							
							//判断用户输入的最小值是否大于最大值
							if ( min >= max ) {
								System.out.println("随机数最大生成范围是：" +  max + "，您输入的最小范围不能等于大于最大范围，请重新输入！");
								continue;
							}
							
							//当用户输入的最小值能通过以上判断时，说明，用户输入的信息有效，则结束循环
							break;
						}
						
					} else if ( choose.equals("2") ) {
						//修改随机数生成的最大值
						while( true ) {
							System.out.print("请输入随机字符串生成的最大范围：");
							
							try {
								max = Integer.valueOf(sc.nextLine());
							} catch (NumberFormatException e) {
								System.out.println("您的输入有误，请重新输入！");
								continue;
							}
							
							//判断用户输入的数字是否为正整数
							if ( max <= 0 ) {
								System.out.println("随机数最大生成范围必须是大于0的正整数，您的输入有误，请重新输入！");
								continue;
							}
							
							//判断用户输入的最小值是否大于最大值
							if ( min >= max ) {
								System.out.println("随机数最大生成范围是：" +  min + "，您输入的最小范围不能大于等于最大范围，请重新输入！");
								continue;
							}
							
							//当用户输入的最小值能通过以上判断时，说明，用户输入的信息有效，则结束循环
							break;
						}
					} else if (choose.equals("3") ) {
						//修改最大猜测次数
						while( true ) {
							System.out.print("请输入最大猜测次数：");
							
							try {
								count = Integer.valueOf(sc.nextLine());
							} catch (NumberFormatException e) {
								System.out.println("您的输入有误，请重新输入！");
								continue;
							}
							
							//判断用户输入的数字是否为正整数
							if ( count < 0 ) {
								System.out.println("最大猜测次数必须是正整数，您的输入有误，请重新输入！");
								continue;
							}
							
							//当用户输入的最小值能通过以上判断时，说明，用户输入的信息有效，则结束循环
							break;
						}
					} else if ( choose.equals("4") ) {
						//保存并退出修改
						break;
					} else {
						// 如果用户的选择不在范围内时，提示用户
						System.out.println("您的输入有误，请重新输入！");
					} 
				}

			} else if (choose.equals("3")) {
				// 退出游戏
				break;
			} else {
				// 如果用户的选择不在范围内时，提示用户
				System.out.println("您的输入有误，请重新输入！");
			}
		}

		// 定义一个用于记录游戏开始时间的毫秒数
		long totalEndTime = new Date().getTime();
		System.out.println("本次游戏总时间为：" + showTime(totalEndTime - totalStartTime));
		System.out.println("期待您下次游玩，再见！");

		sc.close();
	}

	/**
	 * 用于返回时间
	 * 
	 * @return
	 */
	private static String showTime(long time) {
		String timeText = "";
		// 定义变量时、分、秒
		long s = 0;
		long m = 0;
		long h = 0;

		// 获取总秒数
		s = time / 1000;

		// 获取分钟数
		m = s / 60;
		// 获取剩余秒数
		s = s % 60;

		// 获取小时数
		h = m / 60;
		// 获取剩余分钟数
		m = m % 60;

		// 改写小时数的显示方式，若小时数只有一位，则在前面补0，下同
		if (String.valueOf(h).length() == 1) {
			timeText += "0" + String.valueOf(h) + ":";
		} else {
			timeText += String.valueOf(h) + ":";
		}

		// 改写分钟数
		if (String.valueOf(m).length() == 1) {
			timeText += "0" + String.valueOf(m) + ":";
		} else {
			timeText += String.valueOf(m) + ":";
		}

		// 改写秒数
		if (String.valueOf(s).length() == 1) {
			timeText += "0" + String.valueOf(s);
		} else {
			timeText += String.valueOf(s);
		}

		return timeText;
	}
}
