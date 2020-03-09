package practice.ClassAsMember;

public class Settings {
    private String name;    // 英雄角色
    private int age;        // 英雄年龄
    private String weapon;  // 所用武器
    private String Career;  // 英雄职业
    private int attackDistance; //英雄攻击范围

    public Settings() {
    }

    public Settings(String name, int age, String weapon, String career, int attackDistance) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        Career = career;
        this.attackDistance = attackDistance;
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

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getCareer() {
        return Career;
    }

    public void setCareer(String career) {
        Career = career;
    }

    public int getAttackDistance() {
        return attackDistance;
    }

    public void setAttackDistance(int attackDistance) {
        this.attackDistance = attackDistance;
    }

}
