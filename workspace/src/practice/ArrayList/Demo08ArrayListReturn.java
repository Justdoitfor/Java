package practice.ArrayList;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中
要求使用自定义方法实现筛选。
 */
public class Demo08ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100);
            list.add(num);
        }
        getSmallList(list);
    }
    public static void getSmallList(ArrayList<Integer> list){
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 ==0){
                list2.add(list.get(i));
            }
            else
                list3.add(list.get(i));
        }
        System.out.println(list2);
        System.out.println("=======================");
        System.out.println(list3);
    }
}
