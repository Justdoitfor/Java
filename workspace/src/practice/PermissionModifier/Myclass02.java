package practice.PermissionModifier;

public class Myclass02 {

    public void method(){
        System.out.println(new MyClass().num1);
        System.out.println(new MyClass().num2);
        System.out.println(new MyClass().num3);
//        System.out.println(new MyClass().num4);  // private 不能访问
    }
}
