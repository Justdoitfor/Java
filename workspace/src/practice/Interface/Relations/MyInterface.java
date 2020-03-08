package practice.Interface.Relations;
/*
这个接口中有 4 个方法
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB{
    public abstract void method();

    @Override
    default void methodDefault() {

    }
}
