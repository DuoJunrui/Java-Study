package part2.oop.project.game;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.imageio.ImageIO;
import java.awt.Graphics;
/**
 * @author: 多俊睿
 * @data: 2019年3月6日 下午2:36:53
 * @Description: 继承的使用   超类--->派生类
 */
//超类（基类、父类）  //加了abstract 就是抽象类  抽象类不能被实例化  就是不能new出来
public abstract class FlyingObject {
	//设计状态常量(生存、死亡、删除)
	public static final int LIFE = 0;
	public static final int DEAD = 1;
	public static final int REMOVE = 2;
	protected int state = LIFE; //当前状态默认为生存状态
	
	/*成员变量 */ //超类里面的数据一般用protected 保护
	protected int width;  //宽度
	protected int height; //高度
	protected int x;      //x坐标轴
	protected int y;      //y坐标轴
	
	/*专门给英雄机、背景天空、子弹提供的父类有参构造方法*/
	public FlyingObject(int width, int height, int x, int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	/*专门给小敌机、大敌机、小蜜蜂提供的父类有参构造方法*/
	public FlyingObject(int width, int height) {
		this.width = width;
		this.height = height;
		Random rand = new Random();
		x = rand.nextInt(World.WIDTH-this.width);
		y = -this.height;
	}
	
	//飞行物移动  
	//所有的派生类将超类的step()重写了，所以方法体写着没有意义  将这种方法就叫做抽象方法
	//只有定义，但超类没有实现
	public abstract void step();
	
	//读取图片    读取图片与对象无关，只与传入的参数有关，适合static
	public static BufferedImage loadImage(String fileName) {
		try {
			BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName));
			return img;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	//设置抽象方法getImage()来获取读到的图片
	public abstract BufferedImage getImage();
	
	//排断是否活着
	public boolean isLife() {
		return state==LIFE;
	}
	//排断是否死亡
	public boolean isDead() {
		return state==DEAD;
	}
	//排断是否删除
	public boolean isRemove() {
		return state==REMOVE;
	}
	
	//画对象的图片  谁调这个方法，就是谁的图片和坐标
	public void paintObject(Graphics g) {
		g.drawImage(getImage(),x,y,null);
	}
	
	//检测飞行物是否越界，优化数组存的数据，防止数组存的太多
	public abstract boolean outOfBounds();
	
	/*物体碰撞算法 this：敌人 ，  other：子弹/英雄机 */
	public boolean hit(FlyingObject other) {
		int x1 = this.x-other.width;  //x1:敌人的x - 子弹的宽
		int x2 = this.x+this.width;   //x2:敌人的x + 敌人的宽
		int y1 = this.y-other.height; //y1:敌人的y - 子弹的高
		int y2 = this.y+this.height;  //y2:敌人的y + 敌人的高
		int x = other.x;  //x:子弹的x
		int y = other.y;
		return x>=x1 && x<=x2 && y>=y1 && y<=y2;
	}
	
	public void goDead() {
		state = DEAD; //将对象状态修改为死亡状态
	}
}
