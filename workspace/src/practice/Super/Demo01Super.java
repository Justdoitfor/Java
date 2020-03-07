package practice.Super;

public class Demo01Super {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
        zi.methodZi();  // 子类方法中调用了父类中的num 即super.num
    }
}
