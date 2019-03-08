package part2.oop.project.game;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
/**
 * @author: 多俊睿
 * @data: 2019年3月5日 下午3:21:48
 * @Description: 背景 天空
 */
public class Sky extends FlyingObject{
	private static BufferedImage image;
	static {
		image = loadImage("background.png");
	}
	
	private int speed;
	private int y1; //两张背景图的切换，实现连续效果
	
	//构造方法
	public Sky() {
		super(World.WIDTH, World.HEIGHT, 0, 0);
		speed = 1;
		y1 = -this.height;
	}
	
	//背景  step()重写
	public void step(){
		y+=speed;
		y1+=speed;
		if (y>=World.HEIGHT) {
			y=-World.HEIGHT;
		}
		if (y1>=World.HEIGHT) {
			y1=-World.HEIGHT;
		}
	}
	
	//重写获取图片的方法
	public BufferedImage getImage() {
		return image;
	}
	
	//画对象的图片  重写
	public void paintObject(Graphics g) {
		g.drawImage(getImage(),x,y,null);
		g.drawImage(getImage(),x,y1,null);
	}
	
		
}
