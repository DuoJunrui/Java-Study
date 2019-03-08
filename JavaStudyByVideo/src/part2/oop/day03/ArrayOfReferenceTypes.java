package part2.oop.day03;
/**
 * @author: 多俊睿
 * @data: 2019年3月6日 上午9:39:44
 * @Description: 引用类型数组
 */
public class ArrayOfReferenceTypes {

	public static void main(String[] args) {
		
		Student[] stus = new Student[3];
		stus[0] = new Student();
		stus[1] = new Student("Kitty", "美国");
		stus[2] = new Student("Djr", 23, "广西桂林");
		
		
		Student[] ss = new Student[] {
			new Student("zahngsan", "GuiLin"),
			new Student("LIsi", 224, "GANSU")
		};
		
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[4];
		
		arr[1][0] = 100;
		
		int[][] as = new int[3][4];
		for (int i = 0; i < as.length; i++) {
			for (int j = 0; j < as[i].length; j++) {
				as[i][j] = (int)(Math.random()*100);
			}
		}
		for (int i = 0; i < as.length; i++) {
			for (int j = 0; j < as[i].length; j++) {
				System.out.println(as[i][j]);
			}
		}
		
	}

}
