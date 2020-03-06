package practice.Static;
/*
一旦使用了static修饰了成员方法，那么这就成为了静态方法静态方法不属于对象，而属于类
如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它
如果有了static关键字，那么不需要创建对象，直接可以通过类名称来使用它

注意：
1.静态不能直接访问非静态
因为内存中【先】有静态内容，【后】有非静态内容。“先人不知后人，后人知先人”
2.静态方法中不能使用 this
this 代表当前对象，通过谁调用的方法，谁就是当前对象
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj=  new MyClass(); // 首先创建对象,然后才能使用没有static关键字的内容
        obj.method();
        System.out.println("==================");
        // 对于静态方法，可以通过对象名进行调用，也可以直接通过类名称调用
        obj.methodStatic();  // 方法一,不推荐
        MyClass.methodStatic(); // 方法二，推荐
    }
}
