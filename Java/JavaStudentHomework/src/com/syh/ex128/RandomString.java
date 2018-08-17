package com.syh.ex128;

import java.util.Random;

/**
 * 该类用于产生随机字符串，用以填入需要的文本框中。通过类中提供的方法，向字符串池中添加模型，
 * 也可以自定义需要添加的字符串，向字符串池中添加模型。<br/>
 * <b><i>NOTE:字符串池即为产生随机字符串的范围</i></b>
 * 
 * @author 彭宇琦
 * @version V1.8
 */

public class RandomString {
	// 用于定义随机字符串产生的范围
	private StringBuilder stringSeed = new StringBuilder("");
	
	/**
	 * 指向StringMode枚举类，可通过该属性向字符串池中添加模型
	 */
	public StringMode mode;
	
	/**
	 * 初始化字符串池，使其不包含任何元素
	 */
	public RandomString() {
	}

	/**
	 * 通过预设模型模型对字符串池进行初始化
	 * 
	 * @param modes
	 *            需要加入字符串池中的模型（为StringMode枚举对象）
	 */
	public RandomString(StringMode... modes) {
		addMode(modes);
	}
	
	/**
	 * 通过自定义的字符串对字符串池进行初始化
	 * 
	 * @param modes
	 *            需要加入字符串池中的模型（为StringMode枚举对象）
	 */
	public RandomString(String mode) {
		addMode(mode);
	}

	/**
	 * 该方法用于返回字符串池
	 * 
	 * @return 用于返回随机字符串生成的范围
	 */
	public String getStringSeed() {
		return stringSeed.toString();
	}
	
	/**
	 * 该方法用于向字符串池中添加模型，通过该方法添加的模型将不检查字符串池中是否存在与之重复的元素
	 * @param modes 需要加入到字符串池中的模型
	 */
	public void addMode(StringMode... modes) {
		for (StringMode m : modes) {
			stringSeed.append(m.getSeed());
		}
	}
	
	/**
	 * 该方法用于向字符串池中添加模型，且通过isRepeat进行判断是否允许添加可重复的字符串进入字符串池
	 * 
	 * @param isRepeat 字符串池中的元素是否可重复
	 * @param mode 需要加入到字符串池中的模型
	 */
	public void addMode(boolean isRepeat, StringMode... modes) {
		//判断传入的参数是否允许字符串池中元素重复，若为true，则等同于调用addMode(StringMode... modes)
		if ( !isRepeat ) {
			//循环，读取所有传入的模型
			for ( StringMode m : modes ) {
				//判断模型整体是否已经存在，若存在则不进行添加
				if ( stringSeed.indexOf(m.getSeed()) > -1 ) {
					continue;
				}
				
				packageString(m.getSeed());
			}
		} else {
			addMode(modes);
		}
	}
	
	/**
	 * 该方法用于向字符串池中添加自定义的字符串，通过该方法添加的字符串将不检查字符串池中是否存在与之重复的元素
	 * @param mode 需要加入到字符串池中的模型
	 */
	public void addMode(String mode) {
		stringSeed.append(mode);
	}
	
	/**
	 * 该方法用于向字符串池中添加自定义的字符串，且通过isRepeat进行判断是否允许添加可重复的字符串进入字符串池
	 * 
	 * @param isRepeat 字符串池中的元素是否可重复
	 * @param mode 需要加入到字符串池中的模型
	 */
	public void addMode(boolean isRepeat, String mode) {
		//判断传入的参数是否允许字符串池中元素重复，若为true，则等同于调用addMode(StringMode... modes)
		if ( !isRepeat ) {
			//判断模型整体是否已经存在，若存在则不进行添加
			if ( stringSeed.indexOf(mode) > -1 ) {
				return;
			}
			
			packageString(mode);
		} else {
			addMode(mode);
		}
	}

	/**
	 * 该方法用于清空StringSeed中存储的随机字符串生成范围
	 */
	public void clear() {
		stringSeed.replace(0, (stringSeed.length()), ""); // 将随机字符串生成范围清空
	}

	/**
	 * 该方法用于返回StringSeed的长度（随机字符串生成范围的长度）
	 * 
	 * @return 返回随机字符串生成范围StringSeed的长度
	 */
	public int length() {
		return stringSeed.length();
	}

