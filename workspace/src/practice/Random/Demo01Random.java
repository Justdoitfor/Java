package practice.Random;

import java.util.Random;

/*
Random类用来生成随机数字
1.导包
import java.util.Random;
2.创建
Random r = new Random();
3.使用
获取一个随机的数字int（范围是int的所有范围，有正负两种）
int num = r.nextInt();
获取一个随机int数字（参数代表了范围，左闭右开）；
int num = r.nextInt(3);
 */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是："+num);
        System.out.println("=============");
        Random r2 = new Random();
        int num2 = r2.nextInt(10); // 限定范围0-9
        System.out.println("随机数是（范围：0-9）："+num2);
    }
}
