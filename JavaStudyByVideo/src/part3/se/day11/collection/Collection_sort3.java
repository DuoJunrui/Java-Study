package part3.se.day11.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月26日 下午3:20:55
 * @Description: 使用Collections.sort()排序会存在一些不足之处
 * 1、该方法要求集合元素必须实现Comparable接口，这在实际开发中是不太可取的，
 * 因为该功能会对我们写的代码有侵入性
 * 所谓侵入性是指：当我们调用某个功能时，该功能要求我们为其修改代码，修改的地方越多，侵入性越高。
 * 不利于程序拓展和后期维护。
 * 
 * 2、若元素已经实现了comparable接口，并定义了比较规则，
 * 但是该排序规则不满足我们排序的需求时，该方法就无法使用。
 * 比如排序字符串，只能按照字符流unicode编码排序。
 * 排序中文时则没有什么意义。
 */
public class Collection_sort3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("多俊睿");
		list.add("黄虎林");
		list.add("王浩淼");
		list.add("赵晓龙");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		

	}

}