	/**
	 * 该类用于在随机字符串生成范围中删除由用户指定的所有符合条件的字符串
	 * 
	 * @param str
	 *            用户指定需要从随机字符串生成范围中删除的字符串
	 * @return 返回删除的状态，true表示删除成功，false表示删除失败
	 * @see #remove(int)
	 * @see #remove(int, int)
	 */
	public boolean remove(String str) {
		// 判断StringSeed是否为空，为空则返回false
		if (stringSeed.length() == 0) {
			return false;
		}

		// 判断用户指定需要移除的字符串是否为空，如果为空，则返回false
		if (str.equals("") || str == null) {
			return false;
		}

		// 用于存储在StringSeed中查找到包含用户指定指定字符串str的位置
		int StartPos = stringSeed.indexOf(str);

		// 判断整个StringSeed中是否包含指定的字符串，没有找到，则返回false
		if (StartPos < 0) // 如果无法找到与Char相匹配的字符串
		{
			return false; // 删除失败，返回false
		}

		// 循环，在StringSeed中移除指定的字符串
		while (StartPos > 0) {
			stringSeed.delete(StartPos, StartPos + str.length());// 在StringSeed中移除指定的字符串
			StartPos = stringSeed.indexOf(str, StartPos);// 重新查找StringSeed是否还包含str
		}

		return true;// 删除结束，返回true
	}

	/**
	 * 该类用于在随机字符串生成范围中删除由用户指定范围内（字符串的位置是从0开始）的字符串<br/>
	 * note：指定的范围中，删除的元素包括起始位置的元素，但不包括结束位置的元素，例如：<br/>
	 * &nbsp;&nbsp;&nbsp;&nbsp; StringSeed.append("0123456789");<br/>
	 * &nbsp;&nbsp;&nbsp;&nbsp; remove(0, 3);<br/>
	 * &nbsp;&nbsp;&nbsp;&nbsp; System.out.println(StringSeed.toString());<br/>
	 * 输出结果为：<br/>
	 * 3456789
	 * 
	 * @param startPos
	 *            表示用户指定范围的起始位置（包括该位置的元素）
	 * @param endPos
	 *            表示用户指定范围的结束位置（不包括该位置的元素）
	 * @return 返回删除的状态，true表示删除成功，false表示删除失败
	 * @see #remove(int)
	 * @see #remove(String)
	 */
	public boolean remove(int startPos, int endPos) {
		// 判断StringSeed是否为空，为空则返回false
		if (stringSeed.length() == 0) {
			return false;
		}

		// 判断用户指定开始位置是否大于结束位置，大于则返回false
		if (startPos > endPos) {
			int temp = startPos;
			startPos = endPos;
			endPos = temp;
		}

		// 判断用户指定位置是否符合StringSeed的范围，不符合则返回false
		if (startPos < 0 || endPos > stringSeed.length()) {
			return false;
		}

		stringSeed.delete(startPos, endPos);// 删除指定位置的字符串

		return true;// 删除成功，返回true
	}

	/**
	 * 该类用于在随机字符串生成范围中删除由用户指定位置（字符串的位置是从0开始）的字符串<br/>
	 * 例如：<br/>
	 * &nbsp&nbsp&nbsp&nbsp StringSeed.append("0123456789");<br/>
	 * &nbsp&nbsp&nbsp&nbsp remove(2);<br/>
	 * &nbsp&nbsp&nbsp&nbsp System.out.println(StringSeed.toString());<br/>
	 * 输出结果为：<br/>
	 * 013456789
	 * 
	 * @param pos
	 *            表示用户指定位置
	 * @return 返回删除的状态，true表示删除成功，false表示删除失败
	 * @see #remove(String)
	 * @see #remove(int, int)
	 */
	public boolean remove(int pos) {
		// 判断StringSeed是否为空，为空则返回false
		if (stringSeed.length() == 0) {
			return false;
		}

		// 判断用户指定位置是否符合StringSeed的范围，不符合则返回false
		if (pos < 0 || pos > stringSeed.length()) {
			return false;
		}

		stringSeed.delete(pos, pos + 1);// 删除指定位置的字符串

		return true;// 删除成功，返回true
	}

	/**
	 * 该方法用于移除随机字符串生成范围中重复的字符，以达到范围中字符串不会重复的情况
	 * 
	 * @return 返回移除字符串的状态，true表示移除成功，false表示移除失败
	 * */
	public boolean removeRepetition() {
		// 判断StringSeed是否为空，为空则返回false
		if (stringSeed.length() == 0) {
			return false;
		}

		// 用于保存删除重复元素后的字符串
		StringBuilder s = new StringBuilder();

		// 循环，拆分并删除字符串重复元素
		for (int i = 0; i < stringSeed.length(); i++) {
			// 判断元素是否在s中存在，存在则不添加
			if (s.indexOf(getStringSeed().substring(i, i + 1)) > -1) {
				continue;
			}

			// 不存在的字符串，则添加进s中
			s.append(getStringSeed().substring(i, i + 1));
		}

		// 判断新字符串与原字符串是否相同，相同则说明未进行改动，返回false
		if (s.toString().equals(getStringSeed())) {
			return false;
		}

		clear();// 调用clear()，清空StringSeed
		stringSeed.append(s.toString());// 将s中的元素放入StringSeed中
		return true;//
	}

