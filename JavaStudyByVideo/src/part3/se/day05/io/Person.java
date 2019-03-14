package part3.se.day05.io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author: 多俊睿
 * @data: 2019年3月14日 下午9:37:32
 * @Description: 使用当前类的实例测试对象流读写对象的操作
 * 
 * 当一个类的实例要被对象流进行读写时，
 * 该类必须实现Serializable接口
 * 
 * Serializable查看源码，里面什么都没有，这种叫签名接口（可序列化接口），
 * java基础---->Serializable的使用 - huhx - 博客园
		https://www.cnblogs.com/huhx/p/serializable.html
 */
public class Person implements Serializable {
	/**
	 * The serializable class Person does not declare a static final serialVersionUID field of type long
	 * @Fields
	 * @author: 多俊睿
	 * @data: 2019年3月14日 下午10:32:00
	 * @Description: 当一个类实现了Serializable接口后，应当定义一个常量：serialVersionUID
	 * 这个常量是序列化版本号。
	 * 若不指定，编译器会在编译时按照当前类的结构，生成一个版本号。但是如果类的结构发生改变，版本号也会跟着改变。
	 * 序列化版本号直接影响对象输入流进行反序列化是否能够成功。
	 * 当反序列化的对象对当前类版本号一直，那么反序列化成功，否则反序列化时会抛出异常。
	 * 若当前类结构发生了变化，只要版本号没有改变，那么反序列化时会将仍然有的属性进行还原。
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	
	/**
	 * 当一个属性使用transient修饰后，那么在进行序列化时，该属性的值会被忽略。
	 * 忽略不必要的属性可以达到对象序列化的"瘦身"操作。
	 */
	private transient String[] otherInfo; //transient 对象存储时，他的值不需要维持，即不保存
	public Person(String name, int age, String gender, String[] otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}

	public String toString() {
		return name+","+age+","+gender+","+Arrays.toString(otherInfo);
	}

}
