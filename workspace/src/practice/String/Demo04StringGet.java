package practice.String;
/*
String当中与获取相关的常用方法有：
public int length(); 获取字符串中含有的字符串个数，得到字符串长度
public String concat(String str);将当前字符串和参数字符串拼接成为返回值新的字符串
public char charAt(int index); 获取指定索引位置的单个字符（索引从0开始）
public int indexOf(String str); 查找参数字符串在本字符串中首次出现的索引位置，如果没有则返回-1
 */
public class Demo04StringGet {
    public static void main(String[] args) {
        int length = "dsfakfljklfhoihbsajkfhjkldsfas".length();
        System.out.println("length:"+length);
        System.out.println("=================");
        String str1 = "Hello,";
        String str2 = "Java!";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("=================");
        char ch = str1.charAt(4);
        System.out.println("在4号位置的字符是："+ ch);
        System.out.println("=================");
        int index = str3.indexOf("Ja");
        System.out.println("\"Ja\"索引值是："+index);
        System.out.println(str3.indexOf("test"));


    }
}
