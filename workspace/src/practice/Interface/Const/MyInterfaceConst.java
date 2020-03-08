package practice.Interface.Const;
/*
接口中可以定义【成员变量】，但是必须使用public static final 三个关键字修饰
其实就是接口的常量
格式：
public static final 数据类型 常量名称 = 数据值;
注意：
1.一旦使用final关键字修饰，说明不可以改变
2.接口中可以省略这三个关键字，但是不写也是这样的
3.接口中的常量，必须进行赋值，不能不赋值
4.接口中常量的名称，使用完全大写的字母，用下划线进行分隔。
 */
public interface MyInterfaceConst {
    // 其实就是一个常量，一旦赋值，不可以修改
    public static final int NUM = 10;
}
