package practice.Interface.Extends;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{

    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法！");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法！");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了A、B接口都有的抽象方法！");
    }
}
