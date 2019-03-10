package practice.march.eleventh;
import java.util.Arrays;
//给定一个按非递减顺序排序的整数数组 A，
//返回每个数字的平方组成的新数组，要求也按非递减顺序排序。

public class Num977 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution4 s4 = new Solution4();
		int[] A = {-4,-1,0,3,10};
		s4.sortedSquares(A);
	}
}

class Solution4 {
    public int[] sortedSquares(int[] A) {
        int[] arr = new int[A.length];
        for(int i = 0; i < A.length; i++){
            arr[i] = A[i] * A[i];
        }
        Arrays.sort(arr); //排序
        for (int i = 0; i < arr.length; i++) {
        	System.out.println(arr[i]);
		}
        return arr;
    }
}