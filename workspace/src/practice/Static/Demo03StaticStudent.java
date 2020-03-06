package practice.Static;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        // 首先设置教室，这是静态的，应通过类名称进行调用
        Student.room = "C108";
        Student one = new Student("张三",22);
        System.out.println("one的姓名："+one.getName()+", "+
                "one的年龄："+", "+"one的教室："+Student.room);
        Student two = new Student("李四",24);
        System.out.println("two的姓名："+two.getName()+", "+
                "two的年龄："+two.getAge()+", "+"two的教室："+Student.room);
    }
}
