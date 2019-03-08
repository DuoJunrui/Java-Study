package part2.oop.project.game;
import java.awt.image.BufferedImage;
/**
 * @author: 多俊睿
 * @data: 2019年3月5日 下午3:16:48
 * @Description: 大敌机
 */
public class BigAirplane extends FlyingObject {
	private static BufferedImage[] images;
	static {
		images = new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[i] = loadImage("bigplane"+i+".png");
		}
	}
	
	private int speed;
	
	public BigAirplane() {
		super(69, 99);
		speed =2;
	}
	
	//大敌机移动的速度  step()重写
	public void step(){
		System.out.println("大敌机的y坐标移动了"+speed);
	}
	
	int deadIndex = 1; //死亡图片爆破下标 爆破初始从1开始
	//重写获取图片的方法
	public BufferedImage getImage() {
		if (isLife()) {
			return images[0];
		}else if (isDead()) {
			BufferedImage img = images[deadIndex++];
			if (deadIndex==images.length) {
				state = REMOVE; //第四张后就删除
			}
			return img;
		}
		return null;
	}
	
}
