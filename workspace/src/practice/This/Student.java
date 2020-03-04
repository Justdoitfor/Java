package practice.This;
/*
构造方法：专门用于创建对象的方法，当我们通过关键字new
来创建对象时，其实就是在调用构造方法
格式；
public 类名称（参数类型 参数名称）{
    方法体
}
注意事项：
1.构造方法的名称必须和所在的类名必须完全一样，就连大小写也必须一样
2.构造方法不要写返回值类型，连void都不写
3.构造方法不能return一个返回值
4.如果没有编写任何构造方法，那么编译器将会默认赠送一个
构造方法，没有参数、方法体什么都不做
5.一旦编写了至少一个构造方法，那么编译器不赠送
6.构造方法也可以重载
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
