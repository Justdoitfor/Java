package practice.basicPractice;
/*
局部变量和成员变量
1.定义位置不一样
【局部变量】在方法内部
【成员变量】方法外部，直接写在类 中
2.作用范围不一样
【局部变量】只有方法内部可用
【成员变量】整个类中都可用
3.默认值不一样
【局部变量】没有默认值，如果使用需手动赋值
【成员变量】没有设置默认值，则使用默认值同数组一样
4.内存位置不一样
【局部变量】栈内存
【成员变量】堆内存
 */
public class VariableDifference {
    String name; //成员变量
    public void methodA(){
        int num = 20; //局部变量
        System.out.println(num);
        System.out.println(name); // name为成员变量有初始值，此处为null
    }
}
