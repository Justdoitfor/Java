package practice.String;
/*
字符串截取方法：
public String substring(int index); // 截取从参数位置到结尾，返回新字符串
public String substring(int begin,int end) // 截取从begin开始，到end结束之间的字符串
备注：[begin，end) // 包含左边，不包含右边
 */
public class Demo05Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println("str1 内容："+str1); // HelloWorld
        System.out.println("截取str1 5-结尾 之间字符串："+str2); // World
        System.out.println("=========================");
        String str3 = str1.substring(5, 10);
        System.out.println("截取str1 [5,10) 之间字符串："+str3); // World

        /* 下面两种写法，字符串内容没有改变，strA中保存的是地址值，本来
        地址值为：Hello :0x666, -->  Java : 0x999
        */
        System.out.println("==========================");
        String strA = "Hello";
        System.out.println(strA);  // Hello
        System.out.println("==========================");
        strA = "Java";
        System.out.println(strA); // Java
    }
}
