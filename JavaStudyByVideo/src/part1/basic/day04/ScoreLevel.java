package part1.basic.day04;
import java.util.Scanner;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月1日 下午11:27:21
 * @Description: TODO
 */
public class ScoreLevel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入您的成绩：");
		double score = scan.nextDouble();
		System.out.println("您的成绩是："+score+"分。");
		
		//此代码优化，注意书写规范，可以作为例子来看 简化代码
		if (score<0 || score>100) {
			System.out.println("对不起，您输入的成绩有误！");
		}else if (score>=90) {
			System.out.println("A-优秀");
		}else if (score>=80) {
			System.out.println("B-良好");
		}else if (score>=60) {
			System.out.println("C-合格");
		}else {
			System.out.println("D-不及格");
		}

		scan.close();
	}
	
}
