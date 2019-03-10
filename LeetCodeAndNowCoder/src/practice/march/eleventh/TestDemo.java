package practice.march.eleventh;

public class TestDemo { 
    public static String output =""; 
    public static void foo(int i){ 
       try{ 
           if(i == 1){ 
              throw new Exception(); 
           } 
       }catch(Exception e){ 
           output += "2"; 
           return ; 
       }finally{ 
           output += "3"; 
       } 
       output += "4"; 
    } 
    
    public static void main(String[] args) { 
       foo(0); 
       foo(1); 
       System.out.println(output);
    } 
}

/*
解题要点：
1、try中没有抛出异常，则catch语句不执行，如果有finally语句，
	则接着执行finally语句，继而接着执行finally之后的语句；
2、try中抛出异常，有匹配的catch语句，则catch语句捕获，
	如果catch中有return语句，则要在finally执行后再执行；
*/