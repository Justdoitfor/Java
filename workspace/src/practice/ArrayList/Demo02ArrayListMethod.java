package practice.ArrayList;

import java.util.ArrayList;

/*
ArrayList当中的常用方法：
public boolean add(E e):向集合中添加元素，参数类型和泛型一致,返回值代表是否成功
public E remove(int index):从集合中获取元素，参数是索引编号，返回值是被删掉的元素
public E get(int index):从集合中获取元素，参数是索引编号，返回值是对应位置的元素
public int size():获取集合的尺寸长度，返回值是集合中包含的元素个数
 */
public class Demo02ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        System.out.println("===================");
        boolean su = list.add("柳岩");
        System.out.println(list);
        System.out.println("添加的动作是否成功："+ su);

        System.out.println("===================");
        list.add("贾乃亮");
        list.add("赵又廷");
        list.add("高圆圆");
        System.out.println(list);

        System.out.println("===================");
        String name = list.get(2);
        System.out.println("第2号索引位置："+name);

        System.out.println("===================");
        list.remove(2);
        System.out.println("已删除第2号索引位置元素 "+name);
        System.out.println(list);

        System.out.println("===================");
        System.out.println("向2号索引位置添加元素");
        list.add(2,"赵又廷");
        System.out.println(list);
        System.out.println("===================");
        int size = list.size();
        System.out.println("集合的长度是："+size);
    }
}
