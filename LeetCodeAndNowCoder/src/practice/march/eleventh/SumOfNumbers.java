package practice.march.eleventh;
import java.util.HashMap;
import java.util.Map;

/*1.两数之和
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
*/
public class SumOfNumbers {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {2,7,11,15};
		int target = 9;
		solution.twoSum(nums, target);
		
	}

}

//解决方法一
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (target == (nums[j] + nums[i])) {
					System.out.println("[" +i+ "," +j+ "]");
					return new int[] {i,j};
				}
			}
		}
        throw new IllegalArgumentException("无结果");
    }
} 

//解决方法二
class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(length);
        for (int i=0; i<length; i++) {
            map.put(nums[i], i);
        }
        for (int i=0; i<length; i++) {
            int s = target - nums[i];
            if (map.containsKey(s) && i != map.get(s)) {
                return new int[]{i, map.get(s)};
            }
        }
        return new int[0];
    }
}
