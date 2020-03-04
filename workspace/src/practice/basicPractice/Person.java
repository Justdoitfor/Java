package practice.basicPractice;

public class Person {
    String name;
    private int age;
    public void show(){
        System.out.println("我叫："+name+" 年龄："+age);
    }
    // 该成员方法，专门用于向age设置数据
    public void setAge(int num){
        if (num <110 &&num >=0){ // 合理情况
            age = num;
        }
        else // 数据异常情况
            System.out.println("数据不合理！！！");
    }
}
