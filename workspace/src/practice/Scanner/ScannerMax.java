package practice.Scanner;

import java.util.Scanner;

/*
题目：从键盘输入三个int数字，然后求出其中最大值


 */
public class ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the first number :");
        int a = sc.nextInt();
        System.out.println("please enter the second number :");
        int b = sc.nextInt();
        System.out.println("please enter the third number :");
        int c = sc.nextInt();
        int max1 = a>b?a:b; // 计算a、b中较大的赋值给max1
        int max = max1>c?max1:c; // 计算max1、c中较大的赋值给max
        System.out.println("max: " + max);
    }
}
