package practice.ArrayList;

import java.util.ArrayList;
/*
如果希望向ArrayList集合中存储基本数据类型，必须使用基本数据类型对应的"包装类"
基本类型        包装类（引用类型，位于java.lang包下）
byte            Byte
short           Short
int             Integer
long            Long
float           Float
double          Double
char            Character
boolean         Boolean
 */

public class Demo04ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        // 泛型只能是引用类型，不能是基本类型
//        ArrayList<int> listB = new ArrayList<int>(); // 错误写法
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(100);
        listB.add(200);
        System.out.println(listB); // [100, 200]
        System.out.println("====================");
        int num = listB.get(1);
        System.out.println("第1号元素："+num);
    }
}
