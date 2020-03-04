package practice.ArrayList;

import java.util.ArrayList;

/*
数组长度不可以改变，但是ArrayList可以随意变化
对于Arraylist来说，有一个尖括号 <E> 代表泛型

泛型：装载集合中的所有元素，全部都是统一的类型
注意：泛型只能是引用类型，不能是基本类型
    对于ArrayList来说，直接打印得到的不是地址值而是内容。
    如果内容为空，得到的是空的中括号 []
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []
        System.out.println("=============");

        // 向集合中添加数据需用到add方法。
        list.add("赵丽颖");
        list.add("迪丽热巴");
        list.add("马尔扎哈");
        list.add("古力娜扎");
        System.out.println(list);
    }
}
