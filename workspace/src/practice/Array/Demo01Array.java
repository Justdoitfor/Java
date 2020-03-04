package practice.Array;
/*
定义一个数组，用来存储3个Person对象。
数组有一个缺点，一旦创建，程序运行期间，长度不可以发生改变。
 */
public class Demo01Array {
    public static void main(String[] args) {
        // 首先创建一个长度为3 的数组，里面用来存放Person类型的对象
        Person[] array = new Person[3];
        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎",19);
        Person three = new Person("马儿扎哈",25);

        array[0] = one; // 将one中的地址值赋值到0号元素位置
        array[1] = two; // 将two中的地址值赋值到1号元素位置
        array[2] = three; // 将three中的地址值赋值到2号元素位置

        System.out.println(array[0]); // 地址值
        System.out.println(array[1]); // 地址值
        System.out.println(array[2]); // 地址值

        System.out.println("我叫："+array[0].getName()+"  年龄："+array[0].getAge()); // 迪丽热巴 18
        System.out.println("我叫："+array[1].getName()+"  年龄："+array[1].getAge()); // 古力娜扎 19
        System.out.println("我叫："+array[2].getName()+"  年龄："+array[2].getAge()); // 马儿扎哈 25

    }
}
