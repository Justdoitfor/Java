package practice.Anonymous;
/*
匿名对象 ：只有右边的对象，没有左边的名字和赋值运算符。
new 对象名（）；
注意事项：匿名对象只能使用唯一一次，下次使用不得再创建一个新对象
如果确定有一个对象只需使用一次，则可以使用匿名对象


 */
public class Anonymous {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "高圆圆";
        person.showName();
        System.out.println("=================");
        // 匿名对象
        new Person().name = "赵又廷";
        new Person().showName();


    }
}
