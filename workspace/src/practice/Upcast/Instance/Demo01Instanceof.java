package practice.Upcast.Instance;

/*
如何知道一个父类引用的对象，本来是什么子类？
格式；  对象 instanceof 类名称
这将会得到一个Boolean值结果，也就是判断前面的对象不能当作后面类型的实例

 */
public class Demo01Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat(); // 本来是一只猫
//        animal.eat();   // 猫吃鱼！
        GiveMeAPet(animal);
        // 如果需要调用子类特有方法，需要向下转型
    }
    public static void GiveMeAPet(Animal animal){
        if (animal instanceof Cat){
            Animal animal1 = (Cat)animal;
            animal1.eat();
        }
        if (animal instanceof Dog){
            Animal animal1 = (Dog)animal;
            animal1.eat();
        }
    }
}
