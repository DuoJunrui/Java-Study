package part2.oop.project.game;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
/**
 * @author: 多俊睿
 * @data: 2019年3月5日 下午4:06:55
 * @Description: 飞机大战游戏主程序窗口
 */
public class World extends JPanel {  //窗口
	
	//常量
	public static final int WIDTH = 400; //窗口的宽
	public static final int HEIGHT = 700; //窗口的高
	
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
	
	//启动程序的执行
	public void action() {
		
		Timer timer = new Timer(); //定时器对象 util.Timer
		
		int intervel = 10; //定时的间隔 以毫秒为单位
		//timer.schedule(task, firstTime, period); //下面的就是这句话
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() { //定时干的事
				enterAction(); //敌人入场（小敌机、大敌机、蜜蜂）
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
