package practice.InterfaceAsParameterOrReturn;

import java.util.ArrayList;
import java.util.List;

// java.util.List 正是ArrayList 所实现的接口

public class DemoInterface {
    public static void main(String[] args) {
        // 左边是接口名称，右边是实现类名称，多态写法
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list) {
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        return list;
    }
}
