package practice.Extends;

public class Fu {
    int numFu = 10;
    int num = 30;  // 父类和子类定义相同的成员变量
    public void methodFu(){
        System.out.println(num);
    }
    public void methodF(){
        System.out.println("父类方法执行！");
    }
    public void methodTest(){
        System.out.println("父类重名方法执行！");
    }

}
