package practice.InnerClass;

public class Outer2 {
    public void methodOuter() {
        class Inner {  // 局部内部类
            int num = 10;
            public void methodInner(){ // 局部内部类方法
                System.out.println(num);  // 10
            }
        }
        // 只有当前所属的方法( methodOuter() )才能使用它(局部内部类 Inner)，除了这个方法就无法使用
        Inner inner = new Inner();
        inner.methodInner();
    }
}
