package part3.se.day02.string;
/**
 * @author: 多俊睿
 * @data: 2019年3月12日 下午2:46:13
 * @Description: String 支持正则表达式方法二：
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分
 * 返回所有被拆分后的部分
 */
public class SplitDemo {

	public static void main(String[] args) {
		String str = "123abc456sdfvv45ffk5t123";
		/**
		 * 按照数字部分进行拆分，就是把数字字符去掉
		 * abc sdfvv ffk t
		 */
		
		//String[] array = str.split("[0-9]+"); //[0-9]+
			/*运行结果如下：若果开头有数字会拆成一个空的数组
			 * length:5
				
				abc
				sdfvv
				ffk
				t
			 */
		String[] array = str.split("[0-9]");  // [0-9]  没加号
			/**运行结果如下，如果末尾有数字，会舍弃不要。隔一个数字一个空数组
			 * length:10

					
					
					abc
					
					
					sdfvv
					
					ffk
					t

			 */
		
		System.out.println("length:"+array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		/**
		 * 图片重命名
		 * 同样StringBuilder也可以实现重命名 replace
		 */
		String image = "photo.jpg";
		String[] names = image.split("\\.");
		image = System.currentTimeMillis()+"."+names[1];
		System.out.println(image);

	}

}
