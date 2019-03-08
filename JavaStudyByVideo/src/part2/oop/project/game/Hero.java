package part2.oop.project.game;
import java.awt.image.BufferedImage;
/**
 * @author: 多俊睿
 * @data: 2019年3月5日 下午3:13:38
 * @Description: 英雄战斗机
 */
public class Hero extends FlyingObject{
	private static BufferedImage[] images;
	static {
		images = new BufferedImage[2];
		for (int i = 0; i < images.length; i++) {
			images[i] = loadImage("hero"+i+".png");
		}
	}
	
	private int life; //战斗机的生命值
	private int doubleFire; //战斗机的火力值
	public Hero() {
		super(97, 124, 140, 400);
		life = 3;
		doubleFire = 0;
	}
	
	/** 英雄机随着鼠标移动 x,y:鼠标的x和y坐标*/
	public void moveTo(int x, int y) {
		this.x = x-this.width/2; //英雄机的x=鼠标的x-英雄机宽度的一半
		this.y = y-this.height/2;
	}
	
	public void step() {}
	
	int index = 0;//初始图片的序号 活着的图片下标
	//重写获取图片的方法
	public BufferedImage getImage() {
		if (isLife()) {
			return images[index++%2];
		}
		/**
		 * 活着的：index++%2  （数字 1  0   切换）
		 * 10m 返回images[0] index=1
		 * 20m 返回images[1] index=2
		 * 30m 返回images[0] index=3
		 * 40m 返回images[1] index=4
		 * 50m 返回images[0] index=5
		 * 60m 返回images[1] index=6
		 */
		
		return null;
	}
	
	/*英雄机发射子弹（生成子弹对象）*/
	public Bullet[] shoot() { //发射子弹
		int xStep = this.width/4; //英雄机的宽
		int yStep = 20;
		if (doubleFire>0) { //双倍火力值
			Bullet[] bs = new Bullet[2];
			bs[0] = new Bullet(this.x+1*xStep, this.y-yStep);
			bs[1] = new Bullet(this.x+3*xStep, this.y-yStep);
			doubleFire-=2;
			return bs;
		} else { //单倍火力值
			Bullet[] bs = new Bullet[1];
			bs[0] = new Bullet(this.x+2*xStep, this.y-yStep);
			return bs;
		}
	}
	
	public boolean outOfBounds() {
		return false; //永不越界
	}

}
