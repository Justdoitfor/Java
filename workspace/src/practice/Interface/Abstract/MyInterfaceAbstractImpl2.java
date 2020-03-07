package practice.Interface.Abstract;

// 该实现类未覆盖重写所有接口中的方法，必须使用 abstract 关键字 定义该类
public abstract class MyInterfaceAbstractImpl2 implements MyInterfaceAbstract{
    @Override
    public void methodAbs1() {
        System.out.println("这是第一个方法！");
    }


    @Override
    public void methodAbs3() {
        System.out.println("这是第三个方法！");
    }
}
