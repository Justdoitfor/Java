package practice.Interface.Abstract;
/*
在任何版本java中，接口都能定义抽象方法
格式：
public abstract 返回值类型 方法名称（参数列表）；
注意事项：
1.接口中的抽象方法，修饰符必须是两个固定关键字：public、abstract
2.这两个修饰符可以 选择性省略

 */
public interface MyInterfaceAbstract {
    public abstract void methodAbs1(); // 一个抽象方法
    abstract void methodAbs2(); // 也是一个抽象方法
    public void methodAbs3();  // 也是一个抽象方法
    void methodAbs4();  // 也是一个抽象方法
}
