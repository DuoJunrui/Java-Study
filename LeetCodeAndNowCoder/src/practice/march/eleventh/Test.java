package practice.march.eleventh;

class Cc {
    Cc() {
        System.out.print("C");
    }
}
 
class Aa {
    Cc c = new Cc();
 
    Aa() {
        this("A");
        System.out.print("A");
    }
 
    Aa(String s) {
        System.out.print(s);
    }
}
 
class Test extends Aa {
    Test() {
        super("B");
        System.out.print("B");
    }
 
    public static void main(String[] args) {
        new Test();
    }
}

/*
初始化过程是这样的： 
1.首先，初始化父类中的静态成员变量和静态代码块，按照在程序中出现的顺序初始化； 
2.然后，初始化子类中的静态成员变量和静态代码块，按照在程序中出现的顺序初始化； 
3.其次，初始化父类的普通成员变量和代码块，在执行父类的构造方法；
4.最后，初始化子类的普通成员变量和代码块，在执行子类的构造方法； 
 
（1）初始化父类的普通成员变量和代码块，执行 Cc c = new Cc(); 输出C 
（2）super("B"); 表示调用父类的构造方法，不调用父类的无参构造函数，输出B 
（3） System.out.print("B"); 
 所以输出CBB
*/