package practice.Final;
/*
final 代表最终、不可改变的
1.可以用来修饰一个类
2.可以用来 修饰一个方法
3.可以用来修饰一个局部变量
4.可以用来修饰一个成员变量
 */
public class Demo01Final {
    final int num1 = 30;
    public static void main(String[] args) {
        final int num = 10;
        System.out.println(num);
//        int num = 20;  // 错误写法，不能改变final修饰的局部变量

    }
}
