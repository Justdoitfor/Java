package practice.Multi;
/*
代码当中体现：其实就是-> 父类引用指向子类对象
格式；
父类名称 对象名 = new 子类名称();
或者：
接口名称 对象名 = new 实现类名称();

口诀：
成员方法: 编译看左边，运行看右边
成员变量：编译看左边，运行看左边
 */
public class Demo01Multi {
    public static void main(String[] args) {
        // 使用多态的写法
        Fu obj = new Zi();  // 左侧父类的引用，指向了右侧子类的对象
        obj.method();
        obj.methodFu();
        System.out.println("---------分割线----------");
        // 使用多态的写法,好处：无论右边调用哪个方法，左边调用方法都不会变化
        Fu test1 = new Zi();
        Fu test2 = new Zi2();
        test1.method();
        test2.method();
        System.out.println("-------------------------");
        // 不使用多态的写法
        Zi test01 = new Zi();
        Zi2 test02 =new Zi2();
        test01.method();
        test02.method();
    }
}
