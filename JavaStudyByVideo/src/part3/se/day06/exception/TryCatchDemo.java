package part3.se.day06.exception;
/**
 * @author: 多俊睿
 * @data: 2019年3月15日 下午2:47:26
 * @Description: 异常处理机制 try-catch
 * 语法：
 * try{
 * 		代码片段
 * }catch(xxxException e){
 * 		捕获try代码片段中出现的xxxException后的处理手段
 * }
 */
public class TryCatchDemo {

	public static void main(String[] args) {
		System.out.println("程序开始了！！！");
		
		try {
			String str = "";
			/**
			 * 当jvm执行代码时遇到异常，会实例化该异常的一个实例，
			 * 然后设置好代码执行的过程，并将该异常抛出。
			 * 如果抛出异常的代码所在方法没有处理异常的能力，
			 * 异常会抛到当期方法之外，由调用当前方法的代码片段去处理。
			 */
			System.out.println(str.length()); 
			//try代码片段中出现异常后，下面的代码不再执行，如果没有出错则执行
			
			System.out.println(str.charAt(0));
			
			System.out.println("出错后的代码不再执行");
			
		} catch (NullPointerException e) {
			System.out.println("--------出现空指针异常！------------");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("------出现字符串下标越界异常！-------");
		}catch (Exception e) {
			System.out.println("出现未知错误");
		}
		/**
		 * 应当有一个好习惯，在最后一个catch中捕获Exception,
		 * 尽量避免因为一个未捕获的异常导致程序中断。
		 * 捕获异常顺序应该是子类型异常在上面先捕获，
		 * 父类型异常在最后捕获。
		 */
		
		System.out.println("程序结束了");
	}

}
