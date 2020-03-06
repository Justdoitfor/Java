package practice.Arrays;

import practice.basicPractice.Array;

import java.util.Arrays;

/*
java.util.Arrays 是一个与数组相关的工具类，里面提供了大量的静态方法，用于实现常见操作
public static String toString(数组)：将参数变成字符串（按照默认格式：[元素1，元素2...]）
public static void sort(数组),按照默认升序（从小到大）对数组进行排序
备注；
1.如果是数字，默认按小到大升序
2.如果是字符串，默认按照字母升序
3.如果是自定义类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持

 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        // 将int[]数组按照默认格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1 = {1, 4, 2, 9, 6, 7, 10};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));


    }
}