	/**
	 * 以默认方式返回生成的随机字符串，默认长度为6个字符
	 * 
	 * @return 生成的6个字符长度的字符串
	 * @see #toString(int)
	 * @see #toString(int, int)
	 */
	@Override
	public String toString() {
		// 判断随机字符串生成范围是否为空，为空则直接返回空字符串
		if (stringSeed.length() == 0) {
			return "";
		}

		return GenerateString(6);
	}

	/**
	 * 生成随机长度随机字符串，其长度范围由用户指定
	 * 
	 * @param stringLengthMin
	 *            随机长度的最小值
	 * @param stringLengthMax
	 *            随机长度的最大值
	 * @return 返回生成的随机字符串
	 * @see #toString()
	 * @see #toString(int)
	 */
	public String toString(int stringLengthMin, int stringLengthMax) {
		// 判断随机字符串生成范围是否为空，为空则直接返回空字符串
		if (stringSeed.length() == 0) {
			return "";
		}

		// 判断指定的字符串长度是否小于0，如果是，则返回空字符串
		if (stringLengthMin < 0) {
			return "";
		}

		// 判断指定的字符串长度最小值是否大于最大值，如果是，则返回空字符串
		if (stringLengthMax - stringLengthMin < 0) {
			return "";
		}

		return GenerateString(new Random().nextInt((stringLengthMax
				- stringLengthMin + 1))
				+ stringLengthMin); // 返回生成的字符串
	}

	/**
	 * 生成固定长度的随机字符串，其长度由用户指定
	 * 
	 * @param stringLength
	 *            随机字符串的长度
	 * @return 返回生成的随机字符串
	 * @see #toString()
	 * @see #toString(int, int)
	 */
	public String toString(int stringLength) {
		// 判断随机字符串生成范围是否为空，为空则直接返回空字符串
		if (stringSeed.length() == 0) {
			return "";
		}

		// 判断指定的字符串长度是否小于0，如果是，则返回空字符串
		if (stringLength < 0) {
			return "";
		}

		return GenerateString(stringLength); // 返回生成的字符串
	}

	/**
	 * 组装字符串生成范围，用以在不允许出现重复的情况下，对StringSeed进行修改，
	 * 在调用该方法时，会先将传参中的字符串拆分为单个字符串，分别进行判断，以 达到不添加重复字符串的目的
	 * 
	 * @param mode
	 *            待添加入StringSeed的字符串
	 * @return 返回字符串添加状态，true为添加成功，false为添加失败
	 */
	private void packageString(String mode) {
		// 循环，将Mode拆分为单个字符串，并分别与StringSeed进行对比，如果某个字符存在，则不添加该字符以保证该字符不会重复添加
		for (int i = 0; i < mode.length(); i++) {
			// 判断当前字符是否存在与StringSeed中，如果存在，则继续循环，判断下一个字符
			if (stringSeed.indexOf(mode.substring(i, i + 1)) > -1) {
				continue;
			}

			// 如果不存在拆分的字符，则将字符存入StringSeed中，并将flag定义为true
			stringSeed.append(mode.substring(i, i + 1));
		}

	}

	/**
	 * 用于生成随机字符串的核心算法，禁止外界调用
	 * 
	 * @param stringLength
	 *            指定生成的随机字符串长度
	 * @return 返回生成的随机字符串
	 * @see #toString()
	 * @see #toString(int)
	 * @see #toString(int, int)
	 */
	private String GenerateString(int stringLength) {
		String RandomString = ""; // 定义一个字符串变量，用于存储选择的字符串
		int ChooiseNumber = -1; // 定义一个整形变量，用于随机的生成数字，并用于从StringSeed中选择对应的字符
		Random RandomNumber = new Random(); // 定义一个Random变量，用于生成随机数字

		// 循环，在RandomString中放入随机字符，其循环次数决定字符串的长度
		for (int i = 0; i < stringLength; i++) {
			ChooiseNumber = RandomNumber.nextInt(stringSeed.length()); // 从0到StringSeed的总长中随机生成一个数字
			RandomString = RandomString + stringSeed.charAt(ChooiseNumber); // 将该数字在StringSeed中对应的字符赋给RandomString
		}

		return RandomString; // 返回生成的字符串
	}
}
