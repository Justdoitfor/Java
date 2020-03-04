package practice.Private;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("test");
        student.setAge(28);
        student.setMale(true);
        System.out.println("我叫："+student.getName()+" 年龄"
        +student.getAge()+" 是"+student.isMale()+" 男人！");
    }
}
