package part3.se.day10.collection;
/**
 * @author: 多俊睿
 * @data: 2019年3月20日 下午2:11:37
 * @Description: 使用当前类作为集合元素，测试集合操作元素的相关方法
 */
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj instanceof Point) {
			Point p = (Point)obj;
			return this.x==p.x && this.y==p.y;
		}
		return false;
	}
	
	public String toString() {
		return "("+x+","+y+")";
		
	}
}
