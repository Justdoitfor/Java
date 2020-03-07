package practice.Extends;
/*
在父子类继承关系中，创建子类对象，访问成员方法规则：
创建对象是谁，就优先使用谁，没有则向上找
注意事项：
无论是成员方法还是成员变量，如果没有都是向上找父类，绝不会向下找子类

重写、覆盖（override）：在继承关系中，方法名一样，参数列表也一样
特点：创建的是子类对象，就优先使用子类方法
重载（overload）：方法名一样，参数列表不一样

 */
public class Demo04ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodF();
        zi.methodZ();
        zi.methodTest();  // new 的是子类对象，所以优先使用子类方法
    }
}
