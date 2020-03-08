package practice.Interface.Private;

public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfacePrivateB.methodStatic1();
        MyInterfacePrivateB.methodStatic2();
        System.out.println("------------------");
        MyInterfacePrivateAImpl impl = new MyInterfacePrivateAImpl();
        impl.methodDefault1();
        impl.methodDefault2();
    }
}
