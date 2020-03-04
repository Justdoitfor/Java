package practice.Private;
/*
对于基本类型中boolean类型的值，Getter方法一定要写成
isXX形式，而setXX规则不变
 */
public class Student {

    private String name;
    private int age;
    private boolean male;

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

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }




}
