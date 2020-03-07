package practice.Interface.Static;
/*
接口中允许定义静态方法
public static 返回值类型 方法名（参数列表）{...}
提示：
即是abstract、default换成static，带上方法体
 */
public interface MyInterfaceStatic {
    public static void methodStatic(){
        System.out.println("该接口的静态方法！");
    }
}
