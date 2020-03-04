package practice.String;

/*
java.lang.String类代表字符串
API中：java程序中的所有字符串字面值（如"abc"）都作为此类的实例实现
也就是说，程序中所有双引号字符串，都是String类的对象。就算没有new
字符串特点：
1.字符串内容永不可变【重点】
2.字符串可以共享使用
3.字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组

构造方法：
public String();创建一个空白字符串，不含任何内容
public String(char[] array);根据字符串数组的内容，来创建对应的字符串。
public String(byte[] array);根据字字节数组的内容，来创建对应的字符串。
直接创建：String str = "Hello";

 */
public class Demo01String {
    public static void main(String[] args) {
        // 空参创建
        String str1 = new String(); //
        System.out.println("第一个字符串："+str1);
        System.out.println("=================");
        char[] charArray = {'A','B','C'}; // ABC
        String str2 = new String(charArray);
        System.out.println("第二个字符串："+str2);
        System.out.println("=================");
        byte[] byteArray = {65, 98, 99}; //Abc
        String str3 = new String(byteArray);
        System.out.println("第三个字符串："+str3);

    }
}
