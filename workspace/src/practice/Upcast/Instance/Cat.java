package practice.Upcast.Instance;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼！");
    }
    public void behaviour(){
        System.out.println("抓老鼠咯！");
    }
}
