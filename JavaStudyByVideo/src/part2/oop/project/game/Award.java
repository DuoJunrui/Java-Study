package part2.oop.project.game;
/**
 * @author: 多俊睿
 * @data: 2019年3月9日 下午2:19:13
 * @Description: 奖励接口
 */
public interface Award {
	public static final int DOUBLE_FIRE = 0; //火力值
	public int LIFE = 1;  //命
	public int getAwardType();//获取奖励类型  
}
