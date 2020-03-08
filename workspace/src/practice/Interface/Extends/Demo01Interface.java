package practice.Interface.Extends;
/*
使用接口时候，需注意：
1.接口时没有静态代码块、构造方法的
2.一个类的直接父类是唯一的，但一个类可以同时实现多个接口
格式：
public class MyInterfaceInpl implements MyInterfaceA,MyInterfaceB{
    // 覆盖重写所有抽象方法
}
3.如果实现类所实现的多个接口中，存在重复的抽象方法，那么只需一次覆盖重写即可
4.如果实现类没有覆盖重写所有接口中的所有抽象方法，那么实现类必须是一个抽象类
5.如果实现类所实现的多个接口中，存在重复的默认方法，那么实现类一定要对冲突的默认方法覆盖重写
6.如果直接父类中的方法和接口中的默认方法产生了冲突，优先使用父类中的方法

 */
public class Demo01Interface {
}
