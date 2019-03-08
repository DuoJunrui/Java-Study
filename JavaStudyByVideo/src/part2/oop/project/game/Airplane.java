package part2.oop.project.game;
import java.awt.image.BufferedImage;
/**
 * @author: 多俊睿
 * @data: 2019年3月5日 下午3:12:41
 * @Description: 小敌机
 */
//继承超类FlyingObject{}
public class Airplane extends FlyingObject{
	private static BufferedImage[] images; //注意，多张图片，建议做成数组形式
	static {
		images = new BufferedImage[5];
		//给5张图片赋值
		for (int i = 0; i < images.length; i++) {
			images[i] = loadImage("airplane" +i+ ".png");
		}
	}
	
	private int speed;
	public Airplane() {
		super(49, 36);
		speed = 2;
	}
	
	//小敌机移动的速度  step()重写
	public void step(){
		y+=speed; //y+（表示向下移动）
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
			/**
			 * 死了的过程：
			 * 10m img = images[1] deadIndex=2 返回image[1]
			 * 20m img = images[2] deadIndex=3 返回image[2]
			 * 30m img = images[3] deadIndex=4 返回image[3]
			 * 40m img = images[4] deadIndex=5 if(true) state = REMOVE
			 * 50m false  false 返回null
			 */
		}
		return null;
	}
		
}
