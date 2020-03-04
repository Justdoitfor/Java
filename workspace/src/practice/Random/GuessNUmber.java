package practice.Random;

import java.util.Random;
import java.util.Scanner;

/*
题目；
代码模拟猜数字游戏
首先产生一个随机数，Random方法产生
键盘输入，Scanner
获取键盘输入
if判断
while循环
 */
public class GuessNUmber {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        int i = 0;  // 统计已使用的次数，每执行一次操作计数器+1；
        int times = 10; // 统计剩余的次数,每执行一次操作计数器-1；
        while (times > 0){
            System.out.println("please enter your number('"+times+"' times left):");
            int guessNum = sc.nextInt(); //键盘输入的数字
            if (guessNum > num){ // 所猜数字大于生成的数字
                System.out.println("Too big! Try again.");
                times--;
                i++;
            }
            else if (guessNum < num){ // 所猜数字小于生成的数字
                System.out.println("Too small! Try again.");
                times--;
                i++;
            }
            else{ // 猜对结果，break结束。
                System.out.println("Congratulations! You got the right number.");
                i++;
                System.out.println("\nYou used "+i+" times to get the right number.");
                break; // 如果猜中，游戏结束。
            }
            if (times==0){ // 10次游戏次数用完，游戏自动结束
                System.out.println("\nSorry，You have used all 10 times.");
            }
        }
    }
}
