package practice.String;
/*
字符串常量池：程序中直接写上的双引号字符串，就在字符串常量池中。

对于基本类型来说，== 是进行【数值】比较
对于引用类型来说，== 是进行【地址值】比较
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";


        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2); // true 数值比较
        System.out.println(str1 == str3); // false 地址比较
        System.out.println(str2 == str3); // false 地址比较
    }
}
