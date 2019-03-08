package part1.basic.day05;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月2日 下午7:16:59
 * @Description: 九九乘法表
 */
public class MultiTable {

	public static void main(String[] args) {
		
		//嵌套循环，实现多个数字的乘法表
		for (int num = 1; num <=9; num++) {
			
			//实现单个数字的乘法表
			for (int i = 1; i <=num; i++) {
				System.out.print(i+"*"+num+"="+ i*num + "\t");// "\t"为对齐制表符
			}
			System.out.println();//换行
		}
		
	}

}
