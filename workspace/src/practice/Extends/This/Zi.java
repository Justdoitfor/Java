package practice.Extends.This;
/*
super关键字用来访问父类内容，而this关键字用来访问本类内容
用法：
1.在本类成员方法中，访问本类成员变量
2.在本类成员方法中，访问本类另一个成员变量
3.在本类构造方法中，访问本类另一个构造方法
注意；
this(...) 调用也必须是构造方法的第一个语句，唯一一个
super和this两种构造不能同时使用
 */
public class Zi extends Fu{
    int num = 20;
    public Zi(){
        this(123);  // 本类的无参构造，调用本类有参构造
    }
    public Zi(int n){

    }
    public void showNum(){
        int num = 10;
        System.out.println(num);  // 局部变量 10
        System.out.println(this.num); // 本类中成员变量 20
        System.out.println(super.num); // 父类中的成员变量 30
    }
    public void methodA(){
        System.out.println("AAA");
    }
    public void methodB(){
        this.methodA();
        System.out.println("BBB");
    }
}
