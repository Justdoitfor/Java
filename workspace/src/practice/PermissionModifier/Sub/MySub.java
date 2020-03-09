package practice.PermissionModifier.Sub;

import practice.PermissionModifier.MyClass;

public class MySub extends MyClass {

    public void method(){
        System.out.println(super.num1);
        System.out.println(super.num2);
//        System.out.println(super.num3);   // default 不能访问
//        System.out.println(super.num4);   // private 不能访问
    }
}
