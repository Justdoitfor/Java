package practice.basicPractice;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        person.name = "James Bran";
//        person.age = -20; // 直接访问private修饰内容，错误写法！
        person.setAge(20);
        person.show();
    }
}
