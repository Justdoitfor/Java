package practice.ArrayList;

import java.util.ArrayList;

/*
题目；
自定义4个学生对象，添加到集合，并遍历
 */
public class Demo06ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("古力娜扎",22);
        Student two = new Student("周杰伦",32);
        Student three = new Student("马尔扎哈",25);
        Student four = new Student("麦克雷",21);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名："+list.get(i).getName()+" 年龄："+list.get(i).getAge());
        }

    }
}
