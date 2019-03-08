package part1.basic.day07;

import java.util.Scanner;

/**
 * @author: 多俊睿
 * @data: 2019年3月3日 下午9:51:28
 * @Description: 猜字符小游戏 练习
 */
public class GuessingGame {

	//主方法：程序入口
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //开辟系统接收输入的监听
		char[] chs = generate(); //获取随机字符数组
		System.out.print("生成的随机字符数组为：");	
		System.out.println(chs); //偷偷查看生成的随机字符数组
		int count = 0; //猜错的次数
		
		while (true) { //自造死循环
			
			System.out.println("请输入您猜测的5个字母（不区分大小写）："); //提示用户输入
			String str = scan.next(); //接收用户输入的字符串
			str = str.toUpperCase();  //将字符串中的小写转化为大写
			
			if (str.equals("EXIT")) { //如果输入EXIT，则跳出循环。 ()注意。引用类型排断相等用equals();
				System.out.println("已经退出本次游戏。");
				break;
			}
			
			char[] input = str.toCharArray(); //将字符串转化为字符数组
			System.out.println(input);
			int[] result = contrast(chs, input); //对比随机生成的字符数组和用户输入的字符数组
			if (result[1]==chs.length) { //如果猜对的位置数=随机字符的个数，则猜对了 应为位置个数及基于猜对字符个数再次去计算的
				int score = 100*chs.length-10*count;
				System.out.println("恭喜你猜对了！得分为："+score);
				break;  //只有猜对了才跳出while循环
			} else { //否则则猜错了
				count++;
				System.out.println("您猜对的字符个数为："+result[0]+",其中有"+result[1]+"个位置猜对了。继续猜吧");
			}
		}
		scan.close();
	}
	
	//生成不重复的随机字符的方法
	public static char[] generate() {
		char[] chs = new char[5]; //申明并构造一个长度为5的数组用于存储随机生成的字符数组
		char[] letters = {'A','B','C','D','E','F','G','H','I','J',
				'K','L','M','N','O','P','Q','R','S','T','U','V',
				'W','X','Y','Z'}; //存放随机字符的范围（26个大写英文字母）
		/**
		 * 声明一个布尔型数组，用来当做随机数组的开关
		 * 数组的长度和letters数组的长度是一样的
		 * 应为长度一样，同时可以用index来控制他们两的下标
		 */
		boolean[] flags = new boolean[letters.length]; 
		//给chs数组中的每个元素赋值
		for (int i = 0; i < chs.length; i++) { //遍历chs数组
			
			int index;
			do {
				//定义index为letters数组的随机下标（即，小标对应字符，也就是随机字符）
				index = (int)(Math.random()*letters.length); 
			} while (flags[index]==true); //当下标为true时，说明已经存过了，需要重新生成随机字符
			
			chs[i] = letters[index];  //基于letters的随机下标，给chs赋随机值
			flags[index] =true; //赋完值，修改开关数组flags与随机字符数组letters下标一样的值为 true 说明已经使用过了
		}
		return chs;
	}

	//对比用户输入的字符数组input 与随机生成的数组chs
	public static int[] contrast(char[] chs, char[] input) {
		//存储对比的结果，result[0]存储猜对的字符数，result[1]存储猜对的位置数
		int[] result = new int[2];  //初始化，默认 0,0
		for (int i = 0; i < chs.length; i++) { //遍历随机字符数组
			for (int j = 0; j < input.length; j++) { //遍历用户输入的数组
				if (chs[i]==input[j]) { //如果随机字符的相应元素等于用户输入的字符数组的相应元素 
					result[0]++; //则猜对的字符数 +1
					if (i==j) { //如果两个数组的位置相等 （注意，写在字符对的情况里面，字符对了，再去排断位置是否对）
						result[1]++; //则位置猜对了 +1
					}
					break; //猜对了，则后面的元素将不再进行比较
				}
			}
		}
		return result;
	}
	
	
}
