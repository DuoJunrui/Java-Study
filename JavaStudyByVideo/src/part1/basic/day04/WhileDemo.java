package part1.basic.day04;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月2日 下午1:26:14
 * @Description: TODO
 */
public class WhileDemo {

	public static void main(String[] args) {
		/**
		 * While的练习
		 */
		int i=1;
		while (i<=10) {
			System.out.println("行动是成功的阶梯。");
			i++;
		}
		System.out.println("------运行结束。------");
		
		//正序执行
		int num=1;
		while (num<=9) {
			System.out.println(num+"*9="+num*9);
			num++;
		}
		System.out.println("------运行结束。------");
		
		//逆序执行
		int a=9;
		while (a>=1) {
			System.out.println(a+"*9="+a*9);
			a--;
		}
		System.out.println("------运行结束。------");
		
		/**
		 * 9的乘法表，逆序执行过程
		 * 
		 * 				   a=9
		 * true 输出   9*9=81 a=8
		 * true 输出   8*9=72 a=7
		 * true 输出   7*9=63 a=6
		 * true 输出   6*9=54 a=5
		 * true 输出   5*9=45 a=4
		 * true 输出   4*9=36 a=3
		 * true 输出   3*9=27 a=2
		 * true 输出   2*9=18 a=1
		 * true 输出   1*9=9  a=0
		 * false 执行结束
		 * ------运行结束。------
		 */
	}

}
