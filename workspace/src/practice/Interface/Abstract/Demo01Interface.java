package practice.Interface.Abstract;
/*
接口就是多个类的公共规范
接口是一种引用数据类型，最重要的是其中的抽象方法
定义格式：
public interface 接口名称{
    // 接口内容
}
备注:
如果是java7：
接口可以包含的内容：
1.常量
2.抽象方法
如果是java8，接口额外包含：
3.默认方法
4.静态方法
如果是java9，接口额外包含：
5.私有方法

使用：
1.接口不能直接使用，必须有一个【实现类】来实现接口
public class 实现类名 implements 接口名称{...}
2.接口实现类必须覆盖重写（实现）接口中的所有抽象方法
去掉abstract关键字，加上方法体大括号
3.创建实现类对象，进行调用
4.接口中的静态方法，不使用实现类创建对象调用，而是直接通过接口调用  接口名称.静态方法（参数）；

注意事项：
如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己必须为抽象类

 */


public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();

    }
}
