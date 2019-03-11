package part2.oop.project.game;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
/**
 * @author: 多俊睿
 * @data: 2019年3月5日 下午4:06:55
 * @Description: 飞机大战游戏主程序窗口
 */
public class World extends JPanel {  //窗口
	
	//常量
	public static final int WIDTH = 400; //窗口的宽
	public static final int HEIGHT = 700; //窗口的高
	public static final int START = 0;
	public static final int RUNNING = 1;
	public static final int PAUSE = 2;
	public static final int GAME_OVER = 3;
	private int state = START;
	
	private static BufferedImage start; //启动图
	private static BufferedImage pause; //暂停图
	private static BufferedImage gameover; //游戏结束图
	static { //初始化静态资源
		start = FlyingObject.loadImage("start.png");
		pause = FlyingObject.loadImage("pause.png");
		gameover = FlyingObject.loadImage("gameover.png");
	}
	
	private Sky sky = new Sky(); //天空对象
	private Hero hero = new Hero(); //英雄机对象
	
	private FlyingObject[] enemies = {
			new Airplane(),
			new BigAirplane(),
			new Bee()
	}; //敌人数组（小敌机、大敌机、蜜蜂）
	
	private Bullet[] bullets = {
			new Bullet(100, 200)
	}; //子弹数组
	
	/*生成敌人对象*/
	public FlyingObject nextOne() {
		Random ran = new Random(); //通过设计范围来控制不同敌人生成的概率
		int type = ran.nextInt(20);//0-19之间，不包括20
		if (type<4) { //0-3
			return new Bee();
		} else if(type<12) { //4-11
			return new Airplane();
		}else { //12-19
			return new BigAirplane();
		}
	}
	
	int enterIndex = 0;
	//敌人入场（小敌机、大敌机、蜜蜂）
	public void enterAction() {
		enterIndex++;
		if (enterIndex%40==0) {
			FlyingObject obj = nextOne(); //获取敌人对象
			enemies = Arrays.copyOf(enemies, enemies.length+1); //对原数组进行扩容
			enemies[enemies.length-1] = obj; //将敌人加到最后一个元素上
		}
	}
	
	int shootIndex = 0;
	/*子弹入场*/
	public void shootAction() {
		shootIndex++;
		if (shootIndex%20==0) {
			Bullet[] bs = hero.shoot();
			bullets = Arrays.copyOf(bullets, bullets.length+bs.length);//扩容（bs有几个元素，就扩大几个容量）
			System.arraycopy(bs, 0, bullets, bullets.length-bs.length, bs.length); //数组的追加
			System.out.println(bullets.length);
		}
	}
	
