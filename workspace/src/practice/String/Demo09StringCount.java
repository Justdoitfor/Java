package practice.String;

import java.util.Scanner;

/*
题目：
键盘输入一个字符串，并且统计其中各种字符出现次数
种类有：大写字母、小写字母、数字、其它
 */
public class Demo09StringCount {
    // 统计方法
    public static void Count(String str){
        int CountUper = 0;
        int CountLower = 0;
        int CountNum = 0;
        int CountElse = 0;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char ch = array[i]; // 定义当前单个字符
            if (ch >= 'A' && ch <= 'Z'){ // ASCII 码值比较，覆盖大写字母范围
                CountUper ++;
            }
            else if(ch >= 'a' && ch <= 'z'){ // ASCII 码值比较，覆盖小写字母范围
                CountLower ++;
            }
            else if (ch >= '0' && ch <= '9'){ // ASCII 码值比较，覆盖数字范围
                CountNum ++;
            }
            else {  // 其他字符
                CountElse ++;
            }
        }
        System.out.println("大写字母出现次数："+CountUper);
        System.out.println("小写字母出现次数："+CountLower);
        System.out.println("数字出现次数："+CountNum);
        System.out.println("其它字符出现次数："+CountElse);
    }
    public static void main(String[] args) {
        System.out.println("输入所需测试字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Count(str);
    }
}
