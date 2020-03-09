package practice.InnerClass;

/*
如果一个事物内部包含另一个事物，那么这也就是一个类内部包含另一个类。
例如；身体和心脏关系（心脏脱离人体不能单独使用）
分类：
1.成员内部类
2.局部内部类（包含匿名内部类）

成员内部类定义格式：
修饰符 class 外部类名称{
    修饰符 class 内部类名称{
        //...
    }
    // ...
}
注意：内用外【随意使用】，外用内【需要借助内部类对象】

局部内部类定义格式：
修饰符 class 外部类名称{
    修饰符 返回值类型 外部类方法名称(参数列表){
        class 内部类名称{
            //...
        }
    }
    // ...
}
====================================
如何使用成员内部类？
1.间接方式：在外部类的方法中，使用内部类，然后main只是调用外部类的方法
2.直接方式：外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
如何使用局部内部类？
如果一个内部类定义在一个方法内部，那么这就是一个局部内部类
【局部】：只有当前所属的方法才能使用它，除了这个方法就无法使用
在局部内部类所属方法中创建局部内部类对象使用
用例；
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

成员修饰符：
1.外部类：public / (default)
2.成员内部类：public / protected / (default) / private
3.局部内部类：什么都不写

 */
public class Demo01InnerClass {

    public static void main(String[] args) {
        Body body = new Body();  // 外部类的对象
        body.setName("Jackey");
        body.methodBody();// 通过外部类的对象，调用外部类方法，里面间接使用内部类Heart
        System.out.println("---------------------");

        // 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        Body.Heart heart = new Body().new Heart();
        heart.methodHeart();
        System.out.println("----------------------");

        // 外部类名称.this.外部类成员变量
        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();
        System.out.println("----------------------");

        // 局部内部类使用
        Outer2 outer2 = new Outer2();
        outer2.methodOuter();
    }
}
