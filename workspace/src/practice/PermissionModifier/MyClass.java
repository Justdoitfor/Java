package practice.PermissionModifier;

public class MyClass {
    public int num1 = 40; // public
    protected int num2 = 30; // protected
    int num3 = 20;      // default
    private int num4 = 10;  // private


    public void method(){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}