	//飞行物移动
	public void stepAction() {
		sky.step();
		hero.step();
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].step();;
		}
		for (int i = 0; i < enemies.length; i++) {
			enemies[i].step();
		}
	}
	
	//删除超出窗口的飞行物   （思路：不越界的留下）
	public void outOfBoundsAction() {
		int index = 0; //不越界敌人数组下标  不越界敌人个数
		FlyingObject[] enemyLives = new FlyingObject[enemies.length];
		for (int i = 0; i < enemies.length; i++) {
			FlyingObject f = enemies[i];
			if (!f.outOfBounds()) { //不越界
				enemyLives[index] = f; //将不越界敌人添加到不越界敌人数组中
				index++; //不越界敌人数组下标增一
			}
		}
		enemies = Arrays.copyOf(enemyLives, index); //将不越界敌人的数组复制到新数组中
	
		index = 0;
		FlyingObject[] enemyBullet = new FlyingObject[enemies.length];
		for (int i = 0; i < enemies.length; i++) {
			FlyingObject f = enemies[i];
			if(!f.outOfBounds()) {
				enemyBullet[index] = f;
				index++;
			}
		}
	}
	
	int score = 0; //玩家的得分
	//子弹与敌人碰撞
	public void bulletBangAction() {
		for (int i = 0; i < bullets.length; i++) { //遍历所有子弹
			Bullet b = bullets[i]; //获取每一个子弹
			for (int j = 0; j < enemies.length; j++) { //遍历所有敌人
				FlyingObject f = enemies[j]; //获取每一个敌人
				if (b.isLife() && f.isLife() && f.hit(b)) {
					b.goDead();
					f.goDead();
					
					if (f instanceof Enemy) {
						Enemy en = (Enemy)f;
						score += en.getScore();
					}
					if (f instanceof Award) {
						Award aw = (Award)f;
						int type = aw.getAwardType();
						switch (type) {
						case Award.DOUBLE_FIRE:
							hero.addDoubleFire();
							break;
						case Award.LIFE:
							hero.addLife();
							break;
						}
					}
				}
			}
		}
	}
	
	//英雄机与敌人碰撞
	public void heroBangAction() {
		for (int i = 0; i < enemies.length; i++) {
			FlyingObject f = enemies[i];
			if (hero.isLife() && f.isLife() && f.hit(hero)) {
				f.goDead();
				hero.subtractLife();
				hero.clearDoubleFire();
			}
		}
	}
	
	public void checkGameOverAction() {
		if (hero.getLife() <= 0) {  //游戏结束了
			//切换游戏结束图
			state = GAME_OVER; 
		}
	}
	
	
	//启动程序的执行
	public void action() {
		
		//侦听器
		MouseAdapter ma = new MouseAdapter() {
			//重写mouseMoved()鼠标移动事件
			public void mouseMoved(MouseEvent e) {
				if (state == RUNNING) {
					int x = e.getX();
					int y = e.getY();
					hero.moveTo(x, y);
				}
			}
			
			//重写鼠标点击事件
			public void mouseClicked(MouseEvent e) {
				switch (state) {
				case START:
					state = RUNNING;
					break;
				case GAME_OVER:
					score = 0;
					sky = new Sky();
					hero = new Hero();
					enemies = new FlyingObject[0];
					bullets = new Bullet[0];
					state = START;
					break;
				}
			}
			
			public void mouseExited(MouseEvent e) {
				if (state==RUNNING) {
					state=PAUSE;
				}
			}
			
			public void mouseEntered(MouseEvent e) {
				if (state==PAUSE) {
					state = RUNNING;
				}
			}
			
		};
		this.addMouseListener(ma);
		this.addMouseMotionListener(ma);
		
		Timer timer = new Timer(); //定时器对象 util.Timer
		
		int intervel = 10; //定时的间隔 以毫秒为单位
		//timer.schedule(task, firstTime, period); //下面的就是这句话
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() { //定时干的事
				if (state == RUNNING) {
					enterAction(); //敌人入场（小敌机、大敌机、蜜蜂）
					shootAction(); //英雄机发射子弹
					stepAction(); //飞行物移动
					outOfBoundsAction();
					bulletBangAction();
					heroBangAction(); //英雄机遇敌人碰撞
					checkGameOverAction();//检测游戏结束
				}
				repaint(); //重新画，重新调用paint()
			}
		}, intervel, intervel); //定时计划
	}
	
	/*重写超类JPanel  paint()的方法*/
	public void paint(Graphics g) {
		sky.paintObject(g); //画天空
		hero.paintObject(g); //画英雄机
		for (int i = 0; i < enemies.length; i++) { //遍历敌人数组
			enemies[i].paintObject(g);
		}
		for (int i = 0; i < bullets.length; i++) { //遍历子弹数组
			bullets[i].paintObject(g);
		}
		
		g.drawString("得分(SCORE)："+score, 10, 25);
		g.drawString("生命值(LIFE)："+hero.getLife(), 10, 45);
		
		switch (state) {
		case START:
			g.drawImage(start, 0, 0, null);
			break;
		case PAUSE:
			g.drawImage(pause, 0, 0, null);
			break;
		case GAME_OVER:
			g.drawImage(gameover, 0, 0, null);
			break;
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame(); //窗口
		World world = new World(); //面板
		frame.add(world); //将面板添加到窗口中
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置关闭窗口时退出并停止运行
		frame.setSize(WIDTH,HEIGHT); //设置窗口的宽度和高度
		frame.setLocationRelativeTo(null); //设置居中显示
		frame.setVisible(true);  //设置窗口可见  2)会自动调用超类paint()方法
		
		world.action(); //启动程序的执行
		
	}
}
