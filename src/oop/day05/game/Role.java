package oop.day05.game;

//玩家
public class Role {
    private int id;// ID
    private String name;// 角色
    private int blood;// 血量

    private Weapon weapon;// 武器
    private Armour armour;// 防具

    private Shill shill;// 技能

    public Role() {
        super();
    }

    public Role(int id, String name, int blood) {
        this.id = id;
        this.name = name;
        this.blood = blood;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public Shill getShill() {
        return shill;
    }

    public void setShill(Shill shill) {
        this.shill = shill;
    }

    // 物理攻击
    public void plysicalAttack() {
        System.out.println(name + "使用" + weapon.getName() + "造成了" + weapon.getHurt() + "伤害。");
    }

    // 防御攻击
    public void defense() {
        blood += armour.getProtect();
        System.out.println(name + "穿上了" + armour.getName() + ",生命值为：" + blood);
    }

    // 法术攻击
    public void magicAttack() {
        System.out.println("发动法术攻击");
        shill.releaseShill();// 释放技能
        System.out.println("技能释放完毕");
    }
}
