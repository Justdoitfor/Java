package practice.Interface.Default;

/*
public default 返回值类型 方法名（参数列表）{...}
1.接口默认方法，可以通过接口实现类对象直接调用
2.接口默认方法，也可以被接口实现类进行覆盖重写
可用于接口更新升级问题
 */
public interface MyInterfaceDefault {
    // 抽象方法
    public abstract void methodAbs();
//  public abstract void methodAbs2(); //添加此抽象方法后，已投入使用的MyInterfaceDefaultA、MyInterfaceDefaultB不应发生变动
//  因而使用接口默认方法
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法！");
    }
}
