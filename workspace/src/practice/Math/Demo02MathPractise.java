package practice.Math;
/*
题目；
计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个
 */
public class Demo02MathPractise {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int count = 0;  // 计数器
        for (int i = (int)min; i < max; i++) { // int强制转换为整数
            int abs = Math.abs(i);  // 绝对值
            if (abs >6 || abs <2.1){
                System.out.print(i+" ");  // 打印符合条件的整数值
                count++;
            }
        }
        System.out.println("\nCounter: "+count);
    }
}
