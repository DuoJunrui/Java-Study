package part1.basic.day05;

public class ForDemo {

	public static void main(String[] args) {
		int sum=0;
		for (int num = 1; num <=100; num++) {
			sum = sum+num;
		}
		System.out.println("sum="+sum);
		
		/*
		 * 执行过程
		 * 
		 * 				 sum=0
		 * num=1   true  sum=0+1
		 * num=2   true  sum=0+1+2
		 * num=3   true  sum=0+1+2+3
		 * num=4   true  sum=0+1+2+3+4
		 * ···
		 * num=100 true  sum=0+1+2+3+4+···+100
		 * num=101 false 结束
		 */
	}

}
