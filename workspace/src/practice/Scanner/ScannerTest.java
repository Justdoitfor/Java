package practice.Scanner;

import java.util.Scanner;

/*
Scanner类的功能：可以实现键盘输入数据到程序中
引用类型的一般使用步骤：
1.导包
import 包路径.类名称；
如果需要使用的目标类和当前类位于同一个包下，
则可以省略不写。只有java.long包下的内容不需要导包，其他的包都需要import语句。
2.创建
类名称 对象名 = new 类名称（）；
3.使用
对象名.成员方法名（）；
获取键盘输入的int数字，int num = sc.nextInt();
获取键盘输入的一个字符串：String str = sc.next();
 */
public class ScannerTest {
    //从键盘输入两个数，并且求出其和
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int a = sc.nextInt();
        System.out.println("Please enter the second number:");
        int b = sc.nextInt();
        System.out.println(a+" + "+b+" = "+ (a+b));
    }
}
