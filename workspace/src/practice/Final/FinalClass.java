package practice.Final;

/*
当final关键字用来修饰一个类的时候，其所有成员方法无法被覆盖重写
格式：
public final class ClassName{...}
含义：当前这个类不能有任何子类，也就是说不能用一个final类作为父类
 */
public final class FinalClass {
    public void mehtod(){
        System.out.println("方法执行！");
    }
}
