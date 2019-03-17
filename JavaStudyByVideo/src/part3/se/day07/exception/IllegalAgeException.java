package part3.se.day07.exception;
/**
 * @author: 多俊睿
 * @data: 2019年3月17日 下午11:20:30
 * @Description: 自定义 年龄不合法异常
 * 自定义异常通常用来说明某些业务逻辑错误
 */
public class IllegalAgeException extends Exception {

	/**
	 * @Fields
	 * @author: 多俊睿
	 * @data: 2019年3月17日 下午11:22:22
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	public IllegalAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	

}
