package part2.oop.project.game;
import java.awt.image.BufferedImage;
/**
 * @author: 多俊睿
 * @data: 2019年3月5日 下午3:21:10
 * @Description: 英雄战斗机的子弹
 */
public class Bullet extends FlyingObject{
	/*一般将静态的放到最上面，静态的先走*/
	private static BufferedImage image;
	
	/*静态块的目的就是给静态资源初始化*/
	static {
		image = loadImage("bullet.png");
	}
	
	private int speed;
	/*构造方法*/
	public Bullet(int x,int y) {
		super(8, 14,x,y);
		speed = 3;
	}

	public void step(){
		y-=speed; //y- 表示向上移动
	}
	
	//重写获取图片的方法
	public BufferedImage getImage() {
		if (isLife()) {
			return image;
		}else if (isDead()) {
			state = REMOVE;
		}
		return null;
	}

}
