package practice.PermissionModifier.Sub;

import practice.PermissionModifier.MyClass;

public class Stranger {

    public void method(){
        System.out.println(new MyClass().num1);
//        System.out.println(new MyClass().num2);  // protected 不能访问
//        System.out.println(new MyClass().num3);  // default 不能访问
//        System.out.println(new MyClass().num4);  // private 不能访问
    }
}
