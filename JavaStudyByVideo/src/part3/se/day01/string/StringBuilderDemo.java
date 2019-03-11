package part3.se.day01.string;
/**
 * @author: 多俊睿
 * @data: 2019年3月11日 下午8:56:34
 * @Description: 
 * StringBuilder是专门设计用来修改字符串内容的。
 * 内部维持一个可变的字符数组。开销小，性能好。
 * 所以，凡是有频繁修改字符串内容操作的时候，都应该使用StringBuilder来完成。
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		
		//默认创建的StringBuilder表示一个空字符串
		StringBuilder builder = new StringBuilder("好好学习");
		String str = builder.toString();
		System.out.println(str);
		
		//append方法用于追加给定字符串
		builder.append("，天天向上。");
		str = builder.toString();
		System.out.println(str);

		//replace替换部门内容
		builder.replace(5, 9, "热爱Java");
		str = builder.toString();
		System.out.println(str);
		
		//delete删除指定范围内的字符串
		builder.delete(0, 5);
		str = builder.toString();
		System.out.println(str);
		
		//insert将给定内容插入到指定位置
		builder.insert(0, "今天是三月十一日，");
		str = builder.toString();
		System.out.println(str);
	}

}
