package practice.Interface.Default;

public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();
        a.methodDefault();  // 调用默认方法
        System.out.println("---------------------");
        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}
