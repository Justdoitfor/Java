package practice.Extends.Override;
/*
方法覆盖重写的注意事项：
1.必须保证子类之间方法名称相同，参数列表也一样
@override：写在方法前面，用来【检测】是不是有效的正确的覆盖重写
这个注释就算不写，只要满足要求，也是正确的方法覆盖重写
2.子类方法里面的返回值必须【小于等于】父类方法的返回值范围
Object类是所有类的公共最高父类（祖宗类），java.lang.String就是Object的子类
3.子类方法的权限必须【大于等于】父类方法的权限修饰符
public > protected > (default) > private
(备注)：（default）不是关键字default，而是什么都不写，留空
 */
public class Demo01Override {
}
