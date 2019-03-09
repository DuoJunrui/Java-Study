package part2.oop.project.game;
import java.util.Random;
import java.awt.image.BufferedImage;
/**
 * @author: 多俊睿
 * @data: 2019年3月5日 下午3:20:40
 * @Description: 小蜜蜂 得奖励
 */
public class Bee extends FlyingObject implements Award{
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
		awardType = rand.nextInt(2); //0或者1
	}
	
	//step()重写
	public void step(){
		x+=xSpeed;
		y+=ySpeed;
		if (x<=0 || x>=World.WIDTH-this.width) { //到窗口两边 切换移动方向
			xSpeed*=-1;
		}
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
	
	public boolean outOfBounds() {
		return this.y>=World.HEIGHT; //小蜜蜂的y>=窗口的高，就超出窗口了
	}
	
	//重写 获取奖励接口的抽象方法
	public int getAwardType() {
		return awardType;
	}
	
}
