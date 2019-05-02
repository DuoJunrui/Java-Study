package day8.study;

/**
 * 实现Runnable接口实现线程创建
 * @author 多俊睿
 * @date 2018年7月26日 上午9:54:51 
 *
 */
public class DisplayMessage implements Runnable {
	
	private String message;
	
	public DisplayMessage(String message) {
		
		this.message = message;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			System.out.println("实现Runnable接口实现线程创建");
		}
		
	}
}
