package practice.ArrayList;

import java.util.ArrayList;

/*
定义以指定格式打印集合的方法（ArrayList类型作为参数），
使用{}扩起集合，使用*分割每个元素
格式参照：{元素*元素*元素...}
 */
public class Demo07ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张四丰");
        list.add("张五丰");
        list.add("张六丰");
        System.out.print("//未修改格式之前的输出形式:  "+list+"\n"); // 未修改格式之前的输出形式
        System.out.println("==================================");
        System.out.print("//修改格式之后的输出形式： ");
        printArrayList(list);     // 修改格式之后的输出形式(调用printArrayList())


    }
    /*
    定义方法三要素：
    返回值类型：只是进行打印而已，没有运算，没有结果，所以用void
    方法名称：printArrayList
    参数列表：ArrayList
     */
    public static void printArrayList(ArrayList<String > list){
        System.out.print("{"); // 打印第一个 "{"
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i < list.size()-1){ // 打印除了最后一个元素外的元素格式
                System.out.print(name+"*");
            }
            else // 打印最后一个元素以及 "}"
                System.out.print(name+"}");

        }
    }
}
