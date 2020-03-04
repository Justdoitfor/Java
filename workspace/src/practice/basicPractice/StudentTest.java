package practice.basicPractice;
/*
通常一个类不能直接使用，需要根据类创建一个对象才能使用。
1.导包：指出需要使用的类的位置
import 包名.类名；
import com.example.wang.Student;
对于和当前类属于同一包情况可以省略导包语句
2.创建格式：
类名 对象名 = new 类名（）；
Student stu = new Student();
3.使用，分为两类：
使用成员变量，对象名.成员变量名；
使用成员方法，对象名.成员方法（参数）
注意事项：
如果成员变量没有进行赋值，将会有一个默认值，规则同数组
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.eat();
        stu.sleep();
        stu.study();
        System.out.println(stu.name);
        System.out.println(stu.age);
    }
}
