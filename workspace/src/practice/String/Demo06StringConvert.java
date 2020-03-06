package practice.String;
/*
String 中与转换相关的常用方法：
public char[] toCharArray(); // 将当前字符串拆分为字符数组作为返回值
public byte[] getBytes(); // 获取当前字符串底层的字节数组
public String replace(CharSequence oldString,CharSequence newString);
// 将所有出现的老字符串替换为新的字符串，返回替换之后的结果的新的字符串
备注：Charsequence 意思是可以接收字符串类型。
 */
public class Demo06StringConvert {
    public static void main(String[] args) {
        // 转换为字符数组
        char[] chars = "Hello".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println(chars.length);
        System.out.println("=========================");

        // 转换为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println(bytes.length);
        System.out.println("===========================");

        // 字符串的内容替换
        String str = "oldtest";
        String str2 = str.replace("old","new");  // "newtest"
        System.out.println("\"oldtest\"替换之前："+str);
        System.out.println("\"oldtest\"替换之后："+str2);

        System.out.println("===========================");
        // 实际使用案例
        String userLanguage = "会不会玩呀，你大爷的！";
        String replaceLanguage = userLanguage.replace("大爷","**");
        System.out.println(replaceLanguage);

    }
}
