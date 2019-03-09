package practice.march.eleventh;
/**
 * @author: 多俊睿
 * @data: 2019年3月9日 下午3:19:56
 * @Description: 来自牛客网
 */
public class Base
{
    private String baseName = "base";
    public Base()
    {
        callName();
    }
 
    public void callName()
    {
        System. out. println(baseName);
    }
 
    static class Sub extends Base
    {
        private String baseName = "sub";
        public void callName()
        {
            System. out. println (baseName) ;
        }
    }
    public static void main(String[] args)
    {
        Base b = new Sub();
    }
}