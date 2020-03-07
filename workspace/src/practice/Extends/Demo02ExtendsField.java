package practice.Extends;
/*
父子类继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方法
1.直接通过子类对象访问成员变量：
    = 左边是谁，就优先访问谁，没有则向上找
2.间接通过成员方法访问成员变量
    方法属于谁就优先使用谁，没有则向上找

 */
public class Demo02ExtendsField {
    public static void main(String[] args) {
        Fu fu =new Fu(); //创建父类对象
        System.out.println(fu.numFu); //10 只能使用父类的东西
        System.out.println("----------------");
        Zi zi = new Zi(); //创建子类对象
        System.out.println(zi.numZi); //20
        System.out.println(zi.numFu); //10 子类可以使用父类的东西
        System.out.println("----------------");
        //
        System.out.println(zi.num); // 50
        System.out.println("----------------");
        zi.methodZi(); // 50
        System.out.println("----------------");
        zi.methodFu(); //该方法在父类定义 ，30

    }
}
