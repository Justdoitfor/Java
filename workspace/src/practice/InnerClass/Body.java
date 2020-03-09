package practice.InnerClass;

public class Body { // 外部类 Body

    public class Heart{  // 成员内部类 Heart
        public void methodHeart(){
            System.out.println("内部类方法！");
            System.out.println("我叫："+ getName());  // （内用外）正确写法
        }
    }

    // 外部类成员变量
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodBody(){
        System.out.println("外部类方法！");
        Heart heart = new Heart();
        heart.methodHeart();
    }
}
