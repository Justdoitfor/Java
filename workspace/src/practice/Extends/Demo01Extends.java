package practice.Extends;
/*
在继承的关系中，“子类就是一个父类”，也就是说，子类可以被当作父类看待。
例如：父类是员工，子类是讲师，那么“讲师就是一个员工”

定义格式：
父类：public class 父类名称{...}
子类：public class 子类名称 extends 父类名称{...}
 */
public class Demo01Extends {
    public static void main(String[] args) {
        // 创建一个Teacher子类对象
        Teacher teacher = new Teacher();
        teacher.method(); // Teacher 类中没有写任何方法，但可以使用父类方法
        System.out.println("--------------------");
        // 创建一个Assistant子类对象
        Assistant assistant = new Assistant();
        assistant.method(); // Assistant 类中没有写任何方法，但可以使用父类方法
    }
}
