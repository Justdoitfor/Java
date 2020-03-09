package practice.ClassAsMember;

// 游戏中的角色类
public class Hero {

    private Settings settings; // 设置
    public Hero() {
    }

    public Hero(Settings settings) {
        this.settings = settings;
    }

    public void information(){
        System.out.println("英雄："+getSettings().getName());
        System.out.println("年龄："+getSettings().getAge());
        System.out.println("武器："+getSettings().getWeapon());
        System.out.println("职业："+getSettings().getCareer());
        System.out.println("攻击距离："+getSettings().getAttackDistance());
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }
}
