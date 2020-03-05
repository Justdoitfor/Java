package practice.String;

/*
题目：
定义一个方法：把数组[1,2,3]按照指定格式合并拼接成一个字符串。格式参照如下
[worl1#world2#world3]
 */
public class Demo08StringPractise {

    // 自定义数组转换方法

    public static String fromArraytoString(int[] array) {
        String str = "["; // 返回的格式括号"["
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) { // 判断为最后一个数组元素时，添加 world 和 右括号，即"world3]"
                str += "world" + array[i] + "]";
            } else {
                str += "world" + array[i] + "#";
            }
        }
        return str;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};  // 定义测试数组{1，2，3}
        String result = fromArraytoString(array);
        System.out.println(result);
    }
}
