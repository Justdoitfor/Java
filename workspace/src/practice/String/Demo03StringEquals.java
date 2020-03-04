package practice.String;
/*
== 进行的是对象的地址值比较，如果确实需要字符串内容比较，有两个方法：
public boolean equals(Object obj):参数可以是任何对象，
只有参数是一个字符串并且内容相同才返回true，否则返回false
备注：
任何对象都能用Object进行接收。
 */
public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2)); // true
        System.out.println(str2.equals(str3)); // true
        System.out.println(str3.equals("Hello")); // true ,不推荐，易发生空指针异常
        System.out.println("Hello".equals(str1)); // true
        String str4 = "hello";
        System.out.println(str1.equals(str4));// false
    }
}
