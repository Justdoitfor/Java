package practice.Static;

/*
静态代码块格式：
public class ClassName{
    static{
        // 静态代码块的内容
    }
}

特点：当第一次使用到本类时，静态代码块实行唯一的一次。
静态内容总是优先于非静态，所以静态代码块比构造方法先执行
静态代码块的典型用途：用来一次性地对成员变量进行赋值
 */
public class Demo04Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();  // 此次不再执行静态代码块
    }
}
