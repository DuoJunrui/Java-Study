package day1.exercise;

//使用穷举法并分别用for、while、do…while循环语句求出1~100之间的质数。
public class Ex0110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j;
	    for(i = 2; i < 100; i ++)
	    {
	        for(j = 2; j < i; j ++)
	        {
	            if(i%j==0) break; //可以整除， 退出循环。代表不是素数。
	        }
	        if(j == i)//没有提前退出循环，代表是素数，打印。
	            System.out.print(i+" "); //打印i值。
	    }
	     
//	    while(i<100) {
//	    	while (j<i) {
//	    		
//	    	}
//	    }
	}

}
