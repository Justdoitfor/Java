package practice.InnerClass;

/*
如果出现了重名现象，那么格式为；
【外部类名称.this.外部类成员变量】
 */
public class Outer {

    int num = 10; // 外部类成员变量

    public class Inner {

        int num = 20;  // 内部类成员变量

        public void methodInner() {
            int num = 30;  // 内部方法成员变量
            System.out.println(num);  // 30 局部变量，就近原则
            System.out.println(this.num);  // 20 内部类成员变量
//            System.out.println(super.num);  // 错误写法！因为【内部类】和【外部类】【不是】继承关系
            System.out.println(Outer.this.num);  // 10 正确写法！外部类成员变量
        }
    }
}
