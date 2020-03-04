package practice.basicPractice;
/*
定义一个类，模拟学生，包括两个组成部分：
属性（成员变量）：姓名（String name）、年龄(int age)
行为（成员方法）：吃饭、睡觉、学习
注意：成员方法不写static关键字
 */
public class Student {
    // 成员变量
    String name = "wang"; // 姓名
    int age = 20; //年龄
    // 吃饭（成员方法）
    public  void eat(){
        System.out.println("吃饭！");
    }
    // 睡觉
    public void sleep(){
        System.out.println("睡觉！");
    }
    // 学习
    public void study(){
        System.out.println("学习！");
    }

}
