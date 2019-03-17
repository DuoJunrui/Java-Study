package part3.se.day07.exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author: 多俊睿
 * @data: 2019年3月17日 下午5:39:18
 * @Description: 
	派生类在继承超类时会重写其方法，那么在重写超类中
	含有throws声明异常抛出的方法时，对throws的重写规则
 */
public class ThrowsDemo {

}

class Son extends ThrowsDemo {
	
//	public void dosome() throws IOException, AWTException{
//		
//	}
	
	//可以不再抛出任何异常
//	public void dosome(){
//		
//	}
	
	//可以抛出父类方法抛出的部分异常
//	public void dosome() throws IOException {
//		
//	}
	
	//可以抛出父类方法抛出异常的子类型异常
//	public void dosome() throws FileNotFoundException{
//		
//	}
	
	//不许抛出额外异常
//	public void dosome() throws SQLException{
//		
//	}
	
	//不允许抛出父类方法抛出异常的父类型异常
//	public void dosome() throws Exception{
//		
//	}
}
