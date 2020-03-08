package practice.Upcast.Instance;

/*
向上转型一定是安全的，正确的。但是一定有一个弊端
对象一旦向上转型为父类，那么就无法调用子类原本特有的内容
解决方案：
用对象的向下转型【还原】
 */
public class Demo01Main {
    public static void main(String[] args) {
        // 对象的向上转型就是：父类引用指向子类对象
        System.out.println("-------向上转型------------");
        Animal animal = new Cat();
        animal.eat();  // 猫吃鱼！
//        animal.behaviour();  // 错误写法

        System.out.println("-------向下转型，还原动作---------");
        Cat cat = (Cat)animal;
        cat.behaviour();

        System.out.println("-------错误的向下转型---------");
        // new 的是一只猫，现在非要当作狗,发生类转换异常（ClassCastException）
//        Dog dog = (Dog)animal; // 错误写法，编译不会报错，运行会异常
//        ((Dog) animal).behaviour();

        System.out.println("-------常规方法---------");
        Cat test = new Cat();
        test.behaviour();

    }
}
