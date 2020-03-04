package practice.basicPractice;

public class PhoneTest {
    public static void main(String[] args) {
        // 根据Phone类创建对象
        Phone phone = new Phone();
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
        System.out.println("===================");

        phone.brand = "Huawei";
        phone.price = 4369;
        phone.color = "黑色";
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
        System.out.println("===================");

        phone.call("James");
        phone.sendMessage();
        System.out.println("===================");
        method(phone);
    }
    public static void method(Phone p){
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p.color);
    }
}
