package practice.ClassAsMember;

public class DemoMain {

    public static void main(String[] args) {
        // 创建一个英雄角色
        Hero hero = new Hero();
        // 创建角色名称、设置年龄、武器、职业、攻击范围
        Settings settings = new Settings("德玛西亚",24,"多兰剑","战士",25);
        hero.setSettings(settings);
        hero.information();
    }
}

