package day3.exercise.randomchars;

import java.util.Random;

/**
 * 
 * @author 多俊睿
 * @date 2018年7月22日 上午12:02:32 
 *
 */

//Ex0128 产生随机字符串
public class RandomChars {
	
	//生成随机字符串
	public StringBuilder randomChars;
	
	//字符串范围
	public StringBuilder charsArea;
	
	//字符串长度
	public int charsLength;
	
	
	/**无参构造
	 * 默认范围是大写字母，长度为10
	 * */
	public RandomChars() {
		
		this.setArea(Enumerate.CAP);
		this.setLength(10);
		this.creatChars();
		
	}
	
	/**
	 * 根据字符串的类型和长度生成字符串
	 * */
	public RandomChars(int length, Enumerate enu) {
		this.setArea(enu);
		this.setLength(length);
		this.creatChars();
	}
	
	/**
	 * 用户定义的字符串类型和长度输出随机字符串 
	 * */
	public RandomChars(int length, String enu) throws Exception{
		this.setArea(enu);
		this.setLength(length);
		this.creatChars();
		
	}
	
	/**
	 * 用户定义的字符串类型和长度输出随机字符串 
	 * @param length 字符串长度
	 * @param enu 字符串类型
	 * @param repeat 是否允许字符串范围有重复字符
	 * @throws Exception 当输入的字符串范围为空时抛出此异常 （参考）
	 */
	public RandomChars(int length, String enu , boolean repeat) throws Exception{
		this.setArea(repeat,enu);
		this.setLength(length);
		this.creatChars();
		
	}
	
	/**
	 * 
	 * @param length 设置字符串长度
	 */
	public void setLength(int length) {
		if(length > 0) {
			this.charsLength=length;
		}
		
	}
	
	/**
	 * 
	 * @param enu 设置字符串范围
	 */
	public void setArea(Enumerate enu) {
		
		if(this.charsArea == null) {
			
			this.charsArea = new StringBuilder();
		}
		
		this.charsArea.setLength(0);//清零操作
		this.charsArea.append(enu.toString());
		
	}
	
	//设置字符串范围
	public void setArea(String area) throws Exception {
		if (this.charsArea == null) {
			this.charsArea = new StringBuilder();
		}
		this.charsArea.setLength(0);
		if(area.length() > 0) {
			this.charsArea = new StringBuilder(area);
		}else {
			throw new Exception("输入的字符串不能为空！");
		}
	}
		
	public void setArea(boolean repeat, String area) throws Exception {
			
		this.charsArea.setLength(0);
		if (repeat) {
			this.charsArea = new StringBuilder(area);
		} else {
			if(area.length() > 0) {
				for (int i = 0; i < area.length(); i++) {
					if (this.charsArea.toString().indexOf(area.charAt(i)) == -1) {
						this.charsArea.append(area.charAt(i));
					}
				}
			}else {
				throw new Exception("输入的字符串不能为空！");
			}
		}
	}
	
	
	/**
	 * 获取生成随机字符串的范围
	 * @return
	 */
	public String getArea() throws Exception{
		if (this.charsArea != null && this.charsArea.length() > 0 ) {
			
			return this.charsArea.toString();
			
		}else {
			throw new Exception("输入的字符串不能为空！");
		}
		//return null;
	}
	
	/**
	 * 
	 * @return 获取生成的字符串
	 * @throws Exception 输入的字符串不能为空
	 */
	public String getChars() throws Exception{
		if (this.randomChars != null && this.randomChars.length() > 0) {
			return this.randomChars.toString();
		}else {
			throw new Exception("输入的字符串不能为空！");
		}
		
	}
	
	/**
	 * 删除一段字符串
	 * @param deleteChars 删除字符串
	 * @throws Exception
	 */
	public void deleteChar(String deleteChars) throws Exception{
		
		if (this.charsArea != null || this.charsArea.length() > 0) {
			for(char c : deleteChars.toCharArray()) {
				if(this.charsArea.toString().indexOf(c)!=-1) {
					this.charsArea.deleteCharAt(this.charsArea.toString().indexOf(c));
				}
			}
		}else {
			throw new Exception("输入的字符串不能为空！");
		}
	}
	
	/**
	 * 生成随机字符串
	 */
	public void creatChars() {
		if (this.randomChars == null) {
			this.randomChars = new StringBuilder();
		}
		Random rd = new Random();
		this.clear();
		for (int i = 0; i < this.charsLength; i++) {
			
			if (this.charsArea != null || this.charsArea.length() > 0) {
				
				randomChars.append(this.charsArea.charAt(rd.nextInt(this.charsArea.length())));
			}
		}
	}
	
	/**
	 * 获取字符串长度
	 * @return
	 */
	public int getLenght() {
		return this.charsLength;
	}
	
	/**
	 * 清空随机字符串
	 */
	public void clear() {
		this.randomChars.setLength(0);
	}
}

	

	
//	public void RandomChars(String str) {
//		this.str = str;
//		
//	}
//	
//	public String getName() {
//		
//		return str;
//		
//	}
//	
//	public void addEnu(Enumerate enu) {
//		
//		str = enu.getName() + str;
//		
//	}
//	
//	//添加输入的字符串
//	public void addEnu(String str) {
//		
//		this.str = this.str + str;
//		
//	}
//	
//	
//	//随机字符串长度
//	public int length() {
//		
//		int i = str.length();
//		return i;
//	}
//		
//		
//	}


