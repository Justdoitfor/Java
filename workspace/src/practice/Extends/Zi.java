package practice.Extends;

public class Zi extends Fu{
    int numZi = 20;
    int num = 50;  // 父类和子类定义相同的成员变量
    public void methodZi(){
        System.out.println(num);
    }
    public void method(){
        int num = 70;
        System.out.println(num); // 70 局部变量
        System.out.println(this.num); // 50 本类成员变量
        System.out.println(super.num); // 30 父类成员变量
    }
    //-------------------------------------------
    public void methodZ(){
        System.out.println("子类方法执行！");
    }
    public void methodTest(){
        System.out.println("子类重名方法执行！");
    }
}
