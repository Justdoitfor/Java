package practice.basicPractice;
/*
属性：品牌、价格、颜色
行为：打电话、发短信
 */
public class Phone {
    String brand; // 品牌
    double price; // 价格
    String color; // 颜色
    public void call(String name){
        System.out.println("给"+name+"打电话！");
    }
    public void sendMessage(){
        System.out.println("群发短信！");
    }

}
