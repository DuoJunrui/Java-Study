package practice.march.eleventh;
/**
 * @author: 多俊睿
 * @data: 2019年3月11日 下午9:49:49
 * @Description: 709. 转换成小写字母
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，
 * 并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 */
public class ToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution5 s5 = new Solution5();
		System.out.println(s5.toLowerCase("Hello"));
	}

}

class Solution5 {
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }
}