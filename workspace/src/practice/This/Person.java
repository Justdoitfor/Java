package practice.This;
/*
当方法的局部变量和类的成员变量重名时，根据”就近原则“，
优先使用局部变量，如果需要访问本类中成员变量，需要使用格式
this.成员变量
 */
public class Person {
    String name;
    public void sayHello(String name){
        System.out.println(name+", 你好！我是 "+this.name);
    }
}
