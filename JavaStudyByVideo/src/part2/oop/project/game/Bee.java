package part2.oop.project.game;
import java.util.Random;
import java.awt.image.BufferedImage;
/**
 * @author: 多俊睿
 * @data: 2019年3月5日 下午3:20:40
 * @Description: 小蜜蜂 得奖励
 */
public class Bee extends FlyingObject{
	private static BufferedImage[] images;
	static {
		images = new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[i] = loadImage("bee"+i+".png");
		}
	}
	 
	private int xSpeed; //x轴移动速度
	private int ySpeed; //y轴移动速度
	private int awardType; //奖励类型（火力值，生命）
	
	public Bee() {
		super(60, 50);
		xSpeed = 1;
		ySpeed = 2;
		Random rand = new Random();
		awardType = rand.nextInt(2);
	}
	
	//大敌机移动的速度  step()重写
	public void step(){
		System.out.println("小蜜蜂的x坐标移动了"+xSpeed+"，y坐标移动了"+ySpeed);
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
