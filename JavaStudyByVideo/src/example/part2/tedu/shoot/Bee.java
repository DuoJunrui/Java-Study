package example.part2.tedu.shoot;
import java.awt.image.BufferedImage;
/** С�۷� */
public class Bee extends FlyingObject implements Award {
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[5];
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("bee"+i+".png");
		}
	}
	
	private int xStep; //x�����߲�
	private int yStep; //y�����߲�
	private int awardType; //��������
	
	/** ���췽�� */
	public Bee(){
		width = 60;
		height = 50;
		x = (int)(Math.random()*(World.WIDTH-this.width));
		y = -this.height;
		xStep = 1;
		yStep = 2;
		awardType = (int)(Math.random()*2);
	}
	
	/** �۷��߲�step() */
	public void step(){
		x+=xStep;
		y+=yStep;
		if(x>=World.WIDTH-this.width || x<=0){
			xStep*=-1;
		}
	}

	int deadIndex = 1;
	public BufferedImage getImage(){
		if(isLife()){
			return images[0];
		}else if(isDead()){
			BufferedImage img = images[deadIndex++];
			if(deadIndex==images.length){
				state = REMOVE;
			}
			return img;
		}
		return null;
	}
	
	public int getType(){
		return awardType;
	}
	
	public boolean outOfBounds(){
		return this.y>=World.HEIGHT;
	}
}










