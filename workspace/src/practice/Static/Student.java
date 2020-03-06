package practice.Static;

public class Student {
    private int ID; // 学号
    private String name; // 姓名
    private int age; // 年龄
    static String room; //教室
    private static int idCounter = 0; // 学号计数器

    public Student() {
        this.ID = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = ++idCounter;  // 自动学号递增
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
