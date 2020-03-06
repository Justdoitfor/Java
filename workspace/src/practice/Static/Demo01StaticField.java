package practice.Static;
/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己
而是属于所在类，所有对象共享一份数据
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("张三", 20);
        Student two = new Student("李四", 22);
        one.room = "103room";
        System.out.println("ID: "+one.getID()+", "+"name: "+one.getName()+", " +"age: "+one.getAge()
        +", "+"room: "+one.room);
        System.out.println("ID: "+two.getID()+", "+"name: "+two.getName()+", " +"age: "+two.getAge()
                +", "+"room: "+two.room); // 虽然只对one对象定义了room值，但是用了static方法，所以two也能共享
    }
}
