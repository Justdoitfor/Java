package practice.Arrays;

import java.util.Arrays;

/*
题目：
请使用Arrays相关的API，将一个随机的字符串中的所有字符升序排列，并倒序打印
 */
public class Demo02ArrayPractise {
    public static void main(String[] args) {
        String str = "fsdlfjalkjfklsdajfkhg4fdsf45as4";
        char[] str2 = str.toCharArray();
        Arrays.sort(str2);
        System.out.print("顺序字符串: ");
        System.out.println(str2);
        for (int i = 0,j=str2.length-1; i < str2.length; i++,j--) {
            char temp = str2[i];
            if (i < j){
                str2[i] = str2[j];
                str2[j] = temp;
            }
        }
        System.out.print("逆序字符串：");
        System.out.println(str2);
    }
}
