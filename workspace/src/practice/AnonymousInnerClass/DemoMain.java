package practice.AnonymousInnerClass;

/*
如果接口的实现类（或者是父类的子类）只需使用一次，那么这种情况下可以
省略掉该类定义，而改为使用【匿名内部类】
格式：
接口名称 对象名 = new 接口名称(){
    // 覆盖重写所有抽象方法
};  //注意分号不要忘记

解析:
new 接口名称(){...};
1.new 代表创建对象的动作
2.接口名称就是匿名内部类需要实现哪个接口
3.{...} 匿名内部类的内容

注意：
1.匿名内部类在创建的对象的时候只能使用【唯一一次】，如果【希望多次创建对象】
而且内容一样，那么必须使用一个单独定义的【实现类】
2.匿名对象在【调用方法】的时候，只能调用唯一一次，如果【希望同一对象调用多次方法】
那么必须给对象起名字
3.匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】
 */
public class DemoMain {
    public static void main(String[] args) {

        System.out.println("--------使用实现类--------");
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.method();

        System.out.println("--------使用匿名内部类--------");
        // 使用该方法无需创建实现类
        MyInterface myInterface1 = new MyInterface() {
            @Override
            public void method() {
                System.out.println("实现类覆盖重写了方法！");
            }
        };
        myInterface1.method();
    }

}
