package practice.Upcast.Instance;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头！");
    }
    public void behaviour(){
        System.out.println("狗打滚！");
    }
}
